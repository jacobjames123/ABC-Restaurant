// import logo from './logo.svg';
import './App.css';

import React from 'react';
import { BrowserRouter, Routes, Route, Navigate } from 'react-router-dom';

import Navbar from './Component/common/Navbar';
import FooterComponent from './Component/common/Footer';
import HomePage from './Component/home/HomePage';
import AllRoomsPage from './Component/booking_tables/AllTablesPage';
import FindBookingPage from './Component/booking_tables/FindBookingsPage';
import TablesDetailPage from './Component/booking_tables/TablesDetailPage';
import LoginPage from './Component/auth/LoginPage';
import RegisterPage from './Component/auth/RegisterPage';
import ProfilePage from './Component/profile/ProfilePage';
import EditProfilePage from './Component/profile/EditProfilePage';
import { ProtectedRoute, AdminRoute } from './Service/guard';
import AdminPage from './Component/admin/AdminPage';

function App() {
    return (
        <BrowserRouter>
            <div className="App">
                <Navbar/>
                <div className='content'>
                    <Routes>
                        <Route exact path='/home' element={<HomePage/>}/>
                        <Route exact path='/tables' element={<AllRoomsPage/>}/>
                        <Route exact path='/find-booking' element={<FindBookingPage/>}/>
                        <Route exact path='/table-details-table/:roomId' element={<TablesDetailPage/>}/>
                        <Route exact path="/login" element={<LoginPage />} />
                        <Route path="/register" element={<RegisterPage />} />
                        <Route path="/profile" element={<ProfilePage />} />
                        <Route path="/edit-profile" element={<EditProfilePage />} />
                        <Route path="/admin"
              element={<AdminRoute element={<AdminPage />} />}
            />

                    </Routes>
                </div>
                <FooterComponent/>
            </div>
        </BrowserRouter>
    );
}

export default App;
