package miscexercises;
import java.util.Scanner;

public class CommaSum {

	public static void main(String[] args) {
	
		Scanner dis=new Scanner(System.in);

        String line = dis.nextLine(); //read 1,2,3

        //separate all values by comma
        String[] lineVector = line.split(",");
        int sum=0;
        for (String i:lineVector){
        	int foo = Integer.parseInt(i); 
        	sum=sum+foo; 
        }
        System.out.println(sum);
        dis.close();
	}
}
