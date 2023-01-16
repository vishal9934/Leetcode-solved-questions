class Solution {
    public int[][] insert(int[][] intervalList, int[] newInterval) {
         ArrayList<int[]> ans = new ArrayList<>();
    int idx = 0;
    while (idx < intervalList.length) {
      if (intervalList[idx][0] < newInterval[0]) {
        ans.add(intervalList[idx]);
        idx++;
      } else {
        break;
      }
    }

    if (ans.size() == 0 || newInterval[0] > ans.get(ans.size() - 1)[1]) {
      ans.add(newInterval);
    } else {
      ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], newInterval[1]);
    }

    while (idx < intervalList.length) {
      int lastInterval[] = ans.get(ans.size() - 1);
      if (intervalList[idx][0] <= lastInterval[1]) {
        lastInterval[1] = Math.max(lastInterval[1], intervalList[idx][1]);
      } else {
        ans.add(intervalList[idx]);
      }
      idx++;
    }

    return ans.toArray(new int[ans.size()][]);
    }
}