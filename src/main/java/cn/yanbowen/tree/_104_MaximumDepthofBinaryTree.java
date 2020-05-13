package cn.yanbowen.tree;

import cn.yanbowen.common.TreeNode;

/**
 * Created by <a href=mailto:boweny.yan@qunar.com>boweny.yan</a>
 * DATE : 04/25/2020
 * TIME : 22:12
 * PROJECT : DataStructureAndAlgorithm
 * PACKAGE : cn.yanbowen.tree
 *
 * @author boweny.yan
 * <p>
 * 给定一个二叉树，找出其最大深度。
 * <p>
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 * <p>
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 */
public class _104_MaximumDepthofBinaryTree {

    class Solution {
        public int maxDepth(TreeNode root) {

            return root == null ? 0 : 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
    }
}
