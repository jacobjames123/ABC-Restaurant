import React from "react";

import { NavLink, useNavigate } from "react-router-dom";
import ApiService from "../../Service/APIService";

function Navbar() {
    const navigate = useNavigate();
    const isAuthenticated = ApiService.isAuthenticated();
    const isAdmin = ApiService.isAdmin();
    const isUser = ApiService.isUser();

    const handleLogout = () => {
        const isLogout = window.confirm("Are you sure you really want to logout?");
    
        if (isLogout) {
            ApiService.logout();
            navigate('/home');
        }
    };

    return(

    <nav className="navbar">
    <div className="navbar-brand">
        <NavLink to="/home">ABC Restaurant</NavLink>
    </div>
    <ul className="navbar-ul">
        <li><NavLink to="/home" activeClassName="active">Home</NavLink></li>
        <li><NavLink to="/tables" activeClassName="active">Tables & Halls</NavLink></li>
        <li><NavLink to="/find-booking" activeClassName="active">Find My Reservations</NavLink></li>

        {isUser && <li><NavLink to="/profile" activeClassName="active">Profile</NavLink></li>}
        {isAdmin && <li><NavLink to="/admin" activeClassName="active">Admin</NavLink></li>}

        {!isAuthenticated && <li><NavLink to="/login" activeClassName="active">Login</NavLink></li>}
        {isAuthenticated && <li><NavLink to="/register" activeClassName="active">Register</NavLink></li>}
    
    {isAuthenticated && <li onClick={handleLogout}>Logout</li>}
    </ul>
</nav>
)

}

export default Navbar;