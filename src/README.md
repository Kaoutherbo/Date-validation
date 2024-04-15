# Date Validation Exercise

## Overview

This exercise involves creating a Java program that validates dates and raises exceptions when invalid dates are provided. The program consists of the following components:

- `Date` class: Represents a date with attributes `day`, `month`, and `year`.
- `DException` class: Custom exception class used when an invalid date is provided.
- `Test` class: Contains a main method to test the `Date` class and handle exceptions.

## Classes

### `Date`

The `Date` class has the following attributes:

- `day`: Represents the day of the month (1-31).
- `month`: Represents the month of the year (1-12).
- `year`: Represents the year.

The constructor of the `Date` class accepts three parameters (`day`, `month`, and `year`) and throws a `DException` if the provided date is invalid. A date is considered invalid if the day is out of the valid range for the given month and year (taking into account leap years), or if the month is not in the range of 1-12.

The `Date` class contains helper methods to determine the number of days in a given month and whether a year is a leap year:

- `getDaysInMonth(month, year)`: Returns the number of days in the specified month and year.
- `isLeapYear(year)`: Determines if the specified year is a leap year.

### `DException`

The `DException` class is a custom exception class that extends `Exception`. It is used to signal invalid dates provided to the `Date` constructor.

### `Test`

The `Test` class contains the `main` method, which tests the `Date` class. It creates instances of `Date` and handles exceptions for invalid dates. Test cases include:

- Valid dates
- Invalid day for a specific month
- Invalid month
- Invalid leap year date
- Valid leap year date

## How to Run the Program

To run the program:

1. Compile the `Date.java`, `DException.java`, and `Test.java` files:
    ```
    javac Date.java DException.java Test.java
    ```

2. Run the `Test` class:
    ```
    java Test
    ```

The program will output results of the test cases, including catching exceptions for invalid dates.
