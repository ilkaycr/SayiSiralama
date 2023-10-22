package KosulluIfadeler;

import java.util.Scanner;

public class Sıralama {
    public static void main(String[] args) {

        int a,b,c;

        Scanner input = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz");
        a = input.nextInt();
        System.out.print("2. sayıyı giriniz");
        b = input.nextInt();
        System.out.print("3. sayıyı giriniz");
        c = input.nextInt();

        if(a>b){
            int tut = a ;
            a = b;
            b = tut ;
        }

        System.out.println(a+"<"+b+"<"+c);
        if(b>c){
            int tut = b;
            b = c;
            c = tut;
        }

        System.out.println(a+"<"+b+"<"+c);

        if(a>b){
            int tut = a;
            a = b;
            b = tut;
        }

        System.out.println(a+"<"+b+"<"+c);
    }
}
