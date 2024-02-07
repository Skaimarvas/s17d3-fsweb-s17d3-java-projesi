package com.example.zoo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Animal {
    private long id;
    private String name;
    private int weight;
    private int height;
    private Gender gender;
}
