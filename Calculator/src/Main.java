import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println(" 1.sum\n 2.sub\n 3.mul\n 4.div\n 5.mod");
        System.out.println("Enter the value of a and b  by pressing entrer:");

        Scanner calculator = new Scanner(System.in);

        int a = calculator.nextInt();
        int b = calculator.nextInt();


        int button = calculator.nextInt();
        switch (button) {
            case 1:
                int sum = a + b;
                System.out.println("The addition of two number is :" + sum);
                break;
            case 2:
                int sub = a - b;
                System.out.println("The Subtraction of two number is :" + sub);
                break;
            case 3:
                int mul = a * b;
                System.out.println("The Multiplication of two number is :" + mul);
                break;
            case 4:
                int div = a / b;
                System.out.println("The Divisor of two number is :" + div);
                break;
            case 5:
                int mod = a % b;
                System.out.println("The Reminder of two number is :" + mod);
                break;
             default:System.out.println("invalid input");

        }


    }


}
