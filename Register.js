
import React, { useState } from 'react';
import { useDispatch } from 'react-redux';
import { useSelector} from 'react-redux';
import { setUserEmail, selectUserEmail } from '../Features/userSlice';
import { Link, useNavigate } from "react-router-dom";
import axios from 'axios'
import './Register.css';

function Register() {
    const userEmail = useSelector(selectUserEmail);
    const dispatch = useDispatch();
    const navigate = useNavigate(); // Use the useNavigate hook to get the navigation function
    const [formData, setFormData] = useState({
      name: '',
      email: '',
      password: '',
      role:'USER',
    });
    
    const handleChange = (e) => {
      const { name, value } = e.target;
      setFormData({
        ...formData,
        [name]: value,
      });
    };

  
    const handleSubmit = async (e) => {
      e.preventDefault();
      try {
          const response = await axios.post('http://localhost:8080/api/v1/auth/register', {
          name:formData.name,
          email: formData.email,
          password: formData.password,
          role:'USER',
        });
        dispatch(setUserEmail(formData.email));
        navigate('/user-homepage');
      } catch (error) {
        console.error('Error:', error);
     }
  };
          
    return (
      <div className="login-background">
      <div className="login-container">
        <div className='leftt'>
        </div>
        <div className='rightt'>
        <h2>Your Compassion, Their Second Chance: Join Us</h2>   
        <form onSubmit={handleSubmit}>
        <div className="input-field">
            <label>User Name</label>
            <input
              type="text"
              name="name"
              value={formData.name}
              onChange={handleChange}
            />
          </div>
        <div className="input-field">
            <label>Email</label>
            <input
              type="email"
              name="email"
              value={formData.email}
              onChange={handleChange}
            />
          </div>
          <div className="input-field">
            <label>Password</label>
            <input
              type="password"
              name="password"
              value={formData.password}
              onChange={handleChange}
            />
          </div>
          <div className="submit-button">
          <button type="submit">Sign Up</button>
            <div className='pp'>
            <p >Already have an account? <Link to="/" style={{color:"black", textDecoration:'none'}}>Login here.</Link></p>
            </div>
          </div>
        </form>
       </div>
      </div>
      </div>
    );
  
}

export default Register;
