public class FindNthRootOfM_6 {
    public static void main(String[] args) {
        int N = 3;
        int M = 27;
        int bruteForceAnswer = bruteForceFindNthRootOfM(N , M);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String betterAnswer = betterFindNthRootOfM(N , M);
        System.out.println("Better Answer : " + betterAnswer);
        int optimalAnswer = optimalFindNthRootOfM(N , M);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    public static int NthRoot(int x , int N) {
        int NthRootValue = 1;
        for (int i = 0; i < N; i++) {
            NthRootValue = x * NthRootValue;
        }
        return NthRootValue;
    }
    public static int bruteForceFindNthRootOfM(int N , int M) {
        int ans = -1;
        for (int i = 0; i <= M; i++) {
            int NthRoot = NthRoot(i , N);
            if(NthRoot == M){
                ans = i;
            }
            else if (NthRoot > M) {
                break;
            }
        }
        return ans;
    }
    /*
    TC : O(m) ---> The loop runs from 0 to M, trying each value as a potential Nth root.
    SC : O(1) ---> Only a few variables are used, independent of input size.
    */

    public static String betterFindNthRootOfM(int N , int M) {
        String str = "There is no better solution to this Problem.";
        return str;
    }

    public static int optimalFindNthRootOfM(int N , int M) {
        int start = 1;
        int end = M;
        int ans = -1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            int NthRootValue = NthRoot(mid , N);
            if(NthRootValue == M){
                ans = mid;
                break;
            }
            else if (NthRootValue < M) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }
    /*
    TC : O(log m) ---> Binary search narrows the search range logarithmically by halving the possible values at each step.
    SC : O(1) ---> Only a constant amount of extra space is used for variables.
    */

}
