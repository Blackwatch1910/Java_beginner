import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class sol10 {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String bin = Integer.toBinaryString(n);
        System.out.println(bin);
        System.out.println(bin.length());
        int max = 0;
        int c = 0;
        for(int j = 0; j < bin.length(); j++){
            
            c = count(bin);
            if(max < c){
                max = c;
            }
            else
                continue;
            }
            System.out.println(max);
            scanner.close();
        }
    
    public static int count(String bin){
        int i = 0;
        int c = 0;
        for(int j = 0; j < bin.length(); j++){
        while(bin.charAt(j) == '1'){
        c++;
        i++;
       }      
    }
    return c;
}
    }

