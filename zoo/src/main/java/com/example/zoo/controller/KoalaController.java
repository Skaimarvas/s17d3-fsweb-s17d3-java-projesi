package com.example.zoo.controller;

import com.example.zoo.entity.Gender;
import com.example.zoo.entity.Koala;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/koalas")
public class KoalaController {
  private Map<Long, Koala> koalas;

  @PostConstruct
  public void init(){
    koalas = new HashMap<>();
    koalas.put(1L,new Koala(14,"Jack",15,50,Gender.MALE,10));
    koalas.put(2L,new Koala(15,"Julia",12,40,Gender.FEMALE,11));
    koalas.put(3L,new Koala(18,"Joe",20,70,Gender.MALE,12));
  }

  @GetMapping
  public List<Koala> findAll(){
    return koalas.values().stream().toList();
  }
}
