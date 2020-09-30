package less9;


import java.util.Scanner;

public class Main {
    static Scanner num = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("Введите произвольную цифру");
        int a = num.nextInt();

        String w ;
        switch ( a ){
            case 0 : w = "zero";
                System.out.println("zero");
            break;
            case 1 : w = "one";
                System.out.println("one");
                break;
            case 2 : w = "two";
                System.out.println("two");
                break;
            case 3 : w = "three";
                System.out.println("three");
                break;
            case 4 : w = "four";
                System.out.println("four");
                break;
            case 5 : w = "fife";
                System.out.println("fife");
                break;
            case 6 : w = "six";
                System.out.println("six");
                break;
            case 7 : w = "seven";
                System.out.println("seven");
                break;
            case 8 : w = "eight";
                System.out.println("eight");
                break;
            case 9 : w = "nine";
                System.out.println("nine");
                break;
            case 10 : w = "ten";
                System.out.println("tan");
                break;
            default:
                w = "Error";
                System.out.println("Error");


        }



    }
}