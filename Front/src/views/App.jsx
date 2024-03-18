import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Banner from '../components/Banner';
import SearchBox from '../components/SearchBox';
import PromoSection from '../components/PromoSection';
import Carrousel from '../components/Carrousel';
import BotonCarrito from '../components/BotonCarrito';
import Itemtext from '../components/ItemsText';
import Logo from '../components/Logo';
import BotonWhatsap from '../components/BotonWhatsap';
import ProductDetail from './ProductDetail';
import '../styles/App.css';
import { CartProvider } from '../contextos/CartContext';
import CartSummary from './CartSummary';

const App = () => {
  



  return (
    <CartProvider>
    <Router>
      <div className="App">
        <div className="ItemLocation">
          <Banner>
          <BotonWhatsap />
            <Itemtext />

            <div className='Logosearch'><Logo />
              <SearchBox /></div>
            <BotonCarrito />

            
          </Banner>
          <Routes>
            <Route
              path="producto/:id"
              element={<ProductDetail />}
            />
            <Route path="cart" 
            element={<CartSummary />} />
            
            <Route
              path=""
              element={
                <>
                
                  <Carrousel />
                  <PromoSection />

                </>
              }
            />
          </Routes>
        </div>
      </div>
    </Router>
    </CartProvider>
  );
};

export default App;