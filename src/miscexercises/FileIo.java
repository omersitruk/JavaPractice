package miscexercises;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileIo {
	final static String FILE_PATH = "C:\\Users\\USER\\Desktop\\a.txt";
	final static String OUTPUT_PATH = "C:\\Users\\USER\\Desktop\\b.txt";

	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter(OUTPUT_PATH);
		for (String line : Files.readAllLines(Paths.get(FILE_PATH))) {
			int foo = Integer.parseInt(line);
			int a = (foo * foo);
			out.println(a);
		}
		out.close();
	}

}

// 4,4666,43,765,4356,3454