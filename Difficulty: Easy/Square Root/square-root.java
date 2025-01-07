//{ Driver Code Starts
import java.util.Scanner;

class SquartRoot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.floorSqrt(a));
            t--;
        }
    }
}
// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution {
    int floorSqrt(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int left = 1;
        int right = n / 2;
        int floor = 1; // Initialize floor as 1 since sqrt(n) >= 1 for n >= 1

        while (left <= right) {
            int mid = left + (right - left) / 2; // Corrected mid calculation

            if (mid == n / mid) {
                return mid; // Exact square root found
            } else if (mid < n / mid) {
                floor = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return floor;
    }
}
