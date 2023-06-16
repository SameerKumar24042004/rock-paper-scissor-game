                                      // Rock paper and scissor game

import java.util.Scanner;
import java.util.Random;
public class game {
    public static void main(String[] args) {
        boolean s = true; // while =1
        while (s) {
            int b;
            char computer;
            Scanner sc = new Scanner(System.in);
            Random random = new Random();
            int randomInt = random.nextInt();
            int min = 1;
            int max = 3;
            int randomIntInRange = random.nextInt(max - min + 1) + min;
            if (randomIntInRange == 1) {
                computer = 'r';
            } else if (randomIntInRange == 2) {
                computer = 'p';
            } else {
                computer = 's';
            }

            System.out.printf("enter the choice( 'r' for rock 'p' for paper and 's' for scissor)= ");

            char inputChar = sc.next().charAt(0);
            System.out.printf("the computer choice is = ");
            System.out.println(computer);
            {
                if (computer == 'r') {
                    if (inputChar == 'r')
                        System.out.printf("its a tie\n");
                    else if (inputChar == 'p') {
                        System.out.printf("the use is the winner\n");
                    } else
                        System.out.printf("the computer is winner\n");
                }
                if (computer == 'p') {
                    if (inputChar == 'p')
                        System.out.printf("its a tie\n");
                    else if (inputChar == 's') {
                        System.out.printf("the use is the winner\n");
                    } else
                        System.out.printf("the computer is winner\n");

                }
                if (computer == 's') {
                    if (inputChar == 's')
                        System.out.printf("its a tie\n");
                    else if (inputChar == 'r') {
                        System.out.printf("the use is the winner\n");
                    } else
                        System.out.printf("the computer is winner\n");
                }
            }
            System.out.println("press 1 to play again and 0 to exit: ");
            b = sc.nextInt();
            if (b != 1)  // while = 0
            {
                s = false;
            }
        }
    }
}
