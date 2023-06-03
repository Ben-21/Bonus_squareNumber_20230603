
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the number you want to square: ");
        int inputNumber = scanner.nextInt();

        Calculations squareNumber = new Calculations();
        int result = squareNumber.squareNumber(inputNumber);
        System.out.println(inputNumber + " --> " + result);

    }
}


