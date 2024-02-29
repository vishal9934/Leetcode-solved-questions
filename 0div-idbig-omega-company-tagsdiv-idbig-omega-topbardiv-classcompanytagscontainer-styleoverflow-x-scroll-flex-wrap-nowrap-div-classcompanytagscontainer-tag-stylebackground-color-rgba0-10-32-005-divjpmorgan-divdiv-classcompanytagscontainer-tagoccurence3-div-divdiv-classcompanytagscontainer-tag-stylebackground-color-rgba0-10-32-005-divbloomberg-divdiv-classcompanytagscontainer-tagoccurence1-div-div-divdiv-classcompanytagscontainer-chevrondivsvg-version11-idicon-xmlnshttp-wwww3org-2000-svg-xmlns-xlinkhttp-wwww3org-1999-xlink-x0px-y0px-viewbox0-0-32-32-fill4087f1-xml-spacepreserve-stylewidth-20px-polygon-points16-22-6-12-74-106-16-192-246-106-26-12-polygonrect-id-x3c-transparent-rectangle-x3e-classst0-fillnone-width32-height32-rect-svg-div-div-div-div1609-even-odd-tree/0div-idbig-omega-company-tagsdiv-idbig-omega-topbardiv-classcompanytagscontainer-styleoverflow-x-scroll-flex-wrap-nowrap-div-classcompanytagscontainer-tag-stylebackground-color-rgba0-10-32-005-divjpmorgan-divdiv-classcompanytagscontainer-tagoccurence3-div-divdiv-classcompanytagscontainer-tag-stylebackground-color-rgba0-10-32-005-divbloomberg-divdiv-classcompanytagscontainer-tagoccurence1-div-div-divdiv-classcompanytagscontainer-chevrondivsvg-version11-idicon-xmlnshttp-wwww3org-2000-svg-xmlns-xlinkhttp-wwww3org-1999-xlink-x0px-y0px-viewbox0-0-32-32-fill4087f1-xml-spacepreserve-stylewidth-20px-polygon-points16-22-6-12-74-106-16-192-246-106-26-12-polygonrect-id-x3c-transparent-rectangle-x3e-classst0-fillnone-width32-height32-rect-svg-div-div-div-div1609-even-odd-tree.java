class Solution {

    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int level = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            int prev = level % 2 == 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode child = q.poll();

                // check
                // if (prev == null) {
                //     prev = child;
                //     if (level % 2 == 0 && child.val % 2 == 0) {
                //         return false;
                //     }
                //     if (level % 2 == 1 && child.val % 2 == 1) {
                //         return false;
                //     }
                // } else {
                //     if (level % 2 == 0) {
                //         // level even
                //         if (child.val % 2 == 0 || child.val <= prev.val) {
                //             return false;
                //         }
                //     } else {
                //         // level odd
                //         if (child.val % 2 == 1 || child.val >= prev.val) {
                //             return false;
                //         }
                //     }

                //     //prev
                //     prev = child;
                // }

                if (level % 2 == 0 && (child.val % 2 == 0 || child.val <= prev)) {
                    return false;
                }
                if (level % 2 == 1 && (child.val % 2 == 1 || child.val >= prev)) {
                    return false;
                }

                prev = child.val;
                if (child.left != null) {
                    q.add(child.left);
                }
                if (child.right != null) {
                    q.add(child.right);
                }
            }
            level++;
        }

        return true;
    }
}
