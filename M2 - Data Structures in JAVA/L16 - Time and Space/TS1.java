package Recursions;

public class TS1 {
	int multiplyRec(int m, int n){
	    if(n == 1)
	        return m;
	    return m + multiplyRec(m,  n - 1);  
	}
}