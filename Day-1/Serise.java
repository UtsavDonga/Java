import java.util.*;
public class Serise {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num for print a Serise");
        int n= sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if (i%2 == 0) {
                sum -= i ;
            } else if (i%2 != 0) {
                sum += i;
            } else {
             return ;
            }
        }
        System.out.println("Sum of no of Serise is :" + sum);
        sc.close();
    }
}