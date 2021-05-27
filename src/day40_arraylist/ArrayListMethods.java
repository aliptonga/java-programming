package day40_arraylist;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println("size = " + shoppingList.size());
        System.out.println("isEmpty ? = " + shoppingList.isEmpty());
        if (shoppingList.isEmpty()) {
            System.out.println("List is empty, kepp coding java");
        }else {
            System.out.println("List is not empty, go play LOL");
        }

        shoppingList.add("shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("new phone");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("tesla");
        System.out.println("size = " + shoppingList.size());
        System.out.println("isEmpty ? = " + shoppingList.isEmpty());
        if (shoppingList.isEmpty()) {
            System.out.println("List is empty, kepp coding java");
        }else {
            System.out.println("List is not empty, go play LOL");
        }

        int count = shoppingList.size();
        System.out.println("Items to buy = " + count);

        System.out.println("is shoes in my list? = " + shoppingList.contains("shoes"));
        if (shoppingList.contains("shoes")) {
            System.out.println("shoes is in the list");
        }else {
            System.out.println("shoes is not in the list");
        }

        System.out.println("Buying shoes ...... $1399");

        shoppingList.remove("shoes");
    }
}
