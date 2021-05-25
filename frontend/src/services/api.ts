import axios from 'axios';

const BASE_URL = process.env.REACT_APP_BACKEND_URL || 'http://localhost:8080/api/sales';

const api = axios.create({
  baseURL: BASE_URL,
})

export default api;
