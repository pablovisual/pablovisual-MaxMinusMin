
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        //set two new intergers to a min and max value
        Integer min = Integer.MAX_VALUE;
        Integer max = Integer.MIN_VALUE;

        //now loop to get the min and max value of the list nums
        for (Integer index : nums) {
            if (min > index)
                min = index;
        }

        for (Integer idx : nums) {
            if (max < idx)
                max = idx;
        }

        //then return the difference btw the max and min
        return max - min;
    }
}
