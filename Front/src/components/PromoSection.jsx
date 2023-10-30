import React, { Component } from "react";
import PromoBox from "./PromoBox";
import "../styles/PromoSection.css"
import { ProductService } from '../service/ProductService';

class PromoSection extends Component{

    constructor(){
        super();
        this.state = {};
        this.ProductService = new ProductService();
      }
    
      componentDidMount(){
        this.ProductService.getAll().then(data => this.setState({productos: data}))
      }
    
    

    render(){
        const promoProducts = [
            { id: 1, name: "Producto 1", price: 80000, image: "https://drive.google.com/uc?export=view&id=1jTelPyYI81b31fwsdek4x8iae31VLCD0" },
            { id: 2, name: "Producto 2", price: 60000, image: "https://xavierventas.com/wp-content/uploads/2021/11/Cargador-iPhone-12-Pro-Max-20W-2.jpg" },
            // ... más productos
        ];
        return (
            <div className="PromoSection">
                <h1 className="promoTitle">Productos en Promoción y Nuevos</h1>
                    <div className="promoProducts">
                    {promoProducts.map(product => (
                        <PromoBox key={product.id} product={product} />
                    ))}
                </div>
            </div>
        );
    }
};
export default PromoSection;