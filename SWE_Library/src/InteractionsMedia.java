import java.util.Map;
import java.util.Scanner;

public class InteractionsMedia {
    public static void searchItem() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        String answer;
        System.out.println("Search: ");
        String input = scanner.nextLine();
        input = input.toLowerCase();
        for (Map.Entry<String, Media> entry : ObjectsDB.mediaMap.entrySet()) {
            Media mediaToCompare = entry.getValue();
            String compare = mediaToCompare.name;
            compare = compare.toLowerCase();
            if (compare.contains(input)) {
                Media media = ObjectsDB.mediaMap.get(entry.getKey());
                answer = "Searchresult " + counter + ": ";
                answer += "\nMediaCategory: " + media.mediaCategory;
                answer += "\nMediaID: " + media.id;
                answer += "\nMediaName: " + media.name;
                answer += "\nPublishDate: " + media.publishDate;
                answer += "\nPublisher: " + media.publisher;
                System.out.println(answer + "\n");
                counter++;
            }
        }
        if (counter == 0) {
            answer = "Product don't exists in this storage";
            System.out.println(answer);
        }
    }

    public static void showInventory() {
        int counter = 0;
        String answer;
        for (Map.Entry<String, Media> entry : ObjectsDB.mediaMap.entrySet()) {
            Media media = entry.getValue();
            answer = "Item " + counter + ": ";
            answer += "\nMediaCategory: " + media.mediaCategory;
            answer += "\nMediaID: " + media.id;
            answer += "\nMediaName: " + media.name;
            answer += "\nPublishDate: " + media.publishDate;
            answer += "\nPublisher: " + media.publisher;
            System.out.println(answer + "\n");
            counter++;
        }
        if (counter == 0) {
            answer = "Product don't exists in this storage";
            System.out.println(answer);
        }
    }
}
