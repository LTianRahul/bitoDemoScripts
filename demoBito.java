public class demoBito {

    public static String registeredEmail = "";

    public static void main(String[] args) {

        String email = "test@example.com";
        String password = "123456";

 
        System.out.println("Registering user with email: " + email + " and password: " + password);

        boolean success = registerUser(email, password);

        if (success) {
            System.out.println("Registration complete");
        } else {
            System.out.println("Registration failed");
        }
    }

    public static boolean registerUser(String email, String password) {

  

        if (email.contains("@") && password.length() > 5) {
            registeredEmail = email;

            return true;
        } else {

            return false;
        }
    }
}
