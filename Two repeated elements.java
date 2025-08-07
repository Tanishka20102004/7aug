class Solution {
    public int[] twoRepeated(int[] arr) {
        // code here
    int size = arr.length;
        int count[] = new int[size];
        int i;
        int x = -1, y = -1;
        for (i = 0; i < size; i++) {
            if (count[arr[i]] == 1)
                if(x==-1)x= arr[i];
                else y = arr[i];
            else
                count[arr[i]]++;
        }
        return new int[] {x,y};
        
    }
}
