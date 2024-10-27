/**
 * Created by iyasuwatts on 10/17/17.
 */


import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        int random = ThreadLocalRandom.current().nextInt(20, 81);
        int num;
        //System.out.println(random);
        Scanner in = new Scanner(System.in);
        System.out.print("Type your number: ");
        num = in.nextInt();
        //System.out.println(num);


        //do while statement needed
        if (random == num) {
                System.out.println("Your guess is correct!");
        } else if (num > random) {
                System.out.println("Your guess is too large!");
        } else {
                System.out.println("Your guess is too small!");
        }


    }



}




