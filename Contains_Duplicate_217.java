//                217. Contains Duplicate

// input1 nums = [1,2,3,1]   
// output1 nums = true

// input2 nums = [1,2,3,4]   
// output2 nums = false

import java.util.*;
class Contains_Duplicate_217{
    public static void main(String[] args){
        int[]nums={1,2,3,1};
        System.out.print(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums){
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }
}



