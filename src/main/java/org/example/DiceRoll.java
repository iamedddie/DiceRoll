package org.example;

import java.util.Random;
import java.util.Scanner;

public class DiceRoll {
    public static void main(String[] args) {
        DiceRoller Roller = new DiceRoller();
    }
}

class DiceRoller {
    DiceRoller() {
        Random random = new Random();
        int number = 0;
        Roll(random, number);

    }

    public void Roll(Random random, int result) {
        Scanner input = new Scanner(System.in);
        String answer = "";
        int result2 = 0;
        int i = 0;
        while (answer.isBlank() || !answer.equalsIgnoreCase("y")) {
            System.out.println("Throw ?");
            String response = input.nextLine();
            if (response.equalsIgnoreCase("y")) {
                i++;
                if (i == 1) {
                    result = random.nextInt(6) + 1;
                    System.out.println("The lucky number is " + result + " roll the dice again !!!😏");
                } else {
                    result2 = random.nextInt(6) + 1;
                    System.out.println(result2);
                    System.out.println("Try(s):" + i);
                }
                if (result == result2 && i > 2) {
                    System.out.println("Unlucky, 😂 You rolled the dice " + i + " times to get a " + result);
                    break;
                } else if (result == result2 && i <= 2) {
                    System.out.println("Wow 😮, You rolled the dice just " + i + " time(s) to get a " + result);
                    break;
                }
            }

        }
    }
}







