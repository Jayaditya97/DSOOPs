package Recursion;

public class subseq {
    static void subseq(String s, String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);
        String rest = s.substring(1);
        subseq(rest, ans); //exclude b
        subseq(rest, ans+ch); //include a
    }

    public static void main(String[] args) {
        subseq("ab", "");
    }
}
