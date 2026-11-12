class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // optimal solution

        // early return if nums2 is empty
        if (n == 0) {
            return;
        }

        // indexes 
       int i = m - 1;
       int j = n - 1;
       int k = nums1.length - 1;

        // merge the array in reverse order
       while (i >= 0 && j >= 0) {
        if (nums1[i] > nums2[j]) {
            nums1[k] = nums1[i];
            i--;
            k--;
        } else {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
       }

        // handling remaining elements of nums2 
       while (j >= 0) {
        nums1[k] = nums2[j];
        j--;
        k--;
       }
        
    }
}