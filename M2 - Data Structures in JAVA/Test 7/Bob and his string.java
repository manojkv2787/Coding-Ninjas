/*
King Bob is in playful mood today. He started playing with string S. As he was playing, a weird question came 
in his mind. He wondered what is the maximum number of characters, between any two same characters in the 
string. He needs your help in solving this question. Can you help him solve this question?
Note: String S is composed of lowercase letters of the Latin alphabet. If there are no two same characters 
in the string, print -1.

Input Format:
The first line of input contains one integer T, denoting the number of test cases. 
Each of the next T line contains one string S.
Constraints:
1 < T < 10
1 < |S| < 100000, where S determines the length of the string.
String is composed of lowercase alphabets ranging from a to z.
Time limit : 1 sec

Output Format:
For each test case, output the maximum number of characters between any two same characters in the string. 
If there are no two same characters in the string, print -1. 
Print answer for each test case in a new line.
Sample Input 1:
2
aba
babcddc
Sample Output 1:
1
2
Explanation:
1) For string = aba
There is only one character between 2 occurrences of a.
2) For string = babcddc
There is one character between 2 occurrences of b, and 2 characters between 2 occurrences of c. So the answer 
is 2.
*/

import java.util.*;
public class Main {
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int t=scn.nextInt();
    while(t-- > 0){
        String s=scn.next();
        int max=Integer.MIN_VALUE;
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))==false){
                map.put(s.charAt(i), i);
            }
            else{
                int distance=i-map.get(s.charAt(i));
                if(distance>max){
                    max=distance;
                }
            }
        }
        if(max==Integer.MIN_VALUE){
            System.out.println(-1);
        }
        else{
            System.out.println(max-1);
        }
    }
}
}