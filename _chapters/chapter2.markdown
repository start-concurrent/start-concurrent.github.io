---
layout: chapter
number: 2
title:  "Programming and Problem Solving"
---

> If you can't solve a problem, then there is an easier problem you can solve: find it.
>
> -George P&oacute;lya

## Buying a computer


Test of regular Java formatting:

{% highlight java %}
import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner in;
		in = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int value;
		value = in.nextInt();
		System.out.print("That number doubled is: ");
		System.out.println(value * 2);
	}
}
{% endhighlight %}


Test of outside file:

{% highlight java linenos %}
{% include_relative chapter2/programs/GetInputCLI.java %}
{% endhighlight %}

A Java program to get the height, coefficient of
restitution, and number of bounces from the command line.