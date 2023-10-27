import java.util.Objects;
import java.util.Scanner;

public class Authentication {
    public static int logIn() {
        //Sicherheit kann mit Token verbessert werden
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter your PW: ");
        String pw = scanner.nextLine();
        Customer customer = ObjectsDB.customerMap.get(id);
        if (customer == null) {
            System.out.println("Log-In failed");
            logIn();
        } else if (Objects.equals(customer.password, pw)) {
            System.out.println("Hello");
        } else {
            System.out.println("Log-In failed");
            logIn();
        }
        return id;
    }

    public static void logOut() {
        logIn();
        //Token hier auf NULL setzen
    }
}
