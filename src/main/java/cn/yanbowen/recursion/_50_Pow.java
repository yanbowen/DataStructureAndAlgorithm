package cn.yanbowen.recursion;

/**
 * Created by <a href=mailto:boweny.yan@qunar.com>boweny.yan</a>
 * DATE : 03/14/2020
 * TIME : 23:15
 * PROJECT : DataStructureAndAlgorithm
 * PACKAGE : cn.yanbowen.recursion
 *
 * @author boweny.yan
 * <p>
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数。
 */
public class _50_Pow {
    class Solution {
        //（递归）
        public double myPow(double x, int n) {

            long N = n;
            if (n < 0) {
                x = 1 / x;
                N = -n;
            }
            return myOwnerPow(x, N);
        }

        private double myOwnerPow(double x, long N) {

            if (N == 0) {
                return 1.0;
            }
            double half = myOwnerPow(x, N / 2);
            if ((N & 1) == 1) {
                return x * half * half;
            }
            return half * half;
        }
    }

    class Solution2 {
        //（循环,非递归）
        public double myPow(double x, int n) {
            long N = n;
            if (N < 0) {
                x = 1 / x;
                N = -N;
            }
            double pow = 1.0;
            while (N > 0) {
                if ((N & 1) == 1) {
                    pow *= x;
                }
                x *= x;
                N >>= 1;
            }
            return pow;
        }
    }
}
