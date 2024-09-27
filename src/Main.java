import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        calc();

    }

    public static void calc() throws IOException {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;

        while (!isValid) {
            try {
                System.out.print("Wprowadź pierwszą liczbę: ");
                double num1 = scanner.nextDouble();

                System.out.print("Wprowadź drugą liczbę: ");
                double num2 = scanner.nextDouble();

                System.out.print("Wybierz operację(+ , - , / , *): ");
                String operations = scanner.next();

                switch (operations) {
                    case "+":
                        System.out.println(num1 + num2);
                        break;
                    case "-":
                        System.out.println(num1 - num2);
                        break;
                    case "/":
                        if (num2 != 0) {
                            System.out.println(num1 / num2);
                        }
                        else {
                            throw new ArithmeticException("Nie możesz dzielić przez zero.");
                        }
                        break;
                    case "*":
                        System.out.println(num1 * num2);
                        break;
                    default:
                        System.out.println("Wprowadź właściwy operator");
                        continue;

                }
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Wprowadź liczby.");
                scanner.next();
            } catch (ArithmeticException e) {
                System.out.println("Błąd: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Nieoczekiwany Błąd " + e.getMessage());
            }
        }
        scanner.close();
    }
}
