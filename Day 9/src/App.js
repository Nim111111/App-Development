import React from 'react';
import './App.css';
import Signup from './Signup';
import {BrowserRouter as Router} from 'react-router-dom';
import {Routes, Route} from 'react-router';
import Home from './home';
import AboutUs from './Aboutus';
import AdminLogin from './components/AdminLogin';
import DonorReg from './components/DonorReg';

function App() {
  return (
    <div className="App">
      <header className="App-header">
      <Router>
      <Routes>
      
        <Route path="/" exact element={<Signup/>} />
        <Route path="/Home"element={<Home/>} /> 
        <Route path="/AboutUs"element={<AboutUs/>} /> 
        <Route path="/AdminLogin"element={<AdminLogin/>} /> 
        <Route path="/DonorReg"element={<DonorReg/>} /> 
     
    </Routes>
    </Router>
      </header>
    </div>
  );
}

export default App;