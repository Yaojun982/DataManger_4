
import java.util.Scanner;

public class Hw1 {

            public static void main(String[] args)
            {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a years :");
                int year = scanner.nextInt(); scanner.close();
                boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
                String msg = isLeapYear ? year + "    " +
                        "Leap Year\t " : year + "common Year\t";
                System.out.println(msg);

                if (isLeapYear ==true){
                    System.out.println(isLeapYear);
                }else if (isLeapYear ==false){
                    System.out.println(isLeapYear);
                }
            }
}

