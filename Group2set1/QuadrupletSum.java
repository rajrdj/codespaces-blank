package Group2set1;

import java.util.*;
public class QuadrupletSum

//public class Solution  : uncomment this line or either change the class name to solution
{
    static public List<List<Integer>> quadruplets(int[] nums, int x) 
    {
        Arrays.sort(nums); // sort the input array

        List<List<Integer>> result = new ArrayList<>();

        int n = nums.length;

        // iterate over all possible quadruplets using nested loops
        for (int i = 0; i < n - 3; i++) {
            // avoid duplicates
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            for (int j = i + 1; j < n - 2; j++) {
                // avoid duplicates
                if (j > i + 1 && nums[j] == nums[j-1]) {
                    continue;
                }

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == x) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        // avoid duplicates
                        while (left < right && nums[left] == nums[left+1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right-1]) {
                            right--;
                        }

                        left++;
                        right--;
                    } else if (sum < x) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return result;
    }
}

