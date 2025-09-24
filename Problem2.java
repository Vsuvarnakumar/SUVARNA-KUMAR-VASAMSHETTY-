import java.util.*;
public class Problem2 {
 public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int a=sc.nextInt();
    int temp=1;
    for(int i=1;i<=a;i++){
        System.out.print(temp);
        if(i!=a){
            System.out.print(",");
        }
        temp=temp+2;
    }
 }   
}
