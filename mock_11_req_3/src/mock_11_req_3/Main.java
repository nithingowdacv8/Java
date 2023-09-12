package mock_11_req_3;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static final String VALID_WEBSITE_REGEX = "^(http|https)://(www\\.)?[a-zA-Z0-9\\-]+\\.[a-z]{2,6}(\\.[a-z]{2,6})?$";
    private static final String VALID_MOBILE_NUMBER_REGEX = "^\\+91[0-9]{10}$";

    public static boolean validateWebsite(String website) {
        Pattern pattern = Pattern.compile(VALID_WEBSITE_REGEX);
        Matcher matcher = pattern.matcher(website);
        return matcher.matches();
    }

    public static boolean validateMobileNumber(String mobileNumber) {
        Pattern pattern = Pattern.compile(VALID_MOBILE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }

    public static void main(String[] args) {
        int choice;
        String website, mobileNumber;

        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Print the menu
        System.out.println("1. Validate Website");
        System.out.println("2. Validate Mobile number");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Get the website from the user
                System.out.print("Enter the website to be validated: ");
                website = scanner.next();

                // Validate the website
                if (validateWebsite(website)) {
                    System.out.println("Website is valid");
                } else {
                    System.out.println("Website is invalid");
                }
                break;
            case 2:
                // Get the mobile number from the user
                System.out.print("Enter the mobile number to be validated: ");
                mobileNumber = scanner.next();

                // Validate the mobile number
                if (validateMobileNumber(mobileNumber)) {
                    System.out.println("Mobile number is valid");
                } else {
                    System.out.println("Mobile number is invalid");
                }
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
