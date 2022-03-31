import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        {

            Scanner keyin = new Scanner(System.in);

            int total = 0, cost;

            System.out.printf("Enter an number:");

            System.out.printf(" enter number (0 end) =>", total);

            cost = keyin.nextInt();

            while (cost > 0) {

                total = total + cost;

                System.out.printf("enter number (0 end) =>", total);

                cost = keyin.nextInt();

            }

            System.out.printf("total :"+ total);

        }

    }}