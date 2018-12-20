/**
 *
 * @author kayla
 */

import java.util.Scanner;

public class FibonacciCrud {
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        boolean ans = true;
        
        while(ans == true){
            
            int adultpop = 0;
            int youngpop1 = 0;
            int youngpop2 = 0;
            int initial = 0;
            int days = 0;
            
            System.out.println("Enter the initial population size of green crud");
            initial = scan.nextInt();
            
            System.out.println("Enter the number of days");
            days = scan.nextInt();
            
            for(int i = 0; i <= days; i+=5)
            {
                
                int temp = adultpop;
                int temp2 = youngpop1;
                int temp3 = youngpop2;
                        
                if (i == 0)
                {
                    youngpop1 = temp + initial;
                }
                else
                    youngpop1 = temp + temp3;
                
                youngpop2 = temp2;        
                
                adultpop = temp3 + temp;
                
            }
            
            int total = youngpop1 + youngpop2 + adultpop;
            
            System.out.println("The number of green crud after " + days + " days is " + total);
            System.out.println("Would you like to run this popoulationi simulator again? (true for yes, false for no)");
            ans = scan.nextBoolean();
            
        }
    }
}


/* OUTPUT


run:
Enter the initial population size of green crud
10
Enter the number of days
0
The number of green crud after 0 days is 10
Would you like to run this popoulationi simulator again? (true for yes, false for no)
true
Enter the initial population size of green crud
10
Enter the number of days
5
The number of green crud after 5 days is 10
Would you like to run this popoulationi simulator again? (true for yes, false for no)

true
Enter the initial population size of green crud
10
Enter the number of days
10
The number of green crud after 10 days is 20
Would you like to run this popoulationi simulator again? (true for yes, false for no)
true
Enter the initial population size of green crud
10
Enter the number of days
15
The number of green crud after 15 days is 30
Would you like to run this popoulationi simulator again? (true for yes, false for no)
true
Enter the initial population size of green crud
10
Enter the number of days
20
The number of green crud after 20 days is 50
Would you like to run this popoulationi simulator again? (true for yes, false for no)
true
Enter the initial population size of green crud
10
Enter the number of days
16
The number of green crud after 16 days is 30
Would you like to run this popoulationi simulator again? (true for yes, false for no)
false
BUILD SUCCESSFUL (total time: 40 seconds)


*/