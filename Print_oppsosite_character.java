// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// I/P:  coding is fun
// O/P:  xlwrmt rh ufm

// === Code Execution Successful ===
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder res=new StringBuilder();
        String lower="abcdefghijklmnopqrstuvwxyz";
        String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(lower.indexOf(ch)!=-1){
                int pos=lower.indexOf(ch);
                res.append(lower.charAt(25-pos));
            }
            else if(upper.indexOf(ch)!=-1){
                int pos=upper.indexOf(ch);
                res.append(upper.charAt(25-pos));
            }
            else{
                res.append(ch);
            }
        }
        System.out.println(res.toString());
    }
}
