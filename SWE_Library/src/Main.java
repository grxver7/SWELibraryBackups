import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Data to object
        String file = "library.csv";
        PrepareData.dataReader(file);
        options();
    }

    public static void options() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1 Log-In \n 2 ShowInventory \n 3 SerachItem \n 4 rentOptions \n Media Enter your action: ");
        int action = Integer.parseInt(scanner.nextLine());
        int userID=0;

        switch (action) {
            case 1 -> {
                userID = Authentication.logIn(); //noch als Auswahl, später nötig
            }
            case 2 -> {
                InteractionsMedia.showInventory();
            }
            case 3 -> {
                InteractionsMedia.searchItem();
            }
            case 4 -> {
                RentOptions.rentOptions(userID);
            }
        }
        options();
    }
}