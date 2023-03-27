package com.cuatroochenta.catedra.model;

import com.cuatroochenta.catedra.enums.JointStatus;
import com.cuatroochenta.catedra.enums.JointType;

public class Joint {
    private Position position;
    private Position screenPosition;
    private int type;
    private int status;

    public Joint() {
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Position getScreenPosition() {
        return screenPosition;
    }

    public void setScreenPosition(Position screenPosition) {
        this.screenPosition = screenPosition;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
