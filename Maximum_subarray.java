
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int length=sc.nextInt();
        int res=arr[0];
        int curr_sum=0;
        for(int i=0;i<n-2;i++){
            curr_sum=curr_sum+arr[i];
            res=Math.max(curr_sum,arr[i]);
        }
        System.out.println(res);
    }
}
