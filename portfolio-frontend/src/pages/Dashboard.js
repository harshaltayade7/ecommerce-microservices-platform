import React from 'react';
import Navbar from '../components/Navbar';

function Dashboard() {
  return (
    <div style={{ background: 'linear-gradient(135deg, #667eea 0%, #764ba2 100%)', minHeight: '100vh' }}>
      <Navbar />
      {/* Dashboard Content */}
      <div className="container mt-5">
        <div className="row justify-content-center">
          <div className="col-12 text-center mb-5">
            <h2 className="text-white">Welcome to Your Dashboard</h2>
            <p className="text-white-50">Manage your ecommerce platform efficiently</p>
          </div>
        </div>
        <div className="row">
          <div className="col-md-4 mb-4">
            <div className="card bg-primary text-white h-100">
              <div className="card-body d-flex flex-column justify-content-center">
                <div className="text-center">
                  <i className="fas fa-dollar-sign fa-3x mb-3"></i>
                  <h5 className="card-title">Total Sales</h5>
                  <p className="card-text display-4">$10,000</p>
                </div>
              </div>
            </div>
          </div>
          <div className="col-md-4 mb-4">
            <div className="card bg-success text-white h-100">
              <div className="card-body d-flex flex-column justify-content-center">
                <div className="text-center">
                  <i className="fas fa-shopping-cart fa-3x mb-3"></i>
                  <h5 className="card-title">Orders</h5>
                  <p className="card-text display-4">150</p>
                </div>
              </div>
            </div>
          </div>
          <div className="col-md-4 mb-4">
            <div className="card bg-info text-white h-100">
              <div className="card-body d-flex flex-column justify-content-center">
                <div className="text-center">
                  <i className="fas fa-users fa-3x mb-3"></i>
                  <h5 className="card-title">Customers</h5>
                  <p className="card-text display-4">200</p>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div className="row mt-5">
          <div className="col-md-6 mb-4">
            <div className="card bg-white text-dark">
              <div className="card-body">
                <h5 className="card-title">Quick Actions</h5>
                <button className="btn btn-primary me-2">Add Product</button>
                <button className="btn btn-secondary">View Reports</button>
              </div>
            </div>
          </div>
          <div className="col-md-6 mb-4">
            <div className="card bg-white text-dark">
              <div className="card-body">
                <h5 className="card-title">Notifications</h5>
                <p className="card-text">No new notifications</p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}

export default Dashboard;