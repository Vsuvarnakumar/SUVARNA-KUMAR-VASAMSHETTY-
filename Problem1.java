import java.util.*;
class Calculator{
    double a;
    double b;
    String operation;
    Calculator(double a,double b,String operation){
        this.a=a;
        this.b=b;
        this.operation=operation;
    }
    public double calc(){
      if(operation.equals("add")||operation.equals("addition")){
        return a+b;
      }
      else if(operation.equals("sub")||operation.equals("substraction")){
        return a-b;
      }
      else if(operation.equals("mul")||operation.equals("multiplication")){
        return a*b;
      }
      else if(operation.equals("div")||operation.equals("division")){
        if(b!=0){
            return a/b;
        }
        else{
            System.out.println("Can't divide with 0");
            return 0;
        }
      }
      else{
        System.out.println("Invalid Operation");
        return 0;
      }
    }

}
public class Problem1 {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        double b=sc.nextInt();
        String operation=sc.next();
        Calculator obj = new Calculator(a,b,operation.toLowerCase());
        double ans=obj.calc();
        System.out.println(ans);
   }
}