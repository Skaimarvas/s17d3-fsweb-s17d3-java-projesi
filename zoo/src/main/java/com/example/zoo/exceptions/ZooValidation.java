package com.example.zoo.exceptions;

import com.example.zoo.entity.Animal;
import org.springframework.http.HttpStatus;

import java.util.Map;

public class ZooValidation {
    private static final String ID_IS_NOT_VALID = "Id can not less than 0";
    private static final String ANIMAL_IS_NOT_EXIST = "Animal with given id is not exist: ";
    private static final String ANIMAL_CREDENTIALS_NOT_VALID = "Animal credentials are not valid";
    public static void isIdNotValid(long id){
        if(id<0){
            throw new ZooException(ID_IS_NOT_VALID, HttpStatus.BAD_REQUEST);

        }
    }
    public static void isAnimalNotExist(Map<Long, Animal> animalMap, Long id){
        if(!animalMap.containsKey(id)){
            throw new ZooException(ANIMAL_IS_NOT_EXIST + id, HttpStatus.NOT_FOUND);
        }
    }
    public static void isAnimalCredentialValid(Animal animal){
        if(animal == null ||
        animal.getId() == 0 ||
        animal.getName() == null || animal.getName().isEmpty() ||
        animal.getWeight() == 0 || animal.getWeight() < 0 ||
        animal.getHeight() == 0 || animal.getHeight() < 0 ||
        animal.getGender() == null ){
            throw new ZooException(ANIMAL_CREDENTIALS_NOT_VALID, HttpStatus.BAD_REQUEST);
        }
    }
}
