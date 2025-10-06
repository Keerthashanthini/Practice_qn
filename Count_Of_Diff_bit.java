// find the count of diff bits b/w 2 nums:
// i/p:
//   5
//   9
// o/p:
//   3
// i/p:
//   18
//   9
// o/p:
//   4
// if the len of both the num are not equal we have toconvert into binary and  add "0" in front of the smallest num
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        String binary1=Integer.toBinaryString(a);
        String binary2=Integer.toBinaryString(b);
        int c=0;
        int maxLen=Math.max(binary1.length(),binary2.length());
        while(binary1.length()<maxLen){
            binary1="0"+binary1;
        }
        while(binary2.length()<maxLen){
            binary2="0"+binary2;
        }
        for(int i=0;i<binary1.length();i++){
            if(binary1.charAt(i)!=binary2.charAt(i)){
                c++;
            }
        }
        System.out.println(c);
    }
}

