// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashSet<Character>duplicates=new HashSet<>();
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!set.add(ch)){
                duplicates.add(ch);
            }
        }
        for(char c:duplicates){
            System.out.println(c);
        }
    }
}
