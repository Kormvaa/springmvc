package co.istad.kormva.a01m1springwebmvc.util;

import java.util.concurrent.ThreadLocalRandom;

public class RandomUtil {
    public static String generateProductCode() {
        String prefix = "ISTAD-PRO-";

        // Generates a random number between 10000 and 99999
        int randomNumber = ThreadLocalRandom.current().nextInt(10000, 100000);

        return prefix + randomNumber;
    }
}
