import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Data to object
        String file = "SWE_Library/library.csv";
        PrepareData.dataReader(file);
        int userID = Authentication.logIn(); //noch als Auswahl, später nötig
        options(userID);
    }

    public static void options(int userID) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1 SeeCostumerAccount \n2 ShowInventory \n3 SearchItem \n4 rentOptions \n5 logOut  \n\nMedia Enter your action: ");
        int action = Integer.parseInt(scanner.nextLine());

        switch (action) {
            case 1 -> {
                CostumerAccount.seeCostumerAccount(userID);
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
            case 5 -> {
                userID= Authentication.logOut();
            }
        }
        options(userID);
    }
}