import java.util.*;

public class AnyConverter {

    public static String baseConversion(String number, int sBase, int dBase) {
        return Integer.toString(Integer.parseInt(number, sBase), dBase);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to convert: ");
        String number = Integer.toString(input.nextInt());
        int sBase = 10;
        System.out.println("Enter your destination base: ");
        int dBase = input.nextInt();
        switch(dBase) {
            case 2:
            System.out.println("Converting " + number + " from Decimal to Binary yields: "+ baseConversion(number,sBase,dBase));
            break;
            case 5:
            System.out.println("Converting " + number + " from Decimal to Base 5 yields: "+ baseConversion(number,sBase,dBase));
            break;
            case 8:
            System.out.println("Converting " + number + " from Decimal to Octal yields: "+ baseConversion(number,sBase,dBase));
            break;
            case 16:
            System.out.println("Converting " + number + " from Decimal to Hexadecimal yields: 0x"+ baseConversion(number,sBase,dBase));
            break;
        }
        input.close();
    }

   
}