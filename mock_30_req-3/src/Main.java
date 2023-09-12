import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the reference Id to be validated:");
        String referenceId = scanner.nextLine();
        scanner.close();
        
        if (validateReferenceId(referenceId)) {
            System.out.println("Reference Id is valid");
        } else {
            System.out.println("Reference Id is invalid");
        }
    }

    public static boolean validateReferenceId(String referenceId) {
        // Regular expression pattern to match the referenceId format
        String regex = "^#([A-Z]{2,3}) (\\d{2})? ([A-Z0-9]{2,6}-\\d{2,4})$";
        
        // Compile the regular expression pattern
        Pattern pattern = Pattern.compile(regex);
        
        // Match the input referenceId against the pattern
        Matcher matcher = pattern.matcher(referenceId);
        
        return matcher.matches();
    }
}

