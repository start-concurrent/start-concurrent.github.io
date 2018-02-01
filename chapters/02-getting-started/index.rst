Programming and Problem Solving
===============================

    If you can't solve a problem, then there is an easier problem you can solve: find it.

    -George Pólya

Test of Regular Java Formatting
-------------------------------

Here is an inline-specified :index:`program example`::

    import java.util.Scanner;

    public class Example {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int value = in.nextInt();
            System.out.print("That number doubled is: ");
            System.out.println(value * 2);
        }
    }

End of program text example.

Test of Outside File
--------------------

Here is an imported-file :index:`program example`:

.. literalinclude:: programs/GetInputCLI.java
    :linenos:

A Java program to get the height, coefficient of
restitution, and number of bounces from the command line.
