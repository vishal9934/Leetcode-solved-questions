class Solution {
    // HashMap to store the adjacency information of each node in the binary tree
    HashMap<Integer, List<Integer>> map = new HashMap<>();

    // In-order traversal method to build the adjacency map
    public void inTraversal(TreeNode root, int prev) {
        // Base case: if the current node is null, return
        if (root == null) {
            return;
        }

        // Create a new entry in the map for the current node with an empty list
        map.put(root.val, new ArrayList<>());
        
        // Get the list associated with the current node in the map
        List<Integer> temp = map.get(root.val);

        // If there is a previous node (-1 represents no previous node), add it to the list
        if (prev != -1) {
            temp.add(prev);
        }

        // If there is a left child, add its value to the list
        if (root.left != null) {
            temp.add(root.left.val);
        }

        // If there is a right child, add its value to the list
        if (root.right != null) {
            temp.add(root.right.val);
        }

        // Update the 'prev' variable to the current node's value
        prev = root.val;

        // Recursively perform in-order traversal on the left and right subtrees
        inTraversal(root.left, prev);
        inTraversal(root.right, prev);
    }

    // Method to calculate the maximum distance from a given start node to any other node
    public int amountOfTime(TreeNode root, int start) {
        // Build the adjacency map using in-order traversal
        inTraversal(root, -1);

        // Set to keep track of visited nodes during BFS
        HashSet<Integer> visited = new HashSet<>();

        // Queue for BFS
        Queue<Integer> queue = new LinkedList<>();

        // Map to store distances from the start node
        Map<Integer, Integer> distances = new HashMap<>();

        // Add the start node to the queue, mark it as visited, and set its distance to 0
        queue.add(start);
        visited.add(start);
        distances.put(start, 0);

        // Perform BFS to calculate distances
        while (!queue.isEmpty()) {
            // Dequeue a node
            int poppedNode = queue.poll();

            // Iterate through its neighbors
            for (int neighbor : map.get(poppedNode)) {
                // If the neighbor hasn't been visited
                if (!visited.contains(neighbor)) {
                    // Mark it as visited, enqueue it, and update its distance
                    visited.add(neighbor);
                    queue.add(neighbor);
                    distances.put(neighbor, distances.get(poppedNode) + 1);
                }
            }
        }

        // Find the maximum distance from the start node
        int maxDistance = 0;
        for (int key : distances.keySet()) {
            maxDistance = Math.max(maxDistance, distances.get(key));
        }

        // Return the maximum distance
        return maxDistance;
    }
}