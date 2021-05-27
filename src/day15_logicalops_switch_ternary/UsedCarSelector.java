package day15_logicalops_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {
        double bugdget = 5000.0;
        String model = "Toyota";
        double carPrice = 8999.0;

        if (carPrice <= bugdget && (model.equals("Toyota") || model.equals("Honda") || model.equals("Tesla"))) {
            System.out.println("Ready to purchase model = " + model + ", price = " + carPrice);
        }else {
            System.out.println("Not interesting in model " + model + ", price = " + carPrice);
        }

    }
}
