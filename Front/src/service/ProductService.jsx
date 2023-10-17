import axios from "axios";

export class ProductService{
    baseUrl = "";

    getAll(){
        return axios.get(this.baseUrl + "all").then(res => res.data);
    }
}