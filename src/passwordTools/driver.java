/**
 * 
 */
package passwordTools;

/**
 * @author Donald Brown
 *
 */


import java.security.NoSuchAlgorithmException;
import java.util.*;


public class driver {

	/**
	 * 
	 */
	public driver() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws NoSuchAlgorithmException 
	 */
	public static void main(String[] args) throws NoSuchAlgorithmException {
		// TODO Auto-generated method stub
		md5 hash = new md5();
		
		Scanner sc = new Scanner(System.in);
		
		hash.setInput(sc.nextLine());
		System.out.println(hash.getOutput());
		
		sc.close();
		
		fileOp fo = new fileOp();
		
		fo.writeToFile("out.txt", hash.getInput(),hash.getOutput());

	}

}
