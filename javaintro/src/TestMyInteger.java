// Class:      CS 1301/04
// Term:       Fall 2016
// Name:       Suzanna Carter
// Instructor: Dr.Haddad
// Assignment: 14

public class TestMyInteger {
    public static void main(String[] args) {
        MyInteger integer = new MyInteger(16);

        System.out.println(integer.getValue() + " is even. " + integer.isEven());
        System.out.println(integer.getValue() + " is odd. " + integer.isOdd());
        System.out.println(integer.getValue() + " is a prime number. " + integer.isPrime());
        
        System.out.println("22 is even. " + MyInteger.isEven(22));
        System.out.println("98 is odd. " + MyInteger.isOdd(98));
        System.out.println("5 is a prime number. " + MyInteger.isPrime(5));
        
        MyInteger int1 = new MyInteger(7);
        MyInteger int2 = new MyInteger(7);
        
        System.out.println(int1.getValue() + " is even. " + int2.isEven(int1));
        System.out.println(int1.getValue() + " is odd. " + int2.isOdd(int1));
        System.out.println(int1.getValue() + " is a prime number. " + int2.isPrime(int1));
        
        System.out.println("7 = 7 " + int1.equals(7));
        System.out.println("7 = 7 " + int1.equals(int2));
        System.out.println("Char array to int: " + MyInteger.parseInt(new char[] {'1', '2', '3'}));
        System.out.println("String to int: " + MyInteger.parseInt("123"));
        
    }
}
