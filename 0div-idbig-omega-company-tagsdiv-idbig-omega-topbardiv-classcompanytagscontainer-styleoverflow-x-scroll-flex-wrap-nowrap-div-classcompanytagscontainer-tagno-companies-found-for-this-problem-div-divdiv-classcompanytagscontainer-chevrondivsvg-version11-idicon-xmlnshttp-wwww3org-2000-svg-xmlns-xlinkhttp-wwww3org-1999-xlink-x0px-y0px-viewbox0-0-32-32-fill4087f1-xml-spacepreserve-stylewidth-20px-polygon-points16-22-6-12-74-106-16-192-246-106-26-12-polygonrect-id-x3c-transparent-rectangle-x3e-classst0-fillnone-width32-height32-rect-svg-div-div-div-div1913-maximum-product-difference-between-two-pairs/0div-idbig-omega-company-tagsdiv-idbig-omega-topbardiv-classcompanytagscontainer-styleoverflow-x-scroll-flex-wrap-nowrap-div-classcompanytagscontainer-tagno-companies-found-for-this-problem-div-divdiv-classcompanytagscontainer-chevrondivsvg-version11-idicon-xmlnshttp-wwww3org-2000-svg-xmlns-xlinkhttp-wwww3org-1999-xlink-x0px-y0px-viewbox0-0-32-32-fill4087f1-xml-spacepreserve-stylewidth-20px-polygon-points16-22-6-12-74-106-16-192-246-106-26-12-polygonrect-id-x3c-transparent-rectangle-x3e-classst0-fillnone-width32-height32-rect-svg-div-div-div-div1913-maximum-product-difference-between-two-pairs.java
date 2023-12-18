class Solution {
  public int maxProductDifference(int[] nums) {
    int max1 = 0, max2 = 0, min1 = 10001, min2 = 10001;

    for (var n : nums) {
      if (n > max1) {
        max2 = max1;
        max1 = n;
      } else if (n > max2) {
        max2 = n;
      }
      if (n < min1) {
        min2 = min1;
        min1 = n;
      } else if (n < min2) {
        min2 = n;
      }
    }
    return (max1 * max2) - (min1 * min2);
  }
}