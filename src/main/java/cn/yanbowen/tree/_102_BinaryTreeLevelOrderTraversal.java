package cn.yanbowen.tree;

import cn.yanbowen.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by <a href=mailto:boweny.yan@qunar.com>boweny.yan</a>
 * DATE : 04/22/2020
 * TIME : 16:53
 * PROJECT : DataStructureAndAlgorithm
 * PACKAGE : cn.yanbowen.tree
 *
 * @author boweny.yan
 * <p>
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 * <p>
 * 示例：
 * 二叉树：[3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回其层次遍历结果：
 * <p>
 * [
 * [3],
 * [9,20],
 * [15,7]
 * ]
 */
public class _102_BinaryTreeLevelOrderTraversal {
    class Solution {
        /**
         * BFS
         */
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();
            if (root == null) {
                return result;
            }
            Queue<TreeNode> queues = new LinkedList<>();
            queues.add(root);
            while (!queues.isEmpty()) {
                int size = queues.size();
                List<Integer> currLevel = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    TreeNode queue = queues.poll();
                    currLevel.add(queue.val);
                    if (queue.left != null) {
                        queues.add(queue.left);
                    }
                    if (queue.right != null) {
                        queues.add(queue.right);
                    }
                }
                result.add(currLevel);
            }
            return result;
        }
    }

    class Solution2 {
        /**
         * DFS
         */
        List<List<Integer>> levels = new ArrayList<List<Integer>>();

        public void helper(TreeNode node, int level) {
            if (levels.size() == level)
                levels.add(new ArrayList<Integer>());

            levels.get(level).add(node.val);

            if (node.left != null)
                helper(node.left, level + 1);
            if (node.right != null)
                helper(node.right, level + 1);
        }

        public List<List<Integer>> levelOrder(TreeNode root) {
            if (root == null) return levels;
            helper(root, 0);
            return levels;
        }
    }
}
