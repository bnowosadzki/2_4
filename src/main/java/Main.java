// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w kalkulatorze!");
        System.out.println("Podaj pierwszą liczbę:");
        double liczba1 = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę:");
        double liczba2 = scanner.nextDouble();

        System.out.println("Wybierz operację:");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");

        int wybor = scanner.nextInt();

        double wynik = 0;
        switch (wybor) {
            case 1:
                wynik = liczba1 + liczba2;
                break;
            case 2:
                wynik = liczba1 - liczba2;
                break;
            case 3:
                wynik = liczba1 * liczba2;
                break;
            case 4:
                if (liczba2 != 0) {
                    wynik = liczba1 / liczba2;
                } else {
                    System.out.println("Nie można dzielić przez zero!");
                    return;
                }
                break;
            default:
                System.out.println("Błędny wybór!");
                return;
        }

        System.out.println("Wynik: " + wynik);

        scanner.close();
    }
}


  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
