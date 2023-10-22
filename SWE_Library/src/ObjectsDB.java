import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ObjectsDB {
    public static HashMap<Integer, Person> customerMap = new HashMap<>();
    public static HashMap<Integer, Person> employeeMap = new HashMap<>();
    public static HashMap<String, Books> bookMap = new HashMap<>();
    public static HashMap<String, DVD> dvdMap = new HashMap<>();
    public static HashMap<String, Newspaper> newspaperMap = new HashMap<>();
    public static HashMap<String, Map> mapMap = new HashMap<>();
    public static void createCustomer(String personReaderID, String personPW, String personType) {
        Integer id=Integer.parseInt(personReaderID);
        if (customerMap.containsValue(id)) {
            return;
        }
        Customer customer = new Customer();
        customer.id = id;
        customer.password = personPW;
        customer.personType = PersonType.valueOf(personType);
        customerMap.put(id, customer);
    }

    public static void createEmployee(String personReaderID, String personPW, String personType) {
        Integer id=Integer.parseInt(personReaderID);
        if (employeeMap.containsValue(id)) {
            return;
        }
        Employee employee = new Employee();
        employee.id = id;
        employee.password = personPW;
        employee.personType = PersonType.valueOf(personType);
        employeeMap.put(id, employee);
    }
    public static void createBook(String mediaCategory, String mediaID, String mediaName, String publishDate, String publisher) {
        if (bookMap.containsValue(mediaID)) {
            return;
        }
        Books book = new Books();
        book.id = mediaID;
        book.name = mediaName;
        book.mediaCategory = MediaCategory.valueOf(mediaCategory);
        book.publishDate = LocalDate.parse(publishDate, DateTimeFormatter.BASIC_ISO_DATE);
        book.publisher = publisher;
        bookMap.put(mediaID, book);
    }
    public static void createDVD(String mediaCategory, String mediaID, String mediaName, String publishDate) {
        if (dvdMap.containsValue(mediaID)) {
            return;
        }
        DVD dvd = new DVD();
        dvd.id = mediaID;
        dvd.name = mediaName;
        dvd.mediaCategory = MediaCategory.valueOf(mediaCategory);
        dvd.publishDate = LocalDate.parse(publishDate, DateTimeFormatter.BASIC_ISO_DATE);
        dvdMap.put(mediaID, dvd);
    }
    public static void createNewspaper(String mediaCategory, String mediaID, String mediaName, String publishDate, String publisher) {
        if (newspaperMap.containsValue(mediaID)) {
            return;
        }
        Newspaper newspaper = new Newspaper();
        newspaper.id = mediaID;
        newspaper.name = mediaName;
        newspaper.mediaCategory = MediaCategory.valueOf(mediaCategory);
        newspaper.publishDate = LocalDate.parse(publishDate, DateTimeFormatter.BASIC_ISO_DATE);
        newspaper.publisher = publisher;
        newspaperMap.put(mediaID, newspaper);
    }
    public static void createMap(String mediaCategory, String mediaID, String mediaName, String publishDate) {
        if (mapMap.containsValue(mediaID)) {
            return;
        }
        Map map = new Map();
        map.id = mediaID;
        map.name = mediaName;
        map.mediaCategory = MediaCategory.valueOf(mediaCategory);
        map.publishDate = LocalDate.parse(publishDate, DateTimeFormatter.BASIC_ISO_DATE);
        mapMap.put(mediaID, map);
    }
}
