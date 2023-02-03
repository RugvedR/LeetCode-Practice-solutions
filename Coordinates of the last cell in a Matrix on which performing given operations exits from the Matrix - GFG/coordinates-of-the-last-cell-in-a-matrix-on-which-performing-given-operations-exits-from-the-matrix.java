//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split("\\s+");
            int r = Integer.parseInt(str[0]);
            int c = Integer.parseInt(str[1]);
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                int k = 0;
                str = read.readLine().trim().split("\\s+");
                for(int j = 0; j < c; j++){
                  matrix[i][j] = Integer.parseInt(str[k]);
                  k++;
                }
            }
            Solution obj = new Solution();
            int[] p = obj.endPoints(matrix,r,c);
            out.print("(" +  p[0]+ ", " +  p[1]+ ")" +"\n");
        }
        out.close();
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    
    static boolean isSafe(int m, int n, int i, int j){
        if(i<0) return false;
        if(j<0) return false;
        if(i>=m) return false;
        if(j>=n) return false;
        return true;
    }
    
    static int [] endPoints(int [][]arr, int n, int m){
        
        int i=0, j=0, current_i=0, current_j=0;
        m=arr.length;
        n=arr[0].length;
        char current_d = 'r';
        
        Map<Character, Character> map = new HashMap<>();
        map.put('u', 'r');
        map.put('r', 'd');
        map.put('d', 'l');
        map.put('l', 'u');
        
        while(isSafe(m,n,i,j)){
            current_i=i;
            current_j=j;
            
            if(arr[i][j]==1){
                char move_in = map.get(current_d);
                arr[i][j] = 0;
                
                if(move_in=='u') i--;
                else if(move_in=='d') i++;
                else if(move_in=='r') j++;
                else if(move_in=='l') j--;
                current_d = move_in;
            }
            else{
                if(current_d=='u') i--;
                else if(current_d=='d') i++;
                else if(current_d=='r') j++;
                else if(current_d=='l') j--;
            }
        }
        
        return new int[]{current_i, current_j};
    }
}