package cn.yanbowen.map.set.list;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by <a href=mailto:boweny.yan@qunar.com>boweny.yan</a>
 * DATE : 02/10/2020
 * TIME : 21:38
 * PROJECT : DataStructureAndAlgorithm
 * PACKAGE : cn.yanbowen.map.set.list
 *
 * @author boweny.yan
 * <p>
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: s = "rat", t = "car"
 * 输出: false
 * 说明:
 * 你可以假设字符串只包含小写字母。
 * <p>
 * 进阶:
 * 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 */
public class _242_ValidAnagram {

    class Solution {
        public boolean isAnagram(String s, String t) {
            if (s == null || t == null || s.length() != t.length())
                return false;

            Map<String, Integer> sMap = new HashMap<>();
            Map<String, Integer> tMap = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                char sChar = s.charAt(i);
                char tChar = t.charAt(i);
                sMap.merge(String.valueOf(sChar), 1, Integer::sum);
                tMap.merge(String.valueOf(tChar), 1, Integer::sum);
            }

            return sMap.equals(tMap);
        }
    }
}
