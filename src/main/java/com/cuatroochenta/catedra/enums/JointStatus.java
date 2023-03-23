package com.cuatroochenta.catedra.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum JointStatus {
    NOT_TRACKED(0),
    LOW_CONFIDENCE(1),
    TRACKED(2);
    private final int value;

    JointStatus(int value) {
        this.value = value;
    }
    @JsonValue
    public int getValue() {
        return value;
    }
}
