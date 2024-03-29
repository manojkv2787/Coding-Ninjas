/*
Teaching Assistants at Coding Ninjas are working day and night for resolving doubts of students. On a particular 
day, Aroma had solved lot of doubts. There is still one left unsolved, so, she is asking for help.
The description of the doubt is - "Help me solve this question."
The question is described as - "You are given a word M and K queries. In every query, there are four integers: 
W, X, Y and Z. Let us form another word P by the characters at positions: [W, X] of a given word M (characters 
at position W and X are inclusive). Let us form another word Q by the characters at positions [Y, Z] of the 
given word M (characters at positions Y and Z are inclusive). For every query, you must answer if it is possible 
to rearrange the letters of word Q and form word P."
Your task is to help Aroma and write code for this problem.

Input Format:
The first line of input contains the string M. The length of string M lies in the range: [1, 50000]. String M 
consists only of lowercase letters of English alphabet. The second line of input contains an integer, that 
denotes the value of K (1 <= K <= 50000). Each of the following K lines contains four integers: W, X, Y, Z. 
(1 <= W, X <= |M| and 1 <= Y, Z <= |M|).

Constraints:
Time Limit: 1 second
Output Format:
There are K lines of output, one for each query. For each query, print "true" if it possible and "false" 
otherwise.   
Sample Input 1:
navdeepdvan
2
1 4 8 11
4 5 7 8
Sample Output 1:
true
false
Explanation:
In the first query, the word formed are: P is "navd" and Q is "dvan". Hence, true.
In the second query, the word formed are: P is "de" and Q is "pd". Hence, false.
*/

import java.util.Scanner;
public class Main {
	public static int[][] e = new int[50005][35];
 
 public static void main(String[] args) {
 /* Your class should be named Main.
 * Read input as specified in the question.
 * Print output as specified in the question.
 */
 // Write your code here
 int q;
 int a;
 int b;
 int c;
 int d;
 Scanner myObj = new Scanner(System.in); 
 String s = "";
 s = myObj.next();
 q = myObj.nextInt();
 e[0][s.charAt(0) - 97]++;
 for (int w = 0 ; w < 26 ; w++)
 {
 e[0][w] = 0;
}
for (int i = 1 ; i <= s.length() ; i++)
 {
 for (int j = 0 ; j < 26 ; j++)
 {
 e[i][j] = e[i - 1][j];
 }
 e[i][s.charAt(i - 1) - 97]++;
 }
 for (int v = 0 ; v < q ; v++)
 {
 a = myObj.nextInt();
 b = myObj.nextInt();
 c = myObj.nextInt();
 d = myObj.nextInt();
 int p = 1;
 for (int l = 0 ; l < 26 ; l++)
 {
 if ((e[b][l] - e[a - 1][l]) != (e[d][l] - e[c - 1][l]))
 {
 p = 0;
 break;
 }
 }
if (p == 0)
 {
 System.out.print("false");
 System.out.print("\n");
 }
 else
 {
 System.out.print("true");
 System.out.print("\n");
 }
 }
 }
}