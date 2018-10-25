import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int number;
        boolean prime = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        number = scanner.nextInt();

        for (int i = 2; i < number - 1; i++){
            if (number % i == 0 ){
                prime = false;
                System.out.print(number + " isn't the prime number");
            }
        }

        if (prime && number != 1 && number != 0){
            System.out.print(number + " is the prime number");
        } else System.out.print(number + " isn't the prime number");
    }
}
