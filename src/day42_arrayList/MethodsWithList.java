package day42_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("java"); words.add("html"); words.add("selenium");
        words.add("a"); words.add("input"); words.add("title");
        printStrList(words);

        List<Integer> nums = Arrays.asList(324, 234, 4324);
        int sum = sumIntegerList(nums);
        System.out.println("sum = " + sum);

    }
    public static void printStrList(List<String> stringList) {
        for (String str : stringList) {
            System.out.println(str + " ");
        }
        System.out.println();
    }

    public static int sumIntegerList(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }
}
