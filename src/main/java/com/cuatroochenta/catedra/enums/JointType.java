package com.cuatroochenta.catedra.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum JointType {
    HEAD(0),
    SHOULDER_SPINE(1),
    LEFT_SHOULDER(2),
    LEFT_ELBOW(3),
    LEFT_HAND(4),
    RIGHT_SHOULDER(5),
    RIGHT_ELBOW(6),
    RIGHT_HAND(7),
    MID_SPINE(8),
    BASE_SPINE(9),
    LEFT_HIP(10),
    LEFT_KNEE(11),
    LEFT_FOOT(12),
    RIGHT_HIP(13),
    RIGHT_KNEE(14),
    RIGHT_FOOT(15),
    LEFT_WRIST(16),
    RIGHT_WRIST(17),
    NECK(18);

    private final int value;

    JointType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}
