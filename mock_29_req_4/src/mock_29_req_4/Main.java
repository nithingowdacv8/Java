package mock_29_req_4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of mobiles: ");
        int numMobiles = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        List<Mobile> mobileList = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        for (int i = 0; i < numMobiles; i++) {
            String mobileDetails = scanner.nextLine();
            String[] details = mobileDetails.split(",");
            String referenceId = details[0];
            String modelName = details[1];
            Double displaySize = Double.parseDouble(details[2]);
            Double price = Double.parseDouble(details[3]);
         // Inside the loop where you create Mobile objects
            String launchedDateStr = details[4];
            Date launchedDate = dateFormat.parse(launchedDateStr);

            Mobile mobile = new Mobile(referenceId, modelName, displaySize, price, launchedDate);

            mobileList.add(mobile);
        }

        MobileBO1 mobileBO = new MobileBO1();

        System.out.println("Enter a search type:");
        System.out.println("1. By Model Name");
        System.out.println("2. By Display Size");
        int searchType = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (searchType) {
            case 1:
                System.out.print("Enter the Model Name: ");
                String searchModelName = scanner.nextLine();
                List<Mobile> foundByModelName = mobileBO.findMobile(mobileList, searchModelName);

                if (foundByModelName.isEmpty()) {
                    System.out.println("No such mobile is present");
                } else {
                    System.out.println("Reference Id      Model Name      Display Size  Price      Launched Date");
                    for (Mobile mobile : foundByModelName) {
                        System.out.println(mobile);
                    }
                }
                break;

            case 2:
                System.out.print("Enter the Display Size: ");
                Double searchDisplaySize = scanner.nextDouble();
                List<Mobile> foundByDisplaySize = mobileBO.findMobile(mobileList, searchDisplaySize);

                if (foundByDisplaySize.isEmpty()) {
                    System.out.println("No such mobile is present");
                } else {
                    System.out.println("Reference Id      Model Name      Display Size  Price      Launched Date");
                    for (Mobile mobile : foundByDisplaySize) {
                        System.out.println(mobile);
                    }
                }
                break;

            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}