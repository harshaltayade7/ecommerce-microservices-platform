import React from 'react';
import { BrowserRouter as Router, Routes, Route, Navigate } from 'react-router-dom';
import { AuthProvider } from './context/AuthContext';
import ProtectedRoute from './components/ProtectedRoute';
import routes from './config/routes';
import './App.css';

function App() {
  return (
    <AuthProvider>
      <Router>
        <Routes>
          {routes.map(route => (
            <Route
              key={route.path}
              path={route.path}
              element={
                route.showInMenu ? (
                  <ProtectedRoute>
                    <route.component />
                  </ProtectedRoute>
                ) : (
                  <route.component />
                )
              }
            />
          ))}
          <Route path="/" element={<Navigate to="/login" />} />
        </Routes>
      </Router>
    </AuthProvider>
  );
}

export default App;
