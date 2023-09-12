package mock_11_req2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        University university = new University();

        System.out.println("Enter the name of the University:");
        university.setName(scanner.nextLine());

        int choice;
        do {
            System.out.println("1. Add College");
            System.out.println("2. Delete College");
            System.out.println("3. Display Colleges");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter college details separated by commas: ");
                    String collegeDetails = scanner.nextLine();
                    College college = College.createCollege(collegeDetails);
                    if (college != null) {
                        university.addCollegeToUniversity(college);
                    } else {
                        System.out.println("Invalid college details format. College not added.");
                    }
                    break;
                case 2:
                    System.out.print("Enter the name of the college to be deleted: ");
                    String collegeNameToDelete = scanner.nextLine();
                    university.removeCollege(collegeNameToDelete);
                    break;
                case 3:
                    university.displayColleges();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

	}

}
