package day33_arrays;

import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {
        int num1 =10 ;
        int num2 = 30;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int[] nums = {5, 10, 4, 100};
        System.out.println("before swap: " + Arrays.toString(nums));

        temp = nums[0];
        nums[0] = nums[3];
        nums[3] = temp;
        System.out.println("after 1st and last swap: " + Arrays.toString(nums));

        int[] nums2 = {5, 10, 4, 100};
        System.out.println("Before: " + Arrays.toString(nums2));
        //2
        for(int i = 0; i < nums2.length/2; i++) {
            int temp2 = nums2[i];
            nums2[i] = nums2[nums2.length - 1 - i];
            nums2[nums2.length - 1 - i] = temp2;
        }
        System.out.println("After: " + Arrays.toString(nums2));

        String[] words = {"java", "html", "js", "ruby", "css"};
        System.out.println("before reverse words = " + Arrays.toString(words));
        //   i = 0 ,     j = 4                       2
        for (int i = 0, j = words.length - 1; i < words.length/2; i++, j--) {
            String tempWord = words[i];
            words[i] = words[j];
            words[j] = tempWord;
        }
        System.out.println("words after reverse = " + Arrays.toString(words));
    }
}
