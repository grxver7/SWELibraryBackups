public class Main {
    public static void main(String[] args) {

        //Data to object
        String file = "library.csv";
        PrepareData.dataReader(file);
        Authentication.logIn();
    }
}