# Date Class Exercise

This Java project involves creating a `Date` class to handle date operations with built-in validation for day, month, and leap year scenarios. It also includes a custom exception `DException` to handle invalid dates.

## Table of Contents

- [Overview](#overview)
- [Classes](#classes)
    - [Date](#date)
    - [DException](#dexception)
- [Test Class](#test-class)
- [How to Run](#how-to-run)

## Overview

The program defines a `Date` class to handle date-related operations. The class includes:

- Validation of day and month values based on the provided year.
- Validation of leap year for the month of February.
- A constructor that throws a `DException` if the provided date is invalid.

The program also includes a `Test` class to demonstrate the usage of the `Date` class and its exception handling.

## Classes

### Date

`Date` is a class representing a date with day, month, and year properties. It includes a constructor that takes day, month, and year as parameters and throws a custom `DException` if the date is invalid. The validation rules are as follows:

- The day must be within the valid range for the given month and year.
- The month must be between 1 and 12.
- February accounts for leap years when calculating valid day ranges.

The class contains private methods `getDaysInMonth(int month, int year)` and `isLeapYear(int year)` to assist with date validation.

### DException

`DException` is a custom exception class representing invalid date scenarios. It is thrown by the `Date` class constructor when an invalid date is provided.

## Test Class

The `Test` class demonstrates the usage of the `Date` class and its validation. It creates instances of the `Date` class with valid and invalid dates and tests the exception handling.

## How to Run

To run the program:

1. Compile the Java files in your project directory:
   ```
   javac *.java
   ```

2. Run the `Test` class:
   ```
   java Test
   ```

The program will output results for both valid and invalid dates, showing whether the dates were successfully created or if exceptions were thrown.
