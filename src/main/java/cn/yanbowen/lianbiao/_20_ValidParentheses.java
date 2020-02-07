package cn.yanbowen.lianbiao;

import com.google.common.collect.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by <a href=mailto:boweny.yan@qunar.com>boweny.yan</a>
 * DATE : 02/06/2020
 * TIME : 18:46
 * PROJECT : DataStructureAndAlgorithm
 * PACKAGE : cn.yanbowen.lianbiao
 *
 * @author boweny.yan
 * <p>
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 */
public class _20_ValidParentheses {

    public boolean isValid(String s) {
        if (s.length() == 0) {
            return true;
        }
        String[] split = s.split("");
        Map<String, String> map = new HashMap<String, String>();
        map.put(")", "(");
        map.put("}", "{");
        map.put("]", "[");
        Stack<String> stack = new Stack<String>();

        for (String str : split) {
            if (map.get(str) != null) {
                if (stack.size() == 0 || !stack.pop().equals(map.get(str))) {
                    return false;
                }
            } else {
                stack.push(str);
            }
        }
        return stack.size() == 0;
    }

    public static void main(String[] args) {
        _20_ValidParentheses parentheses = new _20_ValidParentheses();
        boolean valid = parentheses.isValid("]");
        System.out.println(valid);
    }
}
