public class Date {
    int day;
    int month;
    int year;

    public Date(int day, int month, int year) throws DException {
        int daysInMonth = getDaysInMonth(month, year);
        if (month < 1 || month > 12) {
            throw new DException("Month must be between 1 and 12.");
        }
        if (day < 1 || day > daysInMonth) {
            throw new DException(String.format("The day must be between 1 and %d for the month %d.", daysInMonth, month));
        }
        
    
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    private int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0;
        }
    }
    

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
}
