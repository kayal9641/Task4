Task 4 – Modular Calculator (Java)
Description

This project is a modular calculator application developed using Java.
Each arithmetic operation is implemented as a separate method, following modular programming principles.

The program accepts user input from the console and performs calculations based on the selected operation.

Features

Modular method design

Method overloading

Exception handling for divide-by-zero

Pass-by-value demonstration

Reusable utility methods

User input using Scanner

Technologies Used

Java (JDK 17)

Eclipse / Cursor / VS Code

Command Prompt / PowerShell

How to Run

Compile the program:
javac ModularCalculator.java

Run the program:
java ModularCalculator

Test Cases
Test Case 1: Addition

Input

Enter first number: 10

Enter second number: 5

Enter choice: 1

Expected Output

Addition Result: 15

Test Case 2: Subtraction

Input

Enter first number: 20

Enter second number: 8

Enter choice: 2

Expected Output

Subtraction Result: 12

Test Case 3: Multiplication

Input

Enter first number: 7

Enter second number: 6

Enter choice: 3

Expected Output

Multiplication Result: 42

Test Case 4: Division (Valid Input)

Input

Enter first number: 10

Enter second number: 2

Enter choice: 4

Expected Output

Division Result: 5.0

Test Case 5: Division by Zero

Input

Enter first number: 10

Enter second number: 0

Enter choice: 4

Expected Output

Error: Cannot divide by zero

Test Case 6: Invalid Operation Choice

Input

Enter first number: 5

Enter second number: 5

Enter choice: 6

Expected Output

Invalid choice

Test Case 7: Pass-By-Value Demonstration

Initial Value

value = 20

Output

Inside method value: 30

Outside method value: 20

Explanation
Java follows pass-by-value, so changes made inside the method do not affect the original variable.
