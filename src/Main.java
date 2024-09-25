import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an oddLength word");
        String word=input.next();
        int strLength = word.length();
        while (strLength%2 ==0) {

        System.out.println("Pleace Enter an odd length word");
        word=input.next();
        strLength = word.length();
        }
        int index = (((strLength+1)/2)-1);
        char middleLetter = word.charAt(index);
        System.out.println(middleLetter);
    }
}