package Strings;

public class RemoveConsecutiveDuplicates {
	public static String removeConsecutiveDuplicates(String str) {
        int n = str.length();
        if(n==0){ //to handle the case of empty string
            return str;
        }
        String answer = ""; //we create answer string to store the output.
        int startIndex = 0;
        while(startIndex < n){
            char UniqueChar = str.charAt(startIndex);
            int nextUniqueChar = startIndex + 1;
            while(nextUniqueChar<n && str.charAt(nextUniqueChar)==UniqueChar){
                nextUniqueChar++;
            }
            answer = answer + UniqueChar;
            startIndex = nextUniqueChar;
        }
        return answer;
    }
    //main driver code to check the solution
    public static void main(String[] args) {
        String str = "aaaabbbaa";
        System.out.println(removeConsecutiveDuplicates(str));
    }
}