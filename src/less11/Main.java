package less11;

import java.util.Scanner;

public class Main {
    static Scanner tt = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("Введите координату х точки А");
       System.out.println("Введите координату у точки А");
      //  System.out.println("Введите координату х точки В");
       // System.out.println("Введите координату у точки В");
      //  System.out.println("Введите координату х точки С");
      //  System.out.println("Введите координату у точки С");
     //   System.out.println("Введите координату х точки D");
     //   System.out.println("Введите координату у точки D");
     //   System.out.println("Введите координату х точки E");
     //   System.out.println("Введите координату у точки E");
     //   System.out.println("Введите координату х точки F");
      //  System.out.println("Введите координату у точки F");
      //  System.out.println("Введите координату х точки G");
       // System.out.println("Введите координату у точки G");
       // System.out.println("Введите координату х точки Z");
      //  System.out.println("Введите координату у точки Z");
        int x1 = 2;
        int y1 = 6;
        int x2 = 6;
        int y2 = 4;

        int x = tt.nextInt();
        int y = tt.nextInt();
        int xt = tt.nextInt();
        int yt = tt.nextInt();

boolean p = x > x1 &  x < x2 & y > y2 & y < y1;
boolean p2 = xt > x1 &  xt < x2 & yt > y2 & yt < y1;
        boolean p3 = x > x1 &  x < x2 & y > y2 & y < y1 & xt > x1 &  xt < x2 & yt > y2 & yt < y1 ;
        if (p3 = true ) {
            System.out.println( p3 + "Все прямоугольники пересикаються");
        }else {
            System.out.println(p3 + "Все прямоугольники не пересикаються");
        }

if (p = true ) {
    System.out.println( p + "2 прямоугольник пересекаэться с 1 ");
}else{
    System.out.println( p + " 2 не пересекаються с 1");
}
    //    if ( xt < x1 & xt > xt1 & yt < y1 & yt > yt1){
       //         System.out.println(" прямоугольники пересекаються");
       // }

       // int x3 = tt.nextInt();
       // int y3 = tt.nextInt();
       // int x4 = tt.nextInt();
       // int y4 = tt.nextInt();
       // int x5 = tt.nextInt();
       // int y5 = tt.nextInt();
      //  int x6 = tt.nextInt();
       // int y6 = tt.nextInt();
      //  int x7 = tt.nextInt();
      //  int y7 = tt.nextInt();
       // int x8 = tt.nextInt();
      //  int y8 = tt.nextInt();
        // x1= 2 ; y1 = 6 x2 =6; y2= 4;



    }
}