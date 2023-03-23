package com.cuatroochenta.catedra.model;

import com.cuatroochenta.catedra.enums.JointStatus;
import com.cuatroochenta.catedra.enums.JointType;

public class Joint {
    private Position position;
    private Position screenPosition;
    private JointType type;
    private JointStatus status;

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

    public JointType getType() {
        return type;
    }

    public void setType(JointType type) {
        this.type = type;
    }

    public JointStatus getStatus() {
        return status;
    }

    public void setStatus(JointStatus status) {
        this.status = status;
    }
}
