import axios from "axios";

export class ProductService {
    baseUrl = "http://localhost:3000/producto/";

    getAll() {
        return axios.get(this.baseUrl + "buscar").then(res => res.data);
    }
}

