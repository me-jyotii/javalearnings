import java.util.*;
public class form {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Username :: ");
        String user_name = scan.nextLine();
        if (user_name.contains(" ") || user_name.length() < 2) {
            System.out.println("\nInvalid Username");
            System.exit(0);
        }
        System.out.print("\nEnter Password :: ");
        String password = scan.nextLine();
        if (password.contains(" ") || password.length() < 8) {
            System.out.println("\nInvalid Password");
            System.exit(0);
        }
        if (user_name.length() >= 4 && password.length() >= 8) {
            System.out.println("\n"+user_name + " you are Registered\n");
        }
        System.out.print("Enter UserName :: ");
        String user1 = scan.nextLine();
        System.out.print("\nEnter Password :: ");
        String password1 = scan.nextLine();
        if (user_name.equals(user1) && password.equals(password1)) {
            System.out.println("Welcome " + user_name + " Log-in Successfull\n");
        } else {
            System.out.println("Username or Password Mismatch");
        }
    }
}
