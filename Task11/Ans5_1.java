package Task11;

public class Ans5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String name = "Mahi , Priya";
			System.out.println(name.charAt(20));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Exception handled");
		}

	}

}
