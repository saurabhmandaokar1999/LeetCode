//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long N = sc.nextLong();

            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for (long num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> al = new ArrayList<>();
        factorialHelper(n, 1, 1, al);
        return al;
    }

    static void factorialHelper(long n, long fact, int count, ArrayList<Long> al) {
        if (fact > n) {
            return;
        }
        al.add(fact);
        factorialHelper(n, fact * (count + 1), count + 1, al);
    }
}
