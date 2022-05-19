package com.borismilanov.homefit.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "stationary_bicycle")
public class StationaryBicycle extends BaseEntity{

    private int pressureLevel;
    private Long timeInMinutes;

    public StationaryBicycle() {
    }

    @Column(name = "pressure_level")
    public int getPressureLevel() {
        return pressureLevel;
    }

    public void setPressureLevel(int pressureLevel) {
        this.pressureLevel = pressureLevel;
    }

    @Column(name = "time_in_minutes")
    public Long getTimeInMinutes() {
        return timeInMinutes;
    }

    public void setTimeInMinutes(Long timeInMinutes) {
        this.timeInMinutes = timeInMinutes;
    }
}
