package less10;

import java.util.Scanner;

public class Main {
    static Scanner num = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("Введите произвольную цифру");
        int a = num.nextInt();

        String w ;
        switch ( a ){

            case 1 : w = "Monday";

                break;
            case 2 : w = "Tuesday";

                break;
            case 3 : w = "Wednesday";

                break;
            case 4 : w = "Thursday";

                break;
            case 5 : w = "Friday";

                break;
            case 6 : w = "Saturday";

                break;
            case 7 : w = "Sunday";

                break;

            default:
                w = "Error";
                System.out.println("Error");


        }

        System.out.println(w);

    }
}
