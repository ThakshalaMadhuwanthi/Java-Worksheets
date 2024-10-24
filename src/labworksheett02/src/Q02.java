import java.util.Scanner;

public class Q02 {
    public   static int countDigits(int num){
        int count=0;
        if(num == 0){
            count =1;
        }
        else{
            do{
                num = num/10;
                count ++;
            }while(num>1);


        }
        return  count;
    }





    public static void main(String[] args){
        while(true){
            Scanner input =new Scanner(System.in);
            System.out.println("Enter a number");
            int num = input.nextInt();
            if(num < 0){
                System.out.println("Negative Number has Entered");
                break;
            }
            int ans = countDigits(num);
           System.out.println("Num of Digits : "+ans);

        }


    }
}
