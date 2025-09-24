import java.util.*;
public class Problem4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> hm=new LinkedHashMap<>();
        for(int i=1;i<=9;i++){
            int temp=0;
            for(int val :A){
                if(val%i==0){
                    temp++;
                }
            }
            hm.put(i,temp);
        }
        System.out.println(hm);
    }
}
