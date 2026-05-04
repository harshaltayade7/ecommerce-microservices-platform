const API_BASE_URL = 'http://localhost:8080/auth';

// Central fetch wrapper (important for consistency)
const apiFetch = async (url, options = {}) => {
  const response = await fetch(url, {
    ...options,
    credentials: 'include', // ALWAYS include cookies
    headers: {
      'Content-Type': 'application/json',
      ...options.headers,
    },
  });

  const data = await response.json().catch(() => null);

  if (!response.ok) {
    const message = data?.message || 'Request failed';
    throw new Error(message);
  }

  return data;
};

// 🔐 LOGIN
export const login = (email, password) => {
  return apiFetch(`${API_BASE_URL}/login`, {
    method: 'POST',
    body: JSON.stringify({ email, password }),
  });
};

// 📝 REGISTER
export const register = (email, password) => {
  return apiFetch(`${API_BASE_URL}/register`, {
    method: 'POST',
    body: JSON.stringify({
      email,
      password,
      role: 'CUSTOMER',
    }),
  });
};

// 🚪 LOGOUT
export const logout = () => {
  return apiFetch(`${API_BASE_URL}/logout`, {
    method: 'POST',
  });
};

// 👤 AUTH CHECK
export const checkAuth = () => {
  return apiFetch(`${API_BASE_URL}/me`, {
    method: 'GET',
  });
};