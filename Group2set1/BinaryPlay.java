package Group2set1;

public class BinaryPlay {
//public class Solution { uncomment this line and remove the line above
    static public int binarySequence(int N, int X) {
        if (N == 1) {
            return 0;
        }
        int len = (int) Math.pow(2, N - 1);
        if (X <= len / 2) {
            return binarySequence(N - 1, X);
        } else {
            return 1 - binarySequence(N - 1, X - len / 2);
        }
    }
}