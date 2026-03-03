class Solution {
public void merge(int[] num1, int m, int[] num2, int n) {
  int i = m, j = n, k = m + n;
  while (j > 0) {
    num1[--k] = i > 0 && num1[i - 1] > num2[j - 1] ? num1[--i] : num2[--j];
  }
}
}