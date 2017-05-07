package io.github.devvratplus.java.concepts.helpermethods;

import java.util.Random;


public class RandomNumberGenerator {

  public static void main(String[] args) {

    for (int i = 0; i < 10; i++) {
      System.out.println(getRandomNumberInRange(1, 10));
    }

  }

  private static int getRandomNumberInRange(int min, int max) {

    if (min >= max) {
      throw new IllegalArgumentException("max must be greater than min");
    }

    Random r = new Random();
    return r.nextInt((max - min) + 1) + min;
  }

}

