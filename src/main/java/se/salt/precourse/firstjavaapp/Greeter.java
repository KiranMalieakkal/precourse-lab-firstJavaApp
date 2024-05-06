package se.salt.precourse.firstjavaapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

@SpringBootApplication
public class Greeter implements CommandLineRunner {

  @Autowired
  StartDateHandler startDateHandler;

  private static String greet(String namePassedIn) {
    return "Welcome to SALT, " + namePassedIn;
  }

  public static void main(String[] args) throws IOException {
    SpringApplication.run(Greeter.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
      System.out.print("What is your name? ");

      Scanner Sc = new Scanner(System.in);
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String name = Sc.nextLine();
      System.out.print("When does that course start?(yyyy-mm-dd) ");
      String startDateInput = Sc.nextLine();
      String greeting = greet(name);
      // The below line is no longer needed because we are using Spring beans to automatically add an instance of a StartDateHandler it to the Greeter class when it creates a new instance of the Greeter class
      //StartDateHandler startDateHandler = new StartDateHandler();
      System.out.println(greeting);
      if (startDateHandler.dateHasOnlyNumbers(startDateInput)) {
        System.out.println("Today it is " + startDateHandler.daysToCourseStart(startDateInput) + " days left until the course starts");
      } else {
        System.out.println("Enter a valid date");
      }



  }
}
