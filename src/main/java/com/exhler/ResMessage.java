package com.exhler;

import lombok.Data;

@Data
public class ResMessage {

    private String code;
    private String message;

    public ResMessage() {
    }

    public ResMessage(String code, String message) {
        this.code = code;
        this.message = message;
    }

}
