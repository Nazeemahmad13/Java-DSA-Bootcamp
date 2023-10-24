package com.Nazeem;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


//        String fruit = in.next();
//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("A sweet red fruit");
//            case "Orange" -> System.out.println("Round fruit");
//            case "Grapes" -> System.out.println("Smalle fruit");
//            default -> System.out.println("please enter a valid fruit");
//        }


//        int day = in.nextInt();
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//        }

        int empID = in.nextInt();
        String department = in.next();
        switch (empID) {
            case 1:
                System.out.println("Kunal Kusbwaha");
                break;
            case 2:
                System.out.println("Rahul Rana");
                break;
            case 3:
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department");
                }
                break;
            default:
                System.out.println("Enter correct EmpID");

        }
    }
}
