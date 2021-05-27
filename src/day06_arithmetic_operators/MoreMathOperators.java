package day06_arithmetic_operators;

public class MoreMathOperators {
    public static void main(String[] args){
        int toyotas=431;
        int hondas=233;
        int vw=2;
        int teslas=20;
        int nissan=1;
        int bmws=155;
        //int toyotas=431, hondas=233, vw=2, teslas=20, nissan=1, bmws=155;
        int totalCarsInParking=toyotas+hondas+vw+teslas+nissan+bmws;
        System.out.println("There are "+totalCarsInParking+" cars in parking lot!");

        String pizza = "hawaiian";
        int slices = 8;
        int people = 4;
        int slicesPerPeople = slices / people;
        System.out.println("Ther are " + slicesPerPeople + " slices per person");
        System.out.println("We ordered " + pizza + " pizza with " + slices + " slices, " + people + " people ate " + slicesPerPeople + " slices each.");

    }
}
