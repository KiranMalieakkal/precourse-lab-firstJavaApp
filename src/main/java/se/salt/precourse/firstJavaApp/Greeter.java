package se.salt.precourse.firstJavaApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greeter {
  private static String greet(String namePassedIn) {
    return "Welcome to SALT, ";
  }

  public static void main(String[] args) throws IOException {
    System.out.print("What is your name? ");

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String name = reader.readLine();

    String greeting = greet(name);

    System.out.println(greeting);
  }
}
