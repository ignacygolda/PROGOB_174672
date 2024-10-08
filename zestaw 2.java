import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //zadanie 1
        System.out.println(23.0+76);
        System.out.println(41*2.0+3);
        System.out.println(5-33);
        System.out.println(109%3);
        System.out.println(50/2);
        System.out.println(4|2);
        System.out.println(3^5);
        System.out.println(7&9);

        //zadanie 2
        double a = (Math.sqrt(7)-1)/2+Math.pow(3,3)%2;
        int b = (int) a;
        System.out.println(b);

        //zadanie 3
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj pierwsze słowo");
        String slowo1 = scan.nextLine();
        System.out.println("podaj drugie słowo");
        String slowo2 = scan.nextLine();
        System.out.println(slowo1 + " " + slowo2);

        //zadanie 4
        System.out.println("podaj pierwsza liczbe");
        int l1 = scan.nextInt();
        System.out.println("podaj druga liczbe");
        int l2 = scan.nextInt();
        int suma =l1+l2;
        System.out.println("suma: " + suma);
        int roznica =l1-l2;
        System.out.println("roznica: " + roznica);
        int iloczyn =l1*l2;
        System.out.println("iloczyn: " + iloczyn);
        int iloraz =l1/l2;
        System.out.println("iloraz: " + iloraz);

        //zadanie 5
        System.out.println("podaj x");
        int x = scan.nextInt();
        System.out.print(x+140);
        System.out.print("\n");
        System.out.print(x-31);
        System.out.print("\n");
        System.out.print(x*7);
        System.out.print("\n");
        System.out.print(x/13.0);
        System.out.print("\n");
        System.out.print(x%7);
        System.out.print("\n");
        System.out.print(x/4);
        System.out.print("\n");
        System.out.print(Math.pow(x,45));
        System.out.print("\n");
        System.out.print(x&67);
        System.out.print("\n");
        System.out.print(x|59);
        System.out.print("\n");
        System.out.print(x^59);
        System.out.print("\n");
        System.out.print(x<<5);
        System.out.print("\n");
        System.out.print(x>>6);
        System.out.print("\n");
    }
}