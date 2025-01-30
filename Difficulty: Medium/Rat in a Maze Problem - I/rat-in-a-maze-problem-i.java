//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        sc.nextLine();        // Consume the newline character

        while (t-- > 0) {
            String input = sc.nextLine();

            // Replace ][ with ],[
            input = input.replace("][", "],[");

            ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
            String[] rows = input.split("],\\s*\\[");

            for (String row : rows) {
                row = row.replaceAll("[\\[\\]]", ""); // Remove any surrounding brackets
                ArrayList<Integer> intRow = new ArrayList<>();
                for (String num : row.split(",")) {
                    intRow.add(Integer.parseInt(num.trim()));
                }
                mat.add(intRow);
            }

            Solution obj = new Solution();
            ArrayList<String> result = obj.findPath(mat);

            if (result.isEmpty()) {
                System.out.println("[]");
            } else {
                for (String res : result) {
                    System.out.print(res + " ");
                }
                System.out.println();
            }
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find all possible paths
    public ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
        int size = mat.size();
        ArrayList<String> ans = new ArrayList<>();
       // mat.get(0).set(0,0);
        helper(0,0,mat,size,ans,new StringBuilder());
        return ans;
         }
        public void helper(int r,int c,ArrayList<ArrayList<Integer>> mat,int size,ArrayList<String> ans,StringBuilder sb){
            if(r==size-1 && c==size-1){
                ans.add(sb.toString());
                return;
            }
            //down 
            if(r+1<size && mat.get(r+1).get(c)==1){
            sb.append('D');
            mat.get(r).set(c,0);
            helper(r+1,c,mat,size,ans,sb);
            sb.deleteCharAt(sb.length()-1);
            mat.get(r).set(c,1);
            }
            //left
            if(c-1>=0 && mat.get(r).get(c-1)==1){
            sb.append('L');
            mat.get(r).set(c,0);
            helper(r,c-1,mat,size,ans,sb);
            sb.deleteCharAt(sb.length()-1);
            mat.get(r).set(c,1);
            }
            //rigth
            if(c+1<size && mat.get(r).get(c+1)==1){
            sb.append('R');
            mat.get(r).set(c,0);
            helper(r,c+1,mat,size,ans,sb);
            sb.deleteCharAt(sb.length()-1);
            mat.get(r).set(c,1);
            }
            //up
            if(r-1>=0 && mat.get(r-1).get(c)==1){
            sb.append('U');
            mat.get(r).set(c,0);
            helper(r-1,c,mat,size,ans,sb);
            sb.deleteCharAt(sb.length()-1);
            mat.get(r).set(c,1);
            }
        }
    }