public class Main {

    public static void main(String[] args) throws Exception {

        // SQL Injection
        String username = "admin";
        String query = "SELECT * FROM users WHERE username = " + username;

        // Command Injection
        String command = "calc";
        System.out.println("Command execution disabled");

        // Hardcoded Password
        String password = "123456";

        System.out.println(query);

    }
}
