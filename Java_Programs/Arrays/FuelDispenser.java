package Arrays;
import java.util.Scanner;

public class FuelDispenser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        while (sc.hasNext()) {
            int litres = sc.nextInt();
            if (litres > 10) {
                count++;
            
            }
        }

        System.out.print(count);
        
    }
}