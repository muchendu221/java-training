package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest 
{
    //? Reference =>App
    App app = new App();
  @Test
  void add(){
    // when
    int result = app.add(2,3);
    //then
    int expected = 5;
    //verify that result = expected
    Assertions.assertEquals(expected, result, " the sum of 2+3 should 5");

  }
}
