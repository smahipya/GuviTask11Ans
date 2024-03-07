package Task11;

public class Ans5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i = {1,2,3,4,5};
		try {
		System.out.println(i[10]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Handled exception");
		}

	}

}
