import java.util.Scanner;

public class Months {

    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month;
        System.out.println("Enter the month number: e.g 1 for January, 2 for February, etc.");
        month = scan.nextInt();
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Februaty");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            default:
                System.out.println("Zamba");


    }


    }
}
