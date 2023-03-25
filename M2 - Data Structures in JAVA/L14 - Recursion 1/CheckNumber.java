/*
Given an array of length N and an integer x, you need to find if x is present in the array or not. 
Return true or false.
Do this recursively.

Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
'true' or 'false'

Constraints :
1 <= N <= 10^3
Sample Input 1 :
3
9 8 10
8
Sample Output 1 :
true
Sample Input 2 :
3
9 8 10
2
Sample Output 2 :
false
*/

package Recursions;

public class CheckNumber {
	public static boolean checkNumber(int input[], int x, int startIndex) {
        if(startIndex==input.length){
            return false;   
        }
        if(input[startIndex]==x){
            return true;
        }
		return checkNumber(input,x,startIndex+1);
	}
	public static boolean checkNumber(int input[], int x) {
		return checkNumber(input,x,0);
	}
}