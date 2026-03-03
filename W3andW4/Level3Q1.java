import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check if year is valid (Gregorian calendar)
        if (year < 1582) {
            System.out.println("Leap Year calculation works only for year >= 1582.");
        } else {

           
            System.out.println("\nUsing Multiple if-else:");

            if (year % 4 == 0) {

                if (year % 100 == 0) {

                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year");
                    } else {
                        System.out.println(year + " is NOT a Leap Year");
                    }

                } else {
                    System.out.println(year + " is a Leap Year");
                }

            } else {
                System.out.println(year + " is NOT a Leap Year");
            }


           

        }

        sc.close();
    }
}