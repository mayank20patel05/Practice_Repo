import java.util.*;

public class monthFinder {

    public static void main(String[] args) {

          //                        Find the days in a month from month number.
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the month in number:");
        switch(sc.nextInt()){
            case 1,3,5,7,8,10,12:
                System.out.println("This month have 31 days");
                break;
            case 4,6,9,11:
                System.out.println("This month have 30 days");
                break;
            case 2:
                System.out.println("This month have 28 days");
                break;
            default:
                System.out.print("pencho 12 months ee hunde saal vich ena v ne pta bwdbfdgw tenu");
        }
    }



}

