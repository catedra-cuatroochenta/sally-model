package com.cuatroochenta.catedra.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BodyStatus {
    NOT_TRACKING(0),
    LOST(1),
    TRACKING_STARTED(2),
    TRACKING(3);

    private final int value;

    BodyStatus(int value) {
        this.value = value;
    }
    @JsonValue
    public int getValue() {
        return value;
    }
}
