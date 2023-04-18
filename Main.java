import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String rest;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Welcome to the Scynet-calc");
            double num_one, num_two;
            String charac;
            System.out.println("Введите первое число: ");
            num_one = sc.nextInt();
            System.out.println("Введите знак(+, -, *, /): ");
            charac = sc.next();
            System.out.println("Введите последнее число:");
            num_two = sc.nextInt();
            switch (charac) {
                case "+":
                    System.out.println("Response: " + (num_one + num_two));
                    break;
                case "-":
                    System.out.println("Response: " + (num_one - num_two));
                    break;
                case "*":
                    System.out.println("Response: " + (num_one * num_two));
                    break;
                case "/":
                    System.out.println("Response: " + (num_one / num_two));
                    break;
                default:
                    System.out.println("Invalid char");
                    break;
            }
            System.out.println("Restart? N/y");
            rest = sc.next();
        } while (rest.equals("y"));
        sc.close();
    }
}