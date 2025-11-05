import java.util.*;
public class loops {
    public static void main(String[] args) {
//        making a scanner object for taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of t");
//        taking value of t in integer form from user
        int t = sc.nextInt();
        System.out.println("Enter numbers for checking prime");
        for (int i = 1; i <= t; i++) {
//            taking numbers from user in integer form , putting inside loop because we want numbers t times
            int n = sc.nextInt();
//      another loop for checking if number is prime
            int count = 1;
//       #1 time complexity reducing loop --> for(int j=2;j*j<n;j++)
            for (int j = 2; j <= n; j++) {
                if (n % j == 0) {
                    count++;
//       #2 use "break" statement after count cz if one time (n%j==0) is true that means number is not prime
                }
            }
            if (count == 2) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
    }
}

// in upper written code #1 & #2 are the statements for reducing time complexity
// after reducing complexity all test cases will pass easily...

