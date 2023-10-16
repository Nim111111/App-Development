
import React, { useState } from 'react';
import Box from '@mui/material/Box';
import InputLabel from '@mui/material/InputLabel';
import MenuItem from '@mui/material/MenuItem';
import Select, { SelectChangeEvent } from '@mui/material/Select';
import FormControl from '@mui/material/FormControl';
import { Link, useNavigate } from "react-router-dom";
import { useDispatch } from 'react-redux';
import { useSelector} from 'react-redux';
import { setUserEmail, selectUserEmail } from '../Features/userSlice';
import './Login.css';

import axios from 'axios';

function Login() {
  const userEmail = useSelector(selectUserEmail);
  const dispatch = useDispatch();
  const [formData, setFormData] = useState({
    userRole: 'USER',
    email: '',
    password: '',
  });

  const navigate = useNavigate();

  const [loginSuccess, setLoginSuccess] = useState(false);
  const [errorMessage, setErrorMessage] = useState('');

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
      const response = await axios.post('http://localhost:8080/api/v1/auth/login', {
        email: formData.email,
        password: formData.password,
      });

      if (response.status === 200) {
        const data = response.data;
        const token = data.token;
        const name = data.name;
        const role = data.role;

        localStorage.setItem('token', token);

        if (role === formData.userRole) {
          // Roles match, navigate to the appropriate page
          if (role === 'ADMIN') {
            dispatch(setUserEmail(formData.email));
            navigate('/admin-homepage');
          } else if (role === 'USER') {
            dispatch(setUserEmail(formData.email));
            navigate('/user-homepage');
          }
          setLoginSuccess(true);
          setErrorMessage('Login Successful');
        } else {
          // Roles don't match, show an error message
          setErrorMessage('Invalid role!');
        }
      } else {
        setErrorMessage('Invalid username/email or password!');
      }
    } catch (error) {
      console.error('Error:', error);
      setErrorMessage('Invalid username/email or password!');
    }
  };

  return (
    <div className="login-background">
      <div className="login-container">
        <div className="left"></div>
        <div className="right">
          <h2>Login to Save Lives: Your Journey Begins Here!</h2>
          <form onSubmit={handleSubmit}>
            <div className="input-container">
              <Box sx={{ minWidth: 120, flex: 1 }}>
                <FormControl fullWidth style={{ width: '30%' }}>
                  <InputLabel id="demo-simple-select-label">Role</InputLabel>
                  <Select
                    labelId="demo-simple-select-label"
                    id="demo-simple-select"
                    name="userRole"
                    value={formData.userRole}
                    onChange={handleChange}
                    label="Role"
                  >
                    <MenuItem value="USER">User</MenuItem>
                    <MenuItem value="ADMIN">Admin</MenuItem>
                  </Select>
                </FormControl>
              </Box>
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
              <button type="submit">Login</button>
              <p>
                Don't have an account? <Link to="/register" style={{color:"black", textDecoration:'none'}}>Register here.</Link>
              </p>
            </div>
          </form>
          {loginSuccess ? (
            <p className="success-message">{errorMessage}</p>
          ) : (
            <p className="error-message">{errorMessage}</p>
          )}
        </div>
      </div>
    </div>
  );
}

export default Login;