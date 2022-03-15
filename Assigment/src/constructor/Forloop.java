package constructor;

public class Forloop {

	public static void main(String[] args) 
	{
		
		for (int i=1;i<=20;i++) {
			
			if (i%3==0) {
				System.out.println("fizz");
			}
			else if (i%5==0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		}

	}

}
