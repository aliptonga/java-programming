package day47_constructors;

public class AddressList {
    public static void main(String[] args) {
        Address cybertekAddress = new Address();
        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3300");
        cybertekAddress.setCity("Mclean");
        cybertekAddress.setState("VA");
        cybertekAddress.setZipCode("22182");

        System.out.println("CybertekSchool address: " + cybertekAddress.toString());
        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3200");

        System.out.println("address after update = " + cybertekAddress);
        System.out.println("street = " + cybertekAddress.getStreet());

        Address newAddress = new Address();
        System.out.println(newAddress.toString());
    }
}
