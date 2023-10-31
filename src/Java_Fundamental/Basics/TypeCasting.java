package Java_Fundamental;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //type casting
//        int num = (int)(56.67);
//        System.out.println(num);

        //automatic type promotion in expressions

//        int a = 257;
//        byte b = (byte)(a);  //257 % 256 = 1

//        byte a =40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b /c;
//
//        System.out.println(d);


//        byte b =50;
//        b = b * 2;  it give a wrong

//        int number = 'A';
//        System.out.println(number);



//        this given bellow the example help to understand the type casting clearly

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 333.542f;
        double d = 0.2313;
        double result = (f * b) + (i / c) - (d * s);
        //f * b => b is promoted to f because f is bigger than b. It gives a float value 14008.764
        //i * c => c is promoted to i because i is bigger than c. It gives a int value 515
        //d * s => s is promoted to d because d is bigger than s. It gives a double value 236.8512
        System.out.println((f * b)+" " + (i / c) +" "+ (d * s));
        System.out.println(result);


    }
}
