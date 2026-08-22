# Introduction — Data Types, Input & Basics

## What I learned

### Java Basics
- Java is case-sensitive.
- Basic way to print output:
  - `System.out.print()` prints on the same line.
  - `System.out.println()` moves to the next line.
- A Java program runs from the `main()` method.

### Variables
A variable has:
- Declaration → `int x;`
- Initialization → `x = 5;`

### Data Types

Primitive data types:
- `byte`
- `short`
- `int`
- `long`
- `float`
- `double`
- `char`
- `boolean`

Approximate sizes:
- `byte` → 8 bits
- `short` → 16 bits
- `int` → 32 bits
- `long` → 64 bits
- `float` → 32 bits
- `double` → 64 bits
- `char` → 16 bits
- `boolean` → true / false

### Binary Numbers
- Binary uses `0` and `1`.
- Each position represents a power of 2.
- With `n` bits, the largest unsigned number is `2^n - 1`.

### Taking Input
I learned to take input using `Scanner`.

```java
import java.util.Scanner;

Scanner scn = new Scanner(System.in);
int x = scn.nextInt();

### Average of Numbers

When integers are divided by integers, Java performs integer division.

```java
8 / 3
Result: 2

To get the decimal result, use a decimal value such as 3.0:

double avg = (a + b + c) / 3.0;
Type Promotion

In arithmetic operations, smaller numeric types are promoted to larger types.

double > float > long > int > short > byte

For example, when an int and a double are used in an operation, the result becomes double.