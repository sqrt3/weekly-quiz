package weekly.q03;

public class Main {
    private static final String USERNAME = "";
    private static final String PASSWORD = "";
    public static void main(String[] args) {
        DatabaseController dc = new DatabaseController(USERNAME, PASSWORD);
        dc.getResult();
    }
}
