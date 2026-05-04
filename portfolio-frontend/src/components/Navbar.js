import React from 'react';
import { useNavigate } from 'react-router-dom';
import { useAuth } from '../context/AuthContext';
import routes from '../config/routes';

function Navbar() {
  const { logout } = useAuth();
  const navigate = useNavigate();

  const handleLogout = async () => {
    await logout();
    navigate('/login');
  };

  const menuRoutes = routes.filter(route => route.showInMenu);

  const handleNavClick = (path, e) => {
    e.preventDefault();
    navigate(path);
  };

  return (
    <nav className="navbar navbar-expand-lg navbar-dark bg-dark">
      <div className="container-fluid">
        <div className="collapse navbar-collapse" id="navbarNav">
          <ul className="navbar-nav me-auto">
            {menuRoutes.map(route => (
              <li className="nav-item" key={route.path}>
                <a className="nav-link" href="#" onClick={(e) => handleNavClick(route.path, e)}>
                  <i className={`${route.icon} me-2`}></i>
                  {route.name}
                </a>
              </li>
            ))}
          </ul>
          <ul className="navbar-nav">
            <li className="nav-item">
              <button className="btn btn-outline-light" onClick={handleLogout}>Logout</button>
            </li>
          </ul>
        </div>
      </div>
    </nav>
  );
}

export default Navbar;