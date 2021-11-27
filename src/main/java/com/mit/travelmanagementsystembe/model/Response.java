package com.mit.travelmanagementsystembe.model;

import lombok.Data;

import java.util.List;

@Data
public class Response {

    private String code;
    private String message;
    private String status;
    private List<String> errors;

}
