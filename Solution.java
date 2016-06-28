import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        int flag=0;
        
        for(int i=x1,j=x2;i<10000;i=i+v1,j=j+v2){
			if(i==j)
				flag=1;
           
					
		}
		if(flag==1)
			System.out.println("YES");
		else
			System.out.println("NO");
    }
}
