import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class CostumerAccount {
    public static void seeCostumerAccount(int userID) {
        int counter = 0;
        String answer;

        if (!ObjectsDB.customerMap.containsKey(userID)) {
            System.out.println("This option is only for costumers! \n");
            return;
        }
        HashMap <String, LocalDate> accountInformation = Customer.rentMap.get(userID);

        if (accountInformation==null) {
            System.out.println("Costumer has no media rent!");
            Main.options(userID);
        }
        for (String key : accountInformation.keySet()) {
            Media media = ObjectsDB.mediaMap.get(key);
            answer = "Searchresult " + counter + ": ";
            answer += "\nMediaCategory: " + media.mediaCategory;
            answer += "\nMediaID: " + media.id;
            answer += "\nMediaName: " + media.name;
            answer += "\nPublishDate: " + media.publishDate;
            answer += "\nPublisher: " + media.publisher;
            System.out.println(answer + "\n");
            System.out.println("Your Return-date is: " + key);
            System.out.println("\n");
            counter++;
        }
    }
}

