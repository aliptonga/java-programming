package day19_class_vs_object_strings;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StringComparison {
    public static void main(String[] args) {
        String city = "chicago";
        System.out.println(city.equals("chicago"));
        System.out.println(city.equals("Chicago"));

        System.out.println(city.equalsIgnoreCase("chicago"));
        System.out.println(city.equalsIgnoreCase("CHICAGO"));
        System.out.println(city.equalsIgnoreCase("chi cago"));
        System.out.println(city.equalsIgnoreCase("chicagoo"));

        if (city.equals("CHICAGO")) {
            System.out.println("equals() true");
        }else {
            System.out.println("equals() false");
        }

        if (city.equalsIgnoreCase("CHICAGO")) {
            System.out.println("equalsIgnoreCase() true");
        }else {
            System.out.println("equalsIgnoreCase() false");
        }
    }
}
