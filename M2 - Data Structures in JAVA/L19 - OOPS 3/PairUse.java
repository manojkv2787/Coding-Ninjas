package Generic;

public class PairUse {
	public static void main(String[] args){
        Pair p= new Pair(10,20);
        System.out.println(p.getFirst()+ " " +p.getSecond());

        PairString pS= new PairString("aa", "bb");
        PairDouble pS= new PairDouble(3.1, 7.2);
    }
}