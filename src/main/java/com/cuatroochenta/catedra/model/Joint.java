package com.cuatroochenta.catedra.model;

import com.cuatroochenta.catedra.enums.JointStatus;
import com.cuatroochenta.catedra.enums.JointType;

public class Joint {
    private Position position;
    private Position screenPosition;
    private JointType jointType;
    private JointStatus jointStatus;

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

    public JointType getJointType() {
        return jointType;
    }

    public void setJointType(JointType jointType) {
        this.jointType = jointType;
    }

    public JointStatus getJointStatus() {
        return jointStatus;
    }

    public void setJointStatus(JointStatus jointStatus) {
        this.jointStatus = jointStatus;
    }
}
