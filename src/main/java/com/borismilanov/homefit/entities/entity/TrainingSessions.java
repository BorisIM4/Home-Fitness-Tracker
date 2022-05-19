package com.borismilanov.homefit.entities.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "traning_sessions")
public class TrainingSessions extends BaseEntity{

    private LocalDate date;
    private Long userId;
    private Long plancksTrainingsId;
    private Long stationaryBicycleTrainingsId;
    private Long pushUpsTrainingsId;

    public TrainingSessions() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPlancksTrainingsId() {
        return plancksTrainingsId;
    }

    public void setPlancksTrainingsId(Long plancksTrainingsId) {
        this.plancksTrainingsId = plancksTrainingsId;
    }

    public Long getStationaryBicycleTrainingsId() {
        return stationaryBicycleTrainingsId;
    }

    public void setStationaryBicycleTrainingsId(Long stationaryBicycleTrainingsId) {
        this.stationaryBicycleTrainingsId = stationaryBicycleTrainingsId;
    }

    public Long getPushUpsTrainingsId() {
        return pushUpsTrainingsId;
    }

    public void setPushUpsTrainingsId(Long pushUpsTrainingsId) {
        this.pushUpsTrainingsId = pushUpsTrainingsId;
    }
}
