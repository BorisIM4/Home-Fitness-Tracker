package com.borismilanov.homefit.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "plancks")
public class Planck extends BaseEntity{

    private int timeInSeconds;

    public Planck() {
    }

    @Column(name = "time_in_seconds")
    public int getTimeInSeconds() {
        return timeInSeconds;
    }

    public void setTimeInSeconds(int timeInSeconds) {
        this.timeInSeconds = timeInSeconds;
    }
}
