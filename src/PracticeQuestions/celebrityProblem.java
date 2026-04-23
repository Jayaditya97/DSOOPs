package PracticeQuestions;

public class celebrityProblem{
    static int findCelebrity(int[][] M, int n) {
        int a = 0;
        int b = n - 1;
        //Find Candidate
        while (a < b) {
            if (M[a][b] == 1)
                a++; //a knows b -> a cannot be celebrity
            else
                b--; //a does not know b -> b cannot be celevrity

        }
        int candidate = a;
        //verify candidate
        for (int i = 0; i < n; i++) {
            if (i != candidate) {
                if (M[candidate][i] == 1 || M[i][candidate] == 0) {
                    return -1;
                }
            }
            return candidate;
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[][] M = {{0,1,0},{0,0,1},{0,0,0}};

    }
}