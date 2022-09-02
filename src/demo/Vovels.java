package demo;

public class Vovels {
    public static void main(String[] args) {
        //for counting and checking the vowels in a given string
        String s = "This is just a string which I am writing to find how many vowels ar ether in this string and to count how many?";

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {

                System.out.println("character at " + i + " index is " + s.charAt(i));
                count++;
            }
        }
        System.out.println("total number of vowels in the provide string is: " + count);
    }
}
