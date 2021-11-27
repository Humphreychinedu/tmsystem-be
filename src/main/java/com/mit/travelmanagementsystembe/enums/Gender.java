package com.mit.travelmanagementsystembe.enums;

import lombok.Data;
import lombok.Getter;

@Getter
public enum Gender {
    MALE("Male"), FEMALE("Female"), OTHERS("Others");

    private String sex;

    Gender(String sex) {
        this.sex = sex;
    }
}
