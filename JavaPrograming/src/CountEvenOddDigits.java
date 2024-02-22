package javaProgramming.com;

import java.util.Scanner;

public class CountEvenOddDigits {

	public static void main(String[] args) {
		
		/*Count number of odd and even digits
1. Ex = 123456
2. extract the last digit by num%10 
3. if num/2==0 then even
4. else num is odd 
5. add count of each odd/even by 1
6. eleminate that digit by num/10
6. print odd/even digits count		
*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int even_count =0;
		int odd_count =0;
		
		while(num>0) {
			int rem = num%10;
			if (rem%2==0) {
				even_count++;
			}
				else {
					odd_count++;
				}
					num=num/10;
				}
		System.out.println("Number of even digits are :"+ even_count);
		System.out.println("Number of odd digits are:"+ odd_count);
				
			
		}
	}

