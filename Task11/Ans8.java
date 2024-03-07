package Task11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ans8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            File file = new File("example.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please make sure the file exists.");
        }

	}

}
