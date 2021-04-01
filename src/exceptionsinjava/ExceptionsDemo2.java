package exceptionsinjava;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExceptionsDemo2 {
    static void convertDateFormat(String inputDate) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
            Date date = sdf.parse(inputDate);
            SimpleDateFormat outputsdf = new SimpleDateFormat("yyyy-mm-dd");
            String outputDate = outputsdf.format(date);
            System.out.println("After changing date format to yyyy/mm/dd: " + outputDate);
        } catch (java.text.ParseException e) {
            System.out.println("Some error occured while converting date format");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Date in dd/mm/yyyy Format: ");
        String inputDate = scanner.nextLine();
        convertDateFormat(inputDate);

    }

}

