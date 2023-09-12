package mock_29_req_1;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter mobile 1 detail ");
        String mobile1Details = scanner.nextLine();
        String[] mobile1Info = mobile1Details.split(",");
        if (mobile1Info.length != 5) {
            System.out.println("Invalid input format for mobile 1. Please provide all required details.");
            return;
        }
        Mobile mobile1 = new Mobile(mobile1Info[0], mobile1Info[1], Double.parseDouble(mobile1Info[2]),
                Double.parseDouble(mobile1Info[3]), mobile1Info[4]);

        System.out.println("Enter mobile 2 detail ");
        String mobile2Details = scanner.nextLine();
        String[] mobile2Info = mobile2Details.split(",");
        if (mobile2Info.length != 5) {
            System.out.println("Invalid input format for mobile 2. Please provide all required details.");
            return;
        }
        Mobile mobile2 = new Mobile(mobile2Info[0], mobile2Info[1], Double.parseDouble(mobile2Info[2]),
                Double.parseDouble(mobile2Info[3]), mobile2Info[4]);

        System.out.println("\nMobile 1");
        System.out.println(mobile1.toString());
        System.out.println("\nMobile 2");
        System.out.println(mobile2.toString());

        if (mobile1.equals(mobile2)) {
            System.out.println("\nMobile 1 is same as Mobile 2");
        } else {
            System.out.println("\nMobile 1 and Mobile 2 are different");
        }
    }
}