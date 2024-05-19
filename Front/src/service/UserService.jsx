import axios from "axios";

export class UserService {

    baseUrl = "localhost:8080/v1/user/";

    getAll() {
        return axios.get(this.baseUrl + "buscar" ).then(res => res.data);
    }

    getById(id) {
        return axios.get(this.baseUrl + id).then(res => res.data);
    }
}