
package demo;

public class HelloWorld {

	public void say() {
		for (int i = 0; i < 90; i++) {

			System.out.println("|-----------------------|");
			System.out.println(String.format("|     helloworld %02d     |", i));
			System.out.println("|-----------------------|");
		}

	}
}
