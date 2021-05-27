package day05_primitives_concatanation;

public class CellPhone {
    public static void main(String[] args){
        String brand="Apple";
        String model=" Iphone 12";
        String color=" Blue";
        double price=1072.01;
        int storage=256;
        boolean hasCamera=true;
        System.out.println(brand+model+color);
        System.out.print("$"+price);
        System.out.println("\t"+storage+"GB");

        System.out.println(brand);
        System.out.println(model);
        //with message
        System.out.println("Brand is "+brand);
        System.out.println("Model is "+model);
        System.out.println("Color is "+color);
        System.out.println("Price is $"+price);
        System.out.println("Storage is "+storage+"GB");
        System.out.println("Has camera? - "+hasCamera);


    }
}
