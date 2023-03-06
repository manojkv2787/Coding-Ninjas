/*
Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE

Input format :
N (Total no. of rows)
Output format :
Pattern in N lines.

Constraints
0 <= N <= 26
Sample Input 1:
8
Sample Output 1:
H
GH
FGH
EFGH
DEFGH
CDEFGH
BCDEFGH
ABCDEFGH
Sample Input 2:
7
Sample Output 2:
G
FG
EFG
DEFG
CDEFG
BCDEFG
ABCDEFG
*/

package Solutions;
import java.util.Scanner;

public class InterestingAlphabets {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) 
		{
			int ch = 65 + (n - 1) - i;
			for (int j = 0; j <= i; j++) 
			{
				System.out.print((char) ch);
				ch++;
			}
			System.out.println(" ");
		}
		scan.close();
	}
}
