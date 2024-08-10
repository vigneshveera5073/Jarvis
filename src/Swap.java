import java.util.Scanner;
public class Swap {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a first number : ");
        int number1=scanner.nextInt();
        System.out.println("Enter a second number : ");
        int number2=scanner.nextInt();
        System.out.println("After swap first number is : "+(number1^(number1^number2))+"\nAfter swap second number is : "+(number2^(number1^number2)));
    }
}
