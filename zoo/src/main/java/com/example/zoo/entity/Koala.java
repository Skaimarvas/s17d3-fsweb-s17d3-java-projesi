package com.example.zoo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;


@AllArgsConstructor
@Data

public class Koala extends Animal {

    private int sleepHour;


    public Koala(long id, String name, int weight, int height, Gender gender, int sleepHour) {
        super(id, name, weight, height, gender);
        this.sleepHour = sleepHour;
    }
}
