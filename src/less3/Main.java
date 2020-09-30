package less3;


import static java.lang.StrictMath.sqrt;
import java.util.Scanner;

public class Main {
    static Scanner tt = new Scanner(System.in);

    public static void main (String[]args){
        System.out.println("Напиши 3 цыфры");
        int a = tt.nextInt();
        int b = tt.nextInt();
        int c = tt.nextInt();
        int d = b*b - 4*a*c;
        Boolean dd = d<0;
        if (dd) {
            System.out.println("Нет корней");
        }else{
            System.out.println("Корни есть");
            float x1 = (float) (( -b - sqrt(d))/ 2*a);
            float x2 = (float) (( -b + sqrt(d))/ 2*a);
            System.out.println("x1 =" + x1);
            System.out.println("x2 =" + x2);
        }
    }
}