import axios from "axios";

export class ProductService {
    baseUrl = "http://localhost:3000/";

    getAll() {
        return axios.get(this.baseUrl ).then(res => res.data);
    }

    getById(id) {
        return axios.get(this.baseUrl + id).then(res => res.data);
    }
}
