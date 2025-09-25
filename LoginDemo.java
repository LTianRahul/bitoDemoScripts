public class LoginDemo {

    // ❌ Hardcoded credentials - insecure
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password123";

    public static void main(String[] args) {
        String inputUsername = "admin";     // Simulated user input
        String inputPassword = "password123";

        // ❌ Logging sensitive info
        System.out.println("Attempting login with username: " + inputUsername + " and password: " + inputPassword);

        // ❌ No input validation (e.g., null/empty checks skipped)

        // ❌ Tight coupling - business logic inside main method
        if (inputUsername.equals(USERNAME) && inputPassword.equals(PASSWORD)) {
            System.out.println("✅ Login successful");
        } else {
            // ❌ No user-friendly error handling
            System.out.println("❌ Login failed");
        }
    }
}
