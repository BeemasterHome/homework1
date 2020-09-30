package less6;



import java.util.Scanner;

public class Main {
    static Scanner tt = new Scanner (System.in);
    public static void main(String[] args) {
        int a = tt.nextInt();
        int b = tt.nextInt();

        Boolean x = a*a + b*b <= 4;
        Boolean y = (a >= 0) | (b * b !=  0 );
        Boolean z = ( a * b != 0) | ( a < b);
        System.out.println(x + " " + y + " " + z);

    }
}

