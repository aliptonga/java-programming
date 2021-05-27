package day31_arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums ={-5, 23, 123, 654, 2344, 12345, 14421};
        System.out.println(Arrays.binarySearch(nums, 23));
        System.out.println(Arrays.binarySearch(nums, 2344));
        System.out.println(Arrays.binarySearch(nums, 25));
        System.out.println(Arrays.binarySearch(nums, 700));
        System.out.println(Arrays.binarySearch(nums, -5));




    }
}
