import java.util.Scanner;

public class StrongNo {
    public static void main(String[] args) {
        int num , digit , sum = 0; 
        int originalNum , fact ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to chacke wheter the number is Strong Number or not");
        num = sc.nextInt();

        originalNum = num ; 
        

        while (num != 0) {
            digit = num % 10 ;
            fact = 1;

            //for calculate each digiths factorial
            for (int i = 1; i <= digit; i++) {
                fact = fact * i ;
            }
            sum = sum + fact ;
            num = num / 10 ;
        }

        // to compare ans and sum

        
        if (originalNum == sum) {
            System.out.println("number " + originalNum + " is Strong Number");
        }
        else{
            System.out.println("number " + originalNum + " is not Strong Number");
        }
    }
}

// Strong no 145 where sum of factorial of each digit of number is equal to acatual number
// 1! = 1
// 4! = 24
// 5! = 120
// 145 = 1 + 24 + 120 = 145  
