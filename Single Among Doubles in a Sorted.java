class Solution {
    int single(int[] arr) {
          int n = arr.length;

        // Since every other element appears twice,
        // the single element must be at an odd
        // position
        for (int i = 0; i < n - 1; i += 2) {
            if (arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }

        // If no element found, the 
        // single element must be 
        // the last one
        return arr[n - 1];
    }
}
