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
import Registro from './Registro';
import Ingresa from "./Ingresa"



const App = () => {




  return (
    <CartProvider>
      <Router>
        <div className="App">
          

          
              <div className='div'>
            <Banner>
              <BotonWhatsap />

                <div className='text'>
                  <Itemtext />
                </div>

                <div className='logo'>
                  <Logo />
                </div>

                <div>
                  <SearchBox />
                </div>

                <div className='carro'>
                  <BotonCarrito />
                </div>


            </Banner>
              </div>
         
            <Routes>
              <Route
                path="producto/:id"
                element={<ProductDetail />}
              />
              <Route path="cart"
                element={<CartSummary />} />

              <Route path="registro"
                element={<Registro />} />

              <Route path="ingresa"
                element={<Ingresa/>} />

              <Route
                path=""
                element={<><div className='carrusel'><Carrousel /></div><PromoSection /></>} />
            </Routes>
          </div>
        
      </Router>
    </CartProvider>
  );
};

export default App;