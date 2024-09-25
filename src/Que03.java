import java.util.*;
public class Que03 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
    System.out.println("Enter the length in centimeters");
    int length = input.nextInt();

    int inches = (int)(length/2.54);
    int feet = (int)(inches/12);

    System.out.println("In incheses: "+inches);
    System.out.println("In Feets: "+feet);


    }
}
