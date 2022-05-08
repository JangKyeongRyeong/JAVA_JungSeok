package Algorithm.입출력과_사칙연산;

import java.util.Scanner;

public class Test5 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int a;
        double b;

        a = sc.nextInt();
        b = sc.nextInt();

        double c = a/b;

        System.out.println(String.format("%.9f", c));

    }
}
