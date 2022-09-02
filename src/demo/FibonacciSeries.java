package demo;

public class FibonacciSeries {
    public static void main(String[] args) {


    //logic to print a fibonacci series
        int a=0 , b=1;
        System.out.print(a + ", " + b );
        for (int i = 3; i <= 10 ; i++) {
            int c = a + b;
            System.out.print(", " +c );
            a = b;
            b = c;
        }
        System.out.println();

        /* Fibonacci series Code
        System.out.println("enter the No. of elements required for fibonacci series");
        int n = scanner.nextInt();
        int[] fibonacci = new int[n];



        Array.set(fibonacci, 0 , 0);
        Array.set(fibonacci, 1 , 1);

        for (int i = 0; i < Array.getLength(fibonacci)-2 ; i++ ) {
            fibonacci[i+2] = fibonacci[i] + fibonacci[i+1];
        }
        System.out.println("Fibonacci series first " + n + " elements are: ");
        System.out.println(Arrays.toString(fibonacci)); //or
        Arrays.stream(fibonacci).forEach(System.out::println);
         */
    }
}
