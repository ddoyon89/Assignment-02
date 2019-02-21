import java.util.*;

public class ToFromConverter {

    public static String baseConversion(String number, int sBase, int dBase) {
        return Integer.toString(Integer.parseInt(number, sBase), dBase);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to convert: ");
        String number = Integer.toString(input.nextInt());
        System.out.println("Enter your starting base: ");
        int sBase = input.nextInt();
        System.out.println("Enter your destination base: ");
        int dBase = input.nextInt();
        System.out.println("Converting "+ number + " from Base " + sBase + " to Base " + dBase + " yields: "+ baseConversion(number, sBase, dBase));
        input.close();

    }   
}