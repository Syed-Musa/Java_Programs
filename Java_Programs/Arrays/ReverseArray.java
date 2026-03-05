import java.util.*;

 class Solution {
    // Function to reverse the array in-place
    public void reverseArray(int[] arr) {
        // Initialize pointer to the beginning of the array
        int p1 = 0;

        // Initialize pointer to the end of the array
        int p2 = arr.length - 1;

        // Loop until the two pointers meet in the middle
        while (p1 < p2) {
            // Swap the elements at p1 and p2
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;

            // Move the left pointer one step to the right
            p1++;

            // Move the right pointer one step to the left
            p2--;
        }
    }
}

// Driver code
public class ReverseArray {
    public static void main(String[] args) {
        // Create a Solution object
        Solution sol = new Solution();

        // Input array
        int[] arr = {1, 2, 3, 4, 5};

        // Call the reverse function
        sol.reverseArray(arr);

        // Print the reversed array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}