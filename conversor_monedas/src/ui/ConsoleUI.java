package ui;

import model.Currency;
import service.ExchangeService;

import java.util.Map;
import java.util.Scanner;

public class ConsoleUI {

    public void run() {
        ExchangeService service = new ExchangeService();
        Map<String, Double> rates = service.getRates();

        if (rates == null) {
            System.out.println("No se pudo obtener las tasas de cambio.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            showMenu();
            option = scanner.nextInt();

            if (option == 0) break;

            System.out.print("Ingrese el monto a convertir: ");
            double amount = scanner.nextDouble();

            // Lógica de conversión
            convertCurrency(option, amount, rates);

        } while (option != 0);

        System.out.println("Gracias por usar el conversor de monedas.");
    }

    private void showMenu() {
        System.out.println("=== Conversor de Monedas ===");
        System.out.println("1. USD -> ARS");
        System.out.println("2. ARS -> USD");
        System.out.println("3. BRL -> USD");
        System.out.println("4. USD -> BRL");
        System.out.println("5. USD -> COP");
        System.out.println("6. COP -> USD");
        System.out.println("7. EUR -> USD");
        System.out.println("8. USD -> EUR");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private void convertCurrency(int option, double amount, Map<String, Double> rates) {
        String from = "";
        String to = "";

        switch (option) {
            case 1: from = "USD"; to = "ARS"; break;
            case 2: from = "ARS"; to = "USD"; break;
            case 3: from = "BRL"; to = "USD"; break;
            case 4: from = "USD"; to = "BRL"; break;
            case 5: from = "USD"; to = "COP"; break;
            case 6: from = "COP"; to = "USD"; break;
            case 7: from = "EUR"; to = "USD"; break;
            case 8: from = "USD"; to = "EUR"; break;
            default:
                System.out.println("Opción inválida.");
                return;
        }

        double rateFrom = rates.get(from);
        double rateTo = rates.get(to);
        double result = amount * (rateTo / rateFrom);

        System.out.printf("%.2f %s = %.2f %s%n", amount, from, result, to);
        System.out.println();
    }
}
