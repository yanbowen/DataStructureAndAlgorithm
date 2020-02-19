package cn.yanbowen.tree;

import cn.yanbowen.common.TreeNode;

/**
 * Created by <a href=mailto:boweny.yan@qunar.com>boweny.yan</a>
 * DATE : 02/16/2020
 * TIME : 17:23
 * PROJECT : DataStructureAndAlgorithm
 * PACKAGE : cn.yanbowen.tree
 *
 * @author boweny.yan
 * <p>
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 * <p>
 * 假设一个二叉搜索树具有如下特征：
 * <p>
 * 节点的左子树只包含小于当前节点的数。
 * 节点的右子树只包含大于当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 * 示例 1:
 * <p>
 * 输入:
 * <p>          2
 * <p>        / \
 * <p>      1   3
 * 输出: true
 * <p>
 * 示例 2:
 * <p>
 * 输入:
 * <p>         5
 * <p>       / \
 * <p>     1   4
 * <p>       / \
 * <p>     3   6
 * 输出: false
 * 解释: 输入为: [5,1,4,null,null,3,6]。
 *      根节点的值为 5 ，但是其右子节点值为 4 。
 */
public class _98_ValidateBinarySearchTree {

    class Solution {
        public boolean isValidBST(TreeNode root) {

            return isValid(root, null, null);

        }

        public boolean isValid(TreeNode root, Integer min, Integer max) {
            if (root == null)
                return true;
            if (min != null && root.val <= min) return false;
            if (max != null && root.val >= max) return false;

            return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
        }
    }
}
