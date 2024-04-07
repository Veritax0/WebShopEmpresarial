package com.webShop.back.modelo.DTO;

import lombok.Data;


@Data
public class AthAnswerDTO {

    private String accessToken;
    private String name;
    private String lastname;
    private String userType;

    public AthAnswerDTO(String accessToken, String name, String lastname, String userType) {
        this.accessToken = accessToken;
        this.name = name;
        this.lastname = lastname;
        this.userType = userType;
    }

    public AthAnswerDTO(String name, String lastname, String userType) {
        this.name = name;
        this.lastname = lastname;
        this.userType = userType;
    }

    public AthAnswerDTO(String accessToken) {
        this.accessToken = accessToken;
    }
    
}
