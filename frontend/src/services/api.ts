import axios from 'axios';

const api = axios.create({
  baseURL: process.env.REACT_APP_BACKEND_URL ?? 'http://localhost:8080/api/sales',
})

export default api;