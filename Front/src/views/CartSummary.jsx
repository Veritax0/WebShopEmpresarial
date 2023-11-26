import React, { useContext } from 'react';
import { CartContext } from '../contextos/CartContext.jsx';


const CartSummary = () => {
    const { cartItems } = useContext(CartContext);


    const totalPrice = cartItems.reduce((total, item) => total + item.precio * item.cantidad, 0);


    return (
        <div>
            {cartItems.map(item => (
                <div key={item.id}>
                    <h3>{item.nombre}</h3>
                    <p>Cantidad: {item.cantidad}</p>
                    <p>Precio: ${item.precio}</p>
                </div>
            ))}
            <h2>Total: ${totalPrice}</h2>
        </div>
       
    );
   
}




export default CartSummary;