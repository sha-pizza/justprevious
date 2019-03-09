import java.util.*;

public class L14 {
    public static void main (String[] args){
        
        ArrayList<String> AL = new ArrayList<String> ();
        AL.add("abd");
        AL.add("drg");
        AL.add("fby");
        //System.out.println(AL);
        AL.remove(2);
        //System.out.println(AL);
        AL.remove("abd");
        //System.out.println(AL);
        

        ArrayList<Integer> TL = new ArrayList<Integer> ();
        TL.add(2);
        TL.add(3);
        TL.add(5);
        System.out.println(TL);
        System.out.println(TL.toString());

    }
}