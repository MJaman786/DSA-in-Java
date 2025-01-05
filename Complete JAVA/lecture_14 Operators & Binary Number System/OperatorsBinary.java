/* 
1. Arithmetic Operators: Used to perform basic arithmetic operations.
+ (Addition)
- (Subtraction)
* (Multiplication)
/ (Division)
% (Modulus)

2. Unary Operators: Used with only one operand.
+ (Unary plus)
- (Unary minus)
++ (Increment)
-- (Decrement)
! (Logical complement)

3. Assignment Operators: Used to assign values to variables.
= (Simple assignment)
+= (Add and assign)
-= (Subtract and assign)
*= (Multiply and assign)
/= (Divide and assign)
%= (Modulus and assign)

4. Relational Operators: Used to compare two values.
== (Equal to)
!= (Not equal to)
> (Greater than)
< (Less than)
>= (Greater than or equal to)
<= (Less than or equal to)

5. Bitwise Operators: Used to perform bit-level operations.
& (Bitwise AND)
| (Bitwise OR)
^ (Bitwise XOR)
~ (Bitwise complement)
<< (Left shift)
>> (Right shift)
>>> (Unsigned right shift)

6. Ternary Operator: A shorthand for if-else statements.
? : (Ternary conditional)

Instanceof Operator: Used to test whether an object is an instance of a specific class or subclass.
instanceof
Type Comparison Operator: Used to compare types.

== (Reference equality)

*/

public class OperatorsBinary {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 5;
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus (remainder)

        // Unary Operators
        int c = +a; // Unary plus
        int d = -b; // Unary minus
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("++a = " + (++a)); // Pre-increment
        System.out.println("b++ = " + (b++)); // Post-increment
        System.out.println("--a = " + (--a)); // Pre-decrement
        System.out.println("b-- = " + (b--)); // Post-decrement

        // Relational Operators
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b)); // Greater than
        System.out.println("a < b: " + (a < b)); // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x)); // Logical NOT

        // Bitwise Operators
        int e = 6; // 110 in binary
        int f = 4; // 100 in binary
        System.out.println("e & f: " + (e & f)); // Bitwise AND
        System.out.println("e | f: " + (e | f)); // Bitwise OR
        System.out.println("e ^ f: " + (e ^ f)); // Bitwise XOR
        System.out.println("~e: " + (~e)); // Bitwise NOT
        System.out.println("e << 1: " + (e << 1)); // Left shift
        System.out.println("e >> 1: " + (e >> 1)); // Right shift
        System.out.println("e >>> 1: " + (e >>> 1)); // Unsigned right shift

        // Assignment Operators
        int g = 10;
        g += 5; // g = g + 5
        System.out.println("g += 5: " + g);
        g -= 3; // g = g - 3
        System.out.println("g -= 3: " + g);
        g *= 2; // g = g * 2
        System.out.println("g *= 2: " + g);
        g /= 4; // g = g / 4
        System.out.println("g /= 4: " + g);
        g %= 3; // g = g % 3
        System.out.println("g %= 3: " + g);

        // Ternary Operator
        int h = (a > b) ? a : b; // If a > b, then h = a, else h = b
        System.out.println("h = " + h);
    }
}