import java.util.*;
public class Problem3 {
 public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int a=sc.nextInt();
    int temp=1;
    int n=(a%2==0)?a-1:a;
    for(int i=1;i<=n;i++){
        System.out.print(temp);
        if(i!=n){
            System.out.print(",");
        }
        temp=temp+2;
    }
 }   
}
