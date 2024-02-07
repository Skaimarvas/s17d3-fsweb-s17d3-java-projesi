package com.example.zoo.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

/**Notes:
 * @NoArgsConstructor instructs Lombok to generate empty constructor
 * @AllArgsConstructor instructs Lombok to generate constructor contains all fields in related class
 * @Getter instructs Lombok to generate getter method
 * @Setter instructs Lombok to generate setter method
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ZooErrorResponse {
    private int status;
    private String message;
    private LocalDateTime createdAt;
}
