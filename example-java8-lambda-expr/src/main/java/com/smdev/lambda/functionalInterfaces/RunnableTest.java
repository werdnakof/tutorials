package com.smdev.lambda.functionalInterfaces;

/**
 * Example:
 * {@link http://www.oracle.com/webfolder/technetwork/tutorials/obe/java/Lambda-QuickStart/index.html}
 *
 * @author Ireth
 */
public class RunnableTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ================= OLD ===========================
		// Anonymous Runnable
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("r1 is running...");
			}
		};
		r1.run();

		// ================= NEW ===========================
		// Lambda Runnable
		Runnable r2 = () -> System.out.println("r2 is running...");
		r2.run();
	}

}
