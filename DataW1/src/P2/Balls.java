package P2;

import java.util.Random;

public class Balls {
    public static void main(String[] args) {
        Random rand = new Random();
        int experiments = 100;
        int totalBlack = 0;

        for (int e = 0; e < experiments; e++) {
            int black = 0;
            for (int i = 0; i < 10; i++) {
                // 0-69 = white, 70-99 = black
                if (rand.nextInt(100) >= 70) {
                    black++;
                }
            }
            totalBlack += black;
        }

        System.out.println("Average black balls: " + (double) totalBlack / experiments);
    }
}
