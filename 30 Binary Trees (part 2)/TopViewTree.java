import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

class TopViewTree {
    static class Pair {
        TreeNode node;
        int hd; // Horizontal Distance
        Pair(TreeNode node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
    
    public List<Integer> topView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        
        Map<Integer, Integer> topViewMap = new TreeMap<>(); // Store first node at each horizontal distance
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root, 0));
        
        while (!queue.isEmpty()) {
            Pair curr = queue.poll();
            int hd = curr.hd;
            TreeNode node = curr.node;
            
            // Store the first occurrence of each horizontal distance
            if (!topViewMap.containsKey(hd)) {
                topViewMap.put(hd, node.val);
            }
            
            if (node.left != null) {
                queue.add(new Pair(node.left, hd - 1));
            }
            
            if (node.right != null) {
                queue.add(new Pair(node.right, hd + 1));
            }
        }
        
        // Add values to the result list
        for (int val : topViewMap.values()) {
            result.add(val);
        }
        return result;
    }

    public static void main(String[] args) {
        TopViewTree tree = new TopViewTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.right.right = new TreeNode(5);
        root.left.right.right.right = new TreeNode(6);
        
        List<Integer> topViewResult = tree.topView(root);
        System.out.println("Top View: " + topViewResult);
    }
}
