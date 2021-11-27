package com.mit.travelmanagementsystembe.enums;

import lombok.Getter;

@Getter
public enum TransportationMedium {

    AIR("Air"), LAND("Land"), TRAIN("Train"), SEA("Sea");

    private String type;

    TransportationMedium(String type) {
        this.type = type;
    }
}
