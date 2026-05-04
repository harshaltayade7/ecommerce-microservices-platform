import Login from '../pages/Login';
import Signup from '../pages/Signup';
import Dashboard from '../pages/Dashboard';
import Products from '../pages/Products';
import About from '../pages/About';

const routes = [
  {
    name: 'Login',
    path: '/login',
    component: Login,
    icon: 'fas fa-sign-in-alt',
    showInMenu: false,
  },
  {
    name: 'Signup',
    path: '/signup',
    component: Signup,
    icon: 'fas fa-user-plus',
    showInMenu: false,
  },
  {
    name: 'Ecommerce Platform',
    path: '/dashboard',
    component: Dashboard,
    icon: 'fas fa-tachometer-alt',
    showInMenu: true,
  },
  {
    name: 'Products',
    path: '/products',
    component: Products,
    icon: 'fas fa-shopping-bag',
    showInMenu: true,
  },
  {
    name: 'About',
    path: '/about',
    component: About,
    icon: 'fas fa-user',
    showInMenu: true,
  },
];

export default routes;