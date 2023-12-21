package PageData;

import com.github.javafaker.Faker;


public class CheckoutData {
     static Faker faker = new Faker();

    public static String

    firstName = faker.name().firstName(),
    lastName = faker.name().lastName(),
    postalCode= faker.address().zipCode();



}
