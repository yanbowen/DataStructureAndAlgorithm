package cn.yanbowen.tree;

import cn.yanbowen.common.TreeNode;

/**
 * Created by <a href=mailto:boweny.yan@qunar.com>boweny.yan</a>
 * DATE : 04/25/2020
 * TIME : 22:25
 * PROJECT : DataStructureAndAlgorithm
 * PACKAGE : cn.yanbowen.tree
 *
 * @author boweny.yan
 * <p>
 * 给定一个二叉树，找出其最小深度。
 * <p>
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 */
public class _111_MinimumDepthofBinaryTree {

    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return (left == 0 || right == 0) ? left + right + 1 : Math.min(left, right) + 1;
    }
}
