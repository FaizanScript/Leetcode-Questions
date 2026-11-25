class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

        int[] output = new int[nums.length];

           int i=0;
        for(int num: nums){
            if(num<pivot){
                output[i]=num;
                i++;
            }
        }
        for(int num: nums){
            if(num==pivot){
                output[i]=num;
                i++;
            }
        }
        for(int num: nums){
            if(num>pivot){
                output[i]=num;
                i++;
            }
        }
        return output;
        
    }
}