/*
Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
Print the prime numbers in different lines.

Input Format :
Integer N
Output Format :
Prime numbers in different lines.

Constraints :
1 <= N <= 100
Sample Input 1:
9
Sample Output 1:
2
3
5
7
Sample Input 2:
20
Sample Output 2:
2
3
5
7
11
13
17
19
*/

package Solutions1;
import java.util.Scanner;

public class AllPrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 2; i <= n; i++) {
			int count = 0;
			for (int j = 2; j <= i; j++) {
				if (i % j == 0)
					count++;
			}
			if (count == 1)
				System.out.println(i);
		}
	}
}