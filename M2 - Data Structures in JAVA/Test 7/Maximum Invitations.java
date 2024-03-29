/*
Raj is throwing a birthday party. He wants to invite as many friends as possible. He wants a large wooden table 
to accommodate his friends. There is constraint for this: space in the room. The number of friends a table can 
accommodate is equal to its perimeter (the sum of all side lengths). The furniture must be placed so that the 
edges are parallel to the edges of the flat.
You will be given layout of the flat and you have to tell maximum number of friends that he can accommodate in 
his room.

Input Format:
The first line of input contains two integers R and C (1 <= R, C <= 400), these are the dimensions of the flat.
Each of the following R rows contain exactly C characters. Characters can be '.', 'X'. '.' character means that 
cell is free and can be used for placing wooden table. 'X' means that cell is blocked and hence, cannot be used.
Constraints:
Time Limit: 1 second

Output format:
Print the maximum number of friends Raj can accommodate, if he buys his table. 
Sample Input 1
2 2
..
..
Sample Output 1:
7
Sample Input 1
4 4
X.XX
X..X
..X.
..XX 
Sample Output 1:
9
Explanation:
Please refer to the image below for explanation:
Alt Text
*/

import java.util.*;
public class Main {
static int peri(int w, int h) {
return w*2+h*2;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int m = sc.nextInt();
sc.nextLine();
char[][] arr = new char[n][m];
int[] cnt = new int[m];
int max = 0;
for (int i=0; i<n; i++) {
arr[i] = sc.nextLine().toCharArray();
for (int j=0; j<m; j++) {
if (arr[i][j]=='.') cnt[j]++;
else cnt[j] = 0;
}
for (int j=0; j<m; j++) {
int h = cnt[j];
int w = 1;
if (h>0) {
for (int k=j+1; k<m; k++) {
if (cnt[k]<h) break;
w++;
}
for (int k=j-1; k>0; k--) {
if (cnt[k]<h) break;
w++;
}
}
max = Math.max(max, peri(w, h));
}
}
System.out.println(max-1);
}
}