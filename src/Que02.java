import java.util.*;
public class Que02 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Enter your full name as first middle and last");
      String fullName = input.nextLine();

      int index = fullName.indexOf(" ");
      String firstName = fullName.substring(0,index);

      int lastspaceindex = fullName.lastIndexOf(" ");
      String lastName = fullName.substring(lastspaceindex);

      char middleInitial = fullName.charAt(index+1);

      System.out.println(lastName+", "+firstName+" "+middleInitial+".");



    }
}
