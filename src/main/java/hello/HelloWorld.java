package hello;

import java.time.LocalTime; // Import LocalTime from java.time

public class HelloWorld {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now(); // Use LocalTime.now() to get the current time
        System.out.println("The current local time is: " + currentTime);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
