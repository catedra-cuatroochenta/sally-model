package com.cuatroochenta.catedra.model;

import com.cuatroochenta.catedra.enums.BodyStatus;

public class Body {
    private Joint[] joints;
    private BodyStatus status;
    private Position centerOfMass;

    public Body() {
    }
    public Joint[] getJoints() {
        return joints;
    }

    public void setJoints(Joint[] joints) {
        this.joints = joints;
    }

    public BodyStatus getStatus() {
        return status;
    }

    public void setStatus(BodyStatus status) {
        this.status = status;
    }

    public Position getCenterOfMass() {
        return centerOfMass;
    }

    public void setCenterOfMass(Position centerOfMass) {
        this.centerOfMass = centerOfMass;
    }
}
