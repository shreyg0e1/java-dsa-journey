````
# Lecture 2 — Conditional & Operators

## Conditional Statements

Conditional statements allow code to run based on a condition.

### if

```java
if (condition) {
    // code
}
````

If the condition is true, the code inside `if` runs.

### if-else

```java
if (condition) {
    // code
} else {
    // code
}
```

If the condition is true, `if` runs; otherwise, `else` runs.

### else-if

```java
if (condition1) {
    // code
} else if (condition2) {
    // code
} else {
    // code
}
```

Conditions are checked from top to bottom. Once a true condition is found, its block executes and the remaining conditions are skipped.

## Switch Case

`switch` is used when we want to choose between multiple cases.

```java
switch (marks) {
    case 90:
        // code
        break;

    case 80:
        // code
        break;

    default:
        // code
}
```

`break` stops execution from continuing into the next case.

## Ternary Operator

The ternary operator is a short way to write a simple `if-else`.

```java
int x = (a > b) ? a : b;
```

If `a > b` is true, `x` gets `a`; otherwise, `x` gets `b`.

## Operators

### Arithmetic Operators

```text
+   -   *   /   %
```

Used for mathematical operations.

### Comparison Operators

```text
>   <   >=   <=   ==   !=
```

Used to compare values and produce a boolean result.

### Logical Operators

```text
&&   ||   !
```

* `&&` → AND
* `||` → OR
* `!` → NOT

### Assignment Operators

```text
=   +=   -=   *=   /=
```

Used to assign or update values.

### Increment / Decrement

```text
++   --
```

* `++` increases a value by 1
* `--` decreases a value by 1

## Key Takeaway

Conditional statements control which code runs based on conditions, while operators are used for calculations, comparisons, logical operations, and assignments.


## Homework : Billing Console :- 
```Example:- ```
Billing Console
***************
Enter the cost of First Object : 35
Enter the cost of Second Object : 12
Enter the cost of Third Object : 80
***************
BILL :- 
Cost of 1st Object :- 35 rs
Cost of 2nd Object :- 12 rs
Cost of 3rd Object :- 80 rs
********************
Total Cost :- 127 rs
********************
GST (18% applied)  :- 22.86 rs
********************
Total Bill to be Paid :- 149.86 rs
********************
