public class Test {

    public static void main(String[] args) {
        // Test case 1: Valid date
        try {
            Date validDate = new Date(15, 6, 2022); // June 15, 2022
            System.out.println("Valid date created: " + validDate.day + "/" + validDate.month + "/" + validDate.year);
        } catch (DException e) {
            System.out.println("Test failed for valid date: " + e.getMessage());
        }

        // Test case 2: Invalid day
        try {
            Date invalidDayDate = new Date(31, 4, 2022); // April 31, 2022 (invalid day for April)
            System.out.println("Test failed: invalid date created.");
        } catch (DException e) {
            System.out.println("Exception caught for invalid day: " + e.getMessage());
        }

        // Test case 3: Invalid month
        try {
            Date invalidMonthDate = new Date(15, 13, 2022); // Month 13 does not exist
            System.out.println("Test failed: invalid date created.");
        } catch (DException e) {
            System.out.println("Exception caught for invalid month: " + e.getMessage());
        }

        // Test case 4: Leap year test
        try {
            Date leapYearDate = new Date(29, 2, 2020); // February 29, 2020 (leap year)
            System.out.println("Leap year date created: " + leapYearDate.day + "/" + leapYearDate.month + "/" + leapYearDate.year);
        } catch (DException e) {
            System.out.println("Test failed for leap year date: " + e.getMessage());
        }

        // Test case 5: Non-leap year test
        try {
            Date nonLeapYearDate = new Date(29, 2, 2021); // February 29, 2021 (not a leap year)
            System.out.println("Test failed: invalid date created.");
        } catch (DException e) {
            System.out.println("Exception caught for invalid leap year date: " + e.getMessage());
        }
    }
}
