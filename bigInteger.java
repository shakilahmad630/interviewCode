package interviewCode;


import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class bigInteger {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        BigInteger num1 = sc.nextBigInteger();
        BigInteger num2 = sc.nextBigInteger();
        BigInteger num3, num4;

            num3 = num1.add(num2);
            num4 = num1.multiply(num2);
            System.out.println(num3);
            System.out.print(num4);


    }
}
