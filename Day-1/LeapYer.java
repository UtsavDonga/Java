import java.util.Scanner;

public class LeapYer {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to chake whater its pelindrom or not : ");
        year = sc.nextInt();
        if (year%4==0) {
            System.out.println(year + " its a LeapYear");
        }
        else if (year%400==0) {
            System.out.println(year + " its a LeapYear");
        }
        else if (year%100==0) {
            System.out.println(year + " its a LeapYear");
        }
        else {
            System.out.println(year + " its not a LeapYear");
        }
    }
}
