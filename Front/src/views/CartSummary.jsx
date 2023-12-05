import React, { useContext } from 'react';
import { CartContext } from '../contextos/CartContext.jsx';
import "../styles/CartSummary.css";



const CartSummary = () => {
    const { cartItems } = useContext(CartContext);


    const totalPrice = cartItems.reduce((total, item) => total + item.precio * item.cantidad, 0);


    return (
        <div className="cart-summary">
            {cartItems.map(item => (
                <div key={item.id} className="cart-item">
                    <h3>{item.nombre}</h3>
                    <p>Cantidad: {item.cantidad}</p>
                    <p>Precio: ${item.precio}</p>
                </div>
            ))}
            <h2 className="total-price">Total: ${totalPrice}</h2>
            {/* Ejemplo de botón, si lo necesitas */}
            {/* <a href="/checkout" className="button">Proceder al Pago</a> */}
        </div>
    );
            }




export default CartSummary;