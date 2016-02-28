/*
 * File: Fibonacci.java
 * Name: Travis Kohlbeck
 * -----------------------------
 * This file prints the Fibonacci sequence up to
 * MAX_TERM_VALUE
 */

import acm.program.*;

public class Fibonacci extends ConsoleProgram {

	private static final int MAX_TERM_VALUE = 10000;

	public int Fib(int n) {
		if (n < 2) return n;
		return Fib(n-1) + Fib(n-2);
	}

	public void run() {
		println("This program lists the Fibonacci sequence.");
		for (int i = 1, term = 0; term < MAX_TERM_VALUE; i++) {
			println(term);
			term = Fib(i);
		}
	}
}
