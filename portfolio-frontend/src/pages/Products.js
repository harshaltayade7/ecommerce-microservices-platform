import React from 'react';
import Navbar from '../components/Navbar';

function Products() {
  return (
    <div style={{ background: 'linear-gradient(135deg, #667eea 0%, #764ba2 100%)', minHeight: '100vh' }}>
      <Navbar />
      {/* Products Content */}
      <div className="container mt-5">
        <div className="row justify-content-center mb-5">
          <div className="col-12 text-center">
            <h2 className="text-white">Our Products</h2>
            <p className="text-white-50">Discover amazing products at great prices</p>
          </div>
        </div>
        <div className="row">
          <div className="col-md-4 mb-4">
            <div className="card bg-white text-dark h-100">
              <img src="https://via.placeholder.com/300x200" className="card-img-top" alt="Product" />
              <div className="card-body">
                <h5 className="card-title">Product 1</h5>
                <p className="card-text">$99.99</p>
                <button className="btn btn-primary">Add to Cart</button>
              </div>
            </div>
          </div>
          <div className="col-md-4 mb-4">
            <div className="card bg-white text-dark h-100">
              <img src="https://via.placeholder.com/300x200" className="card-img-top" alt="Product" />
              <div className="card-body">
                <h5 className="card-title">Product 2</h5>
                <p className="card-text">$149.99</p>
                <button className="btn btn-primary">Add to Cart</button>
              </div>
            </div>
          </div>
          <div className="col-md-4 mb-4">
            <div className="card bg-white text-dark h-100">
              <img src="https://via.placeholder.com/300x200" className="card-img-top" alt="Product" />
              <div className="card-body">
                <h5 className="card-title">Product 3</h5>
                <p className="card-text">$79.99</p>
                <button className="btn btn-primary">Add to Cart</button>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}

export default Products;