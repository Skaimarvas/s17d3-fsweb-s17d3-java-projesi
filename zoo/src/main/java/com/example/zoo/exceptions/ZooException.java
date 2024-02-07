package com.example.zoo.exceptions;


import lombok.Getter;
import org.springframework.http.HttpStatus;

/**Notes:
 * Why did we add @Getter annotation? Explain:
 * This annotation instructs Lombok
 * to generate getter method instead generate it manually
 * ---------------------------------------------------------
 * Why did we extend Runtime Exception?:
 * to handle runtime exception error?
 *
 */
@Getter
public class ZooException extends RuntimeException {
  private HttpStatus status;
  public ZooException(String message,HttpStatus status){
      super(message);
      this.status = status;
  }

}
