// The program finds the largest possible n-digit number such that the sum of its digits = s.
// I/P:
// The program takes two integer inputs from the user:

// n → number of digits

// s → required sum of digits
// O/P:
// It prints the largest n-digit number whose digits add up to s.

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            if(s>=9){
                sb.append(9);
                s=s-9;
            }
            else{
                sb.append(s);
                s=0;
            }
        }
        while(sb.length()<n){
            sb.append(0);
        }
        System.out.println(sb.toString());
    }
}
