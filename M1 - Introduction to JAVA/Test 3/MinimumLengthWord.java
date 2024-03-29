/*
Given a string S (that can contain multiple words), you need to find the word which has minimum length.
Note : If multiple words are of same length, then answer will be first minimum length word in the string.
Words are seperated by single space only.

Input Format :
String S
Output Format :
Minimum length word.

Constraints :
1 <= Length of String S <= 10^5
Sample Input 1 :
this is test string
Sample Output 1 :
is
Sample Input 2 :
abc de ghihjk a uvw h j
Sample Output 2 :
a
*/

package Solutions;

public class MinimumLengthWord {
	public static String minLengthWord(String input){
		
		// Write your code here
		String[] split = input.split(" ");
        
        StringBuffer ans = new StringBuffer("");
        
        int len = Integer.MAX_VALUE;
        
        for(int i = 0; i < split.length; i++){
            if(split[i].length() < len){
                ans = new StringBuffer("");
                ans.append(split[i]);
                len = split[i].length();
            }
        }
        return ans.toString();
	}
}