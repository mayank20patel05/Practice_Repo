package assignemnt;

public class aug13 {

    public static void main(String[] args) {
        String s = "Mayank Patel";

        System.out.println(s.codePointAt(1));

       /*// to print first 100 natural numbers'
        int n = 100;
        int i = 1;
        while(i<=n){
            if (i != n) {
                System.out.print(i + ", ");
            }
            else{
                System.out.print(i);
            }
            i++;
        }*/


/*        //Logic to find no. of days in a month

        System.out.println("Enter first three letter of month name to find out days in that month");
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();

        switch (month) {
            case "jan", "mar", "may", "jul", "aug", "oct", "dec" -> System.out.println("Month of " + month + " has 31 days");
            case "feb" -> System.out.println("Month of " + month + " has 29 days ");
            case "apr", "jun", "sep", "nov" -> System.out.println("Month of " + month + " has 30 days ");
            default -> System.out.println("Please enter valid month name");
        }
*/

/*        System.out.println("Welcome to Calculator");

        Scanner scanner = new Scanner(System.in);
        int operation;
        do {
            System.out.println("""
                    Please make a choice from below operators
                     Press 1 to perform summation (+)
                     Press 2 to perform subtraction (-)
                     Press 3 to perform multiplication (*)
                     Press 4 to perform division (/)
                     Press 5 to perform modules (%)
                     Press 0 to exit from the calculator (exit)""");

            operation = scanner.nextInt();

                System.out.println("Enter first number");
                double a = scanner.nextDouble();
                System.out.println("Enter second number");
                double b = scanner.nextDouble();

            switch (operation) {
                case 1 -> System.out.println("Summation of " + a + " & " + b + " is: " + (a + b));
                case 2 -> System.out.println("Difference of " + a + " & " + b + " is: " + Math.abs(a - b));
                case 3 -> System.out.println("multiplication of " + a + " & " + b + " is: " + (a * b));
                case 4 -> System.out.println("Division of " + a + " & " + b + " is: " + (a / b));
                case 5 -> System.out.println("modules of " + a + " & " + b + " is: " + (a % b));
                case 0 -> System.out.println("Exiting the calculator");
                default -> System.out.println("please make a valid choice.");
            }
        } while (operation != 0);*/


        /*
        //Number guessing game
        int n = (int)(Math.random()*100);
        System.out.println(n);
        Scanner scanner = new Scanner(System.in);
        int num;
        do{
            System.out.println("Guess the number");
            num = scanner.nextInt();
            if(n == num){
                System.out.println("you won the game");
                break;
            }
            else if(n >50){
                System.out.println("number is greater then 50");
            }
            else if (n <= 50){
                System.out.println("number is less then or equal to 50");
            }
        }while(n != num);
        */

       /*
        //logic to print total marks of each student using for loop
        int[][] marks = {
                {11, 22, 33, 22, 11},
                {22, 33, 55, 22, 66},
                {56, 23, 33, 35, 85}
        };
        int totalMarks;
        for (int i = 0; i < marks.length; i++) {
            totalMarks =0;
            for (int j = 0; j < marks[0].length; j++) {
                totalMarks += marks[i][j];
            }
            System.out.println("Total marks of student no. " + (i+1) + " is: " + totalMarks);
        }
        */

//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println(Arrays.toString(aug13.getPivotArray(arr, 3)));
        



    }



    private static int[] getPivotArray(int[] arr, int pivotIndex) {
        int[] ar = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (i >= pivotIndex) {
                ar[i - pivotIndex] = arr[i];
            }
            if (i < pivotIndex) {
                ar[(arr.length - pivotIndex) + i] = arr[i];
            }
        }
        return ar;
    }

}
