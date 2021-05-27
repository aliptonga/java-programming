package day05_primitives_concatanation;

public class PrimitivesExample {
    public static void main(String[] args){
        //*** Whole numbers/Integer types ***
        //byte=-128-127
        byte byteValue=100;
        //short=-32768-32767
        short shortValue=32000;
        //int=-2147483648-2147483647
        int intValue=276375236;
        //long=-9223372036854775808-9223372036854775807
        long longValue=8547365873465743834L;
        //*** Decimal numbers/Floating point types ***
        float floatValue=2345.55F;
        double doubleValue=2345587.5432;//2345587.5432D also valid
        //*** Character type ***
        //char is a single character in single quotes
        char charValue='M';
        //*** Boolean = true/false***
        boolean booleanValue=true;
        //Print variable values
        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println(charValue);
        System.out.println(booleanValue);
    }
}
