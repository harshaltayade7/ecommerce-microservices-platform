import React from 'react';
import Navbar from '../components/Navbar';

function About() {
  return (
    <div style={{ background: 'linear-gradient(135deg, #667eea 0%, #764ba2 100%)', minHeight: '100vh' }}>
      <Navbar />
      {/* About Content */}
      <div className="container mt-5">
        <div className="row">
          <div className="col-md-4">
            <img src="/Harshal_Tayade_Grey_Bg.png" alt="Harshal Tayade" className="img-fluid rounded-circle border border-white" />
          </div>
          <div className="col-md-8">
            <h3 className="text-white">Harshal Tayade</h3>
            <p className="lead text-white">Full-Stack Developer | React Enthusiast | Problem Solver</p>
            <p className="text-white">
              Hello! I'm Harshal Tayade, a passionate full-stack developer with experience in building modern web applications.
              This ecommerce platform is part of my portfolio projects, showcasing my skills in React, Java Spring Boot, and microservices architecture.
            </p>
            <p className="text-white">
              I specialize in creating user-friendly interfaces and robust backend systems. My tech stack includes JavaScript, React, Bootstrap,
              Java Spring Boot, MongoDB, and various databases. I'm always eager to learn new technologies and tackle challenging problems.
            </p>
            <p className="text-white">
              When I'm not coding, you can find me exploring new tech trends, contributing to open-source projects, or enjoying outdoor activities.
            </p>
            <a href="https://www.linkedin.com/in/harshal-tayade-49a22014b/" target="_blank" rel="noopener noreferrer" className="btn btn-light">
              View LinkedIn Profile
            </a>
          </div>
        </div>
        <div className="mt-5">
          <h4 className="text-white">Skills</h4>
          <div className="row">
            <div className="col-md-6">
              <div className="card bg-white text-dark">
                <div className="card-body">
                  <h5>Frontend</h5>
                  <ul>
                    <li>React.js</li>
                    <li>JavaScript (ES6+)</li>
                    <li>HTML5 & CSS3</li>
                    <li>Bootstrap</li>
                    <li>Responsive Design</li>
                  </ul>
                </div>
              </div>
            </div>
            <div className="col-md-6">
              <div className="card bg-white text-dark">
                <div className="card-body">
                  <h5>Backend</h5>
                  <ul>
                    <li>Java Spring Boot</li>
                    <li>MongoDB</li>
                    <li>RESTful APIs</li>
                    <li>Microservices</li>
                    <li>Authentication & Security</li>
                  </ul>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div className="mt-4">
          <h4 className="text-white">Education</h4>
          <p className="text-white">BE in Computer Engineering from Pune University</p>
        </div>
        <div className="mt-4">
          <h4 className="text-white">Contact</h4>
          <p className="text-white">Email: <a href="mailto:harshaltayade7@gmail.com" className="text-white">harshaltayade7@gmail.com</a></p>
          <p className="text-white">Feel free to reach out for collaborations or opportunities!</p>
        </div>
      </div>
    </div>
  );
}

export default About;