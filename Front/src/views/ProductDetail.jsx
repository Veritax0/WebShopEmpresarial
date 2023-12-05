import React, { useState, useEffect } from 'react';
import { useParams } from 'react-router-dom';
import { ProductService } from '../service/ProductService';
import { useContext } from 'react';
import { CartContext } from '../contextos/CartContext';
import "../styles/ProductDetail.css";

const ProductDetail = () => {
    const [product, setProduct] = useState(null);
    const [cantidad, setCantidad] = useState(1); // Estado para manejar la cantidad
    const { id } = useParams();
    const productService = new ProductService();
    const { addToCart } = useContext(CartContext);
    
    const handleAddToCart = () => {
        addToCart(product, cantidad);
    };

    useEffect(() => {
        productService.getById(id)
        .then(data => {
            console.log(data); // Para depuración
            setProduct(data);
        });
    }, [id, productService]);

    if (!product) return <div>Cargando...</div>;

    const incrementarCantidad = () => {
        setCantidad(cantidad + 1);
    };

    const decrementarCantidad = () => {
        if (cantidad > 1) {
            setCantidad(cantidad - 1);
        }
    };

    return (
        <div className="product-detail">
            <div className="product-image">
                <img src={`/${product.id}.png`} alt={product.name} />
            </div>
            <div className="product-info">
                <h1>{product.nombre}</h1>
                <p>Precio: ${product.precio}</p>
                <div className="cantidad">
                    <button onClick={decrementarCantidad}>-</button>
                    <span>{cantidad}</span>
                    <button onClick={incrementarCantidad}>+</button>
                </div>
                <button className="agregar-carrito" onClick={handleAddToCart}>Agregar al Carrito</button>
                <p>{product.caracter}</p>
            </div>
        </div>
    );
}

export default ProductDetail;