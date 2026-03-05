package Arrays;
import java.util.*;
public class Min_Val {

public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);

  int N = sc.nextInt();
  int arr[]= new int[N];

  for(int i=0;i<N;i++){
    arr[i]=sc.nextInt();
  }

  System.out.print(min(arr));   

}

public static int min(int arr[])
{

int min_val=arr[0];
for(int i=0;i<arr.length;i++){
    if (arr[i]<min_val){

        min_val=arr[i];

    }

}

return min_val;



}    
}
