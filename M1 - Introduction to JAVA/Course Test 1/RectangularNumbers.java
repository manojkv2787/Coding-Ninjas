/*
Print the following pattern for the given number of rows.
Pattern for N = 4
4444444
4333334
4322234
4321234
4322234
4333334  
4444444
Input format : N (Total no. of rows)

Output format : Pattern in N lines
Sample Input :
3
Sample Output :
33333
32223
32123
32223
33333
*/

package Solutions;

public class RectangularNumbers {
	public static void print(int n) {
		int i, j, a;
	        for (i = -(n - 1); i < n; i++) {
	            a = n;
	            for (j = -(n - 1); j < n; j++) {
	                if (Math.abs(i) < Math.abs(j)) {
	                    if (j < 0) {
	                        System.out.print(a);
	                        a--;
	                    } else {
	                        a++;
	                        System.out.print(a);
	                    }
	                } else {
	                    System.out.print(a);
	                }
	            }
	            System.out.println();
	        }
	    }
	    public static void main(String[] args) {
	        print(4);
		}
}