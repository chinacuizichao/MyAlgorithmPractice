package com.roger.algorithm.tree;

public class Tree {


    public static void main(String[] args) {

    }

    public static void preOrderTraversal(TreeNode root) {
        if (root != null) {
            System.out.println(root);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }

    }
//
//    /**
//     * 获取传入指定视图下的所有子视图
//     *
//     * @param view
//     * @return
//     */
//    private List<View> getAllChildViews(View view) {
//        List<View> allChildViews = new ArrayList<>();
//        if (view != null && view instanceof ViewGroup) {
//            ViewGroup vp = (ViewGroup) view;
//            for (int i = 0; i < vp.getChildCount(); i++) {
//                View viewChild = vp.getChildAt(i);
//                // 添加视图
//                allChildViews.add(viewChild);
//                // 方法递归
//                allChildViews.addAll(getAllChildViews(viewChild));
//            }
//        }
//        return allChildViews;
//    }


    /**
     * 镜像二叉树
     *
     * @param root
     * @return
     */
    public static TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = tmp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    /**
     * 二叉树最大深度-递归
     *
     * @param root
     * @return
     */
    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    /**
     * 二叉树最小深度-递归
     *
     * @param root
     * @return
     */
    public static int minDepth(TreeNode root) {

        if (root == null) return 0;

        if (root.left == null && root.right == null) return 1;

        if (root.left != null && root.right == null) return minDepth(root.left) + 1;

        if (root.left == null && root.right != null) return minDepth(root.right) + 1;

        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
