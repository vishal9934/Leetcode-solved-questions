class Solution {
    public int findLongestChain(int[][] pairs) {
if (pairs == null || pairs.length == 0) return 0;

    PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b) -> {
        return Integer.compare(a[1], b[1]);
    });
    
    for (int[] pair: pairs) {
        pq.add(pair);
    }
    
    int[] current = pq.poll();
    int result = 1;
    while (pq.size() > 0) {
        int[] next = pq.poll();
        if (current[1] >= next[0]) continue;
        else {
            result++;
            current = next;
        }
    }
    
    return result;
}
}