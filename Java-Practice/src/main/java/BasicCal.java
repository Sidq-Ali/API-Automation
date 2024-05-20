import java.util.Scanner;

public class BasicCal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b;
        char op;
        System.out.println("Enter the first number: ");
        a = scan.nextInt();
        System.out.println("Enter the second number: ");
        b = scan.nextInt();


        System.out.println("Enter any operater you want to perform: ");
        op = scan.next().charAt(0);

    switch (op) {
        case '+':
            System.out.println("The addition of two numbers is: " + (a + b));
            break;
        case '-':
            System.out.println("The substraction of two numbers is: " + (a - b));
            break;
        case '*':
            System.out.println("The multiplication of two numbers is: " + (a * b));
            break;
        case '/':
            System.out.println("The division of two numbers is: " + (a / b));
            break;
        case '%':
            System.out.println("The modulus of two numbers is: " + (a % b));
            break;
        default:
            System.out.println("Invalid operator");

}

    }
}
