import java.util.Scanner;

public class monthFinder {

    public static void main(String[] args) {

          //                        Find the days in a month from month number.
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter the month in number:");
        switch(scn.nextInt()){
            case 1,3,5,7,8,10,12:
                System.out.println("This month have 31 days");
                break;
            case 4,6,9,11:
                System.out.println("This month have 30 days");
                System.out.println("Printing for test");
                break;
            case 2:
                System.out.println("This month have 28 days");
                System.out.println("It might be febuarary");
                break;
            default:
                System.out.println("Wrong entry");
        }
        System.out.println("printing for jenkins build test. ");
    }
}
