class Solution {
   public int[] maxSlidingWindow(int[] nums, int k) {
    if(nums == null || k <= 0) return new int [0];
    int [] arr = new int[nums.length - k + 1];
    int in = 0;
    Deque<Integer> dq = new ArrayDeque<>();
    for(int i = 0; i < nums.length; i++){
        while(!dq.isEmpty() && dq.peek() < i - k + 1) dq.poll();
        while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) dq.pollLast();
        dq.offer(i);
        if(i >= k - 1) arr[in++] = nums[dq.peek()];
    }
    return arr;
}
}