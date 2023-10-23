import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Data to object
        String file = "library.csv";
        PrepareData.dataReader(file);

        Scanner scanner = new Scanner(System.in);

        System.out.print("1 Log-In \n 2 ShowInventory \n 3 SerachItem \n Enter your action: ");
        int action = Integer.parseInt(scanner.nextLine());
        switch (action) {
            case 1 -> {
                Authentication.logIn();
            }
            case 2 ->{
                InteractionsMedia.showInventory();
            }
            case 3 ->{
                InteractionsMedia.searchItem();
            }
        }
    }
}