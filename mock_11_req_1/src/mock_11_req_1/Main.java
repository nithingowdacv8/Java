package mock_11_req_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter college 1 detail:");
        String college1Details = scanner.nextLine();

        System.out.println("Enter college 2 detail:");
        String college2Details = scanner.nextLine();

        String[] college1Data = college1Details.split(",");
        String[] college2Data = college2Details.split(",");

        College college1 = new College(college1Data[0], college1Data[1], college1Data[2], college1Data[3],
                Integer.parseInt(college1Data[4]), college1Data[5], new java.sql.Date(0));

        College college2 = new College(college2Data[0], college2Data[1], college2Data[2], college2Data[3],
                Integer.parseInt(college2Data[4]), college2Data[5], new java.sql.Date(0));

        System.out.println("College 1:");
        System.out.println(college1);

        System.out.println("College 2:");
        System.out.println(college2);

        if (college1.equals(college2)) {
            System.out.println("College 1 is same as College 2");
        } else {
            System.out.println("College 1 and College 2 are different");
        }
    }
}
