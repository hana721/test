package basicClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {
    public static void main(String[] args) {
        // Q1
        Dog dog = new Dog();
        System.out.println(dog.getName());

        // Q2
        Dog dog2 = new Dog(3);
        System.out.println(dog2.getCount());

        // Q3
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
        String formattedDateTime = now.format(formatter);
        System.out.println(formattedDateTime);
    }
}
