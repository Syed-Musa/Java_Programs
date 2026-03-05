package Arrays;
import java.util.Scanner;

public class DigitalLogic {

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        int input=sc.nextInt();
        

        int temp=input;
        int bits=0;

        if(temp==0){
        System.out.print(1);
        }

        else{

        while (temp>0) {
            bits++;
            temp=temp/2;
        }

        int maxValue= (int)Math.pow(2, bits) - 1;
         
        int result =maxValue-input;
        System.out.print(result);

        

    }
    
 
}
}
