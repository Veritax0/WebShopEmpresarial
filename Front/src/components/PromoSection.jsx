import React, { Component } from "react";
import PromoBox from "./PromoBox";
import "../styles/PromoSection.css"
import { ProductService } from '../service/ProductService';

class PromoSection extends Component{

    constructor(){
        super();
        this.state = {};
        this.ProductService = new ProductService();
        this.products = []
        this.ProductService.getAll().then(data => this.products.push(data))
      }
    
      componentDidMount(){
        this.ProductService.getAll().then(data => this.setState({productos: data}))
      }

    getProducts(){
        var productsArray = this.products
        var productos = productsArray
        return productos
    }

    render(){
        var products = this.getProducts()
        var p = products[0]
        console.log(products)
        console.log(p)
        return (
            <div className="PromoSection">
                <h1 className="promoTitle">Productos en Promoción y Nuevos</h1>
                    <div className="promoProducts">
                    {products.map(products => (
                        <PromoBox key={products.id} product={products} />
                    ))}
                </div>
            </div>
        );
    }
};
export default PromoSection;