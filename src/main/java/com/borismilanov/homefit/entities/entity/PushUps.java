package com.borismilanov.homefit.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pushups")
public class PushUps extends BaseEntity{

    private int count;

    public PushUps() {
    }

    @Column(columnDefinition = "default 0")
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
