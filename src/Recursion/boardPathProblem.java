package Recursion;

public class boardPathProblem {
    //go to end by rolling a dice in recursion
    static void boardPath(int curr, int end, String ans){
        if(curr==end){
            System.out.println(ans);
            return;
        }
        if(curr>end) return;

        for (int dice = 1; dice <= 6 ; dice++) {
            boardPath(curr+dice,end,ans+dice);
        }
    }
    public static void main(String[] args){
        boardPath(0, 3, "");
    }
}
