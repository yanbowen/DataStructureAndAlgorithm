package cn.yanbowen.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by <a href=mailto:boweny.yan@qunar.com>boweny.yan</a>
 * DATE : 05/13/2020
 * TIME : 14:14
 * PROJECT : DataStructureAndAlgorithm
 * PACKAGE : cn.yanbowen.tree
 *
 * @author boweny.yan
 * <p>
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 * <p>
 * 示例：
 * <p>
 * 输入：n = 3
 * 输出：[
 * "((()))",
 * "(()())",
 * "(())()",
 * "()(())",
 * "()()()"
 * ]
 */
public class _22_Generate_Parentheses {
    List<String> list = new ArrayList<>();

    class Solution {
        public List<String> generateParenthesis(int n) {
            if (n <= 0) {
                return list;
            }
            generateOneByOne(0, 0, n, "");
            return list;
        }

        public void generateOneByOne(int left, int right, int n, String result) {

            if (left == n && right == n) {
                list.add(result);
            }
            if (left < n) {
                generateOneByOne(left + 1, right, n, result + "(");
            }
            if (left > right && right < n) {
                generateOneByOne(left, right + 1, n, result + ")");
            }
        }
    }

    class Solution2 {
        public List<String> generateParenthesis(int n) {
            List<String> result = new ArrayList<>();
            generateOneByOne(n, n, result, "");
            return result;
        }

        public void generateOneByOne(int left, int right, List<String> result, String sublist) {
            if (left == 0 && right == 0) {
                result.add(sublist);
            }
            if (left > 0) {
                generateOneByOne(left - 1, right, result, sublist + "(");
            }
            if (left < right) {
                generateOneByOne(left, right - 1, result, sublist + ")");
            }
        }
    }
}
