class Solution {
    public int mostBooked(int n, int[][] meetings) {
        int[] count = new int[n];
        int maxIdx = 0;
        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> a[1] == b[1] ? Long.compare(a[0], b[0]) : Long.compare(a[1], b[1]));
        PriorityQueue<long[]> av = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));
        for(int i = 0; i < n; i++){
            av.offer(new long[]{i, 0});
        }
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        for(int[] meeting : meetings){
            int s = meeting[0];
            int e = meeting[1];
            int d = e - s;
            while(!pq.isEmpty() && s >= pq.peek()[1]){
                av.offer(pq.poll());
            }
            if(av.isEmpty()){
                long[] endMeet = pq.poll();
                av.offer(endMeet);
                while(!pq.isEmpty() && endMeet[1] >= pq.peek()[1]){
                    av.offer(pq.poll());
                }
                endMeet = av.poll();
                count[(int)endMeet[0]]++;
                endMeet[1] = Math.max(endMeet[1] + d, e);
                pq.offer(endMeet);
            }else{
                long[] next = av.poll();
                count[(int)next[0]]++;
                next[1] = Math.max(next[1] + d, e);
                pq.offer(next);
            }
        }
        for(int i = 0; i < n; i++){
            if(count[i] > count[maxIdx]){
                maxIdx = i;
            }
        }
        return maxIdx;
    }
}