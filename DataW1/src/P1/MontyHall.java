package P1;

import java.util.Random;

public class MontyHall {
    public static void main(String[] args) {
        Random rand = new Random();
        int wins = 0;
        int trials = 600;

        for (int i = 0; i < trials; i++) {
            int car = rand.nextInt(3);          // 0, 1, or 2
            int pick = 0;                       // contestant always picks door 0
            // Monty opens a goat door that is not the contestant's pick
            int monty;
            do {
                monty = rand.nextInt(3);
            } while (monty == pick || monty == car);

            // contestant switches to the remaining door
            int switchDoor = 3 - pick - monty;  // the one left

            if (switchDoor == car) {
                wins++;
            }
        }

        System.out.println("Wins: " + wins + " out of " + trials);
        System.out.println("Estimated probability: " + (double)wins / trials);
    }
}



