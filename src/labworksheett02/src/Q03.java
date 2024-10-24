import java.util.*;
public class Q03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number you want rows in the piramide");
        int rows = input.nextInt();
        int space =rows+1;
        System.out.print(" ");
        for (int i = 1; i <= rows; i++) {

           int s=1;
            while(s<=space){
                System.out.print(" ");

             s++;
            }


            for (int t = 1; t <= (2 * i - 1); t++) {
                System.out.print("* ");
            }

            System.out.println();
            space=space-1;

        }

    }
}
