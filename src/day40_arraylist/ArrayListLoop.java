package day40_arraylist;
import java.util.*;
public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        System.out.println(nums);
        System.out.println("size = " + nums.size());

        nums.add(14); nums.add(879); nums.add(2564); nums.add(980);
        nums.add(45); nums.add(56346); nums.add(7); nums.add(82);
        nums.add(14); nums.add(879); nums.add(2564); nums.add(980);

        System.out.println("nums = " + nums);

        nums.remove(1);
        System.out.println("nums = " + nums);

        nums.remove(new Integer(82));
        System.out.println("nums = " + nums);

        nums.remove(new Integer(14));
        System.out.println("nums = " + nums);

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        for (int each : nums) {
            System.out.print(each + " ");
        }
    }
}
