/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
1
21
321
4321

Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines

Constraints
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
1
21
321
4321
54321
Sample Input 2:
6
Sample Output 2:
1
21
321
4321
54321
654321
*/

package Solutions;
import java.util.Scanner;

public class ReverseNumberPattern {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) 
		{
			int val=i+1;
			for (int j = 0; j <= i; j++)
			{
				System.out.print(val);
				val--;
			}
			System.out.println(" ");
		}
	}
}