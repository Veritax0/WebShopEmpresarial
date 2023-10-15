import React from "react";
import PromoBox from "./PromoBox";
import "../styles/PromoSection.css"

const PromoSection = () => {
    const promoProducts = [
        { id: 1, name: "Producto 1", price: 80000, image: "https://meiko.com.co/cdn/shop/files/4_576f1ab6-d06e-448f-9949-4d2e7f0aac02_1024x1024@2x.jpg?v=1685035230" },
        { id: 2, name: "Producto 2", price: 60000, image: "https://xavierventas.com/wp-content/uploads/2021/11/Cargador-iPhone-12-Pro-Max-20W-2.jpg" },
        // ... más productos
    ];

    return (
        <div>
            <h1 className="promoTitle">Productos en Promoción y Nuevos</h1>
                <div className="promoProducts">
                {promoProducts.map(product => (
                    <PromoBox key={product.id} product={product} />
                ))}
            </div>
        </div>
    );
};
export default PromoSection;