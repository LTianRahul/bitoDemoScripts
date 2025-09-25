public class LoginDemo {

    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password123";

    public static void main(String[] args) {
        String inputUsername = "admin";     // Simulated user input
        String inputPassword = "password123";

        System.out.println("Attempting login with username: " + inputUsername + " and password: " + inputPassword);

        if (inputUsername.equals(USERNAME) && inputPassword.equals(PASSWORD)) {
            System.out.println("✅ Login successful");
        } else {
            System.out.println("❌ Login failed");
        }
    }
}
