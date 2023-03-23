class Solution {
    public int makeConnected(int n, int[][] connections) {
        int[] parent = new int[n];  // Array to find the ultimate parent in union find method.
        
        for(int i=0;i<n;i++) parent[i] = i;  // At first all the elements are not connected we combine them gradually according to our given graph of connections.
        
        int cycles = 0;  // Variable to store total number of cycles/loops.
        
        int unconnected_computers = 0;  // variable to store total unconnected components.
        
        for(int[] link : connections) {
            
            int from = link[0];
            int to = link[1];
            
            if(find_parent(from, parent) == find_parent(to, parent)) cycles++;  // if parent of one node is equal to parent of other node which implies that both nodes are connected previously and forms a cycle with this union.
            
            union(from, to, parent);
            
        }
        
        // loop to count total number of unconnected components.
        for(int i=0;i<n;i++) {
            if(parent[i] == i) unconnected_computers++;
        }
    
        // Number of cycles represents Number of extra connections, which we can use to connect the unconnected computers.
        if(cycles >= unconnected_computers-1) return unconnected_computers-1;
        return -1;
    }
    
    // Method to find parent of every node.
    public int find_parent(int node, int[] parent) {
        if(parent[node] == node) return node;
        return find_parent(parent[node], parent);
    }
    
    // Method to create the union of two sets.
    public void union(int from, int to, int[] parent) {
        from = find_parent(from, parent);
        to = find_parent(to, parent);
        
        parent[to] = from;
    }
}