
import java.util.Scanner;
public class Q04 {

    public static void main(String[] args){
        int[] x = new int[5];
     for(int i=0;i<5;i++){
         System.out.println("Enter input"+(i+1));
        Scanner input = new Scanner(System.in);
        x[i] = input.nextInt();

     }
     int max = x[0];
     for(int j=0;j<5;j++){
         if(max<x[j]){
             max =x[j];
         }

     }
     int max2 =Integer.MIN_VALUE;
     for(int k=0;k<5;k++){
         if(x[k]!=max && max2<x[k]){
             max2=x[k];
         }
        }

     System.out.println(max2);


    }
}
