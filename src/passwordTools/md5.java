/**
 * 
 */
package passwordTools;

import java.security.*;
//import java.util.*;
//import java.io.*;
//import java.math.BigInteger;
import org.apache.commons.codec.binary.*;
import java.nio.charset.*;


/**
 * @author Donald Brown
 * 
 */
public class md5 {

	private String input = "";
	private String output = "";
	/**
	 * 
	 */
	public md5() {
		// TODO Auto-generated constructor stub
	}
	
	public md5(String input){
		
	}
	
	public void setInput(String in) throws NoSuchAlgorithmException{
		this.input = in;
		generateMD5(in);
	}
	
	public String getInput(){
		return input;
	}
	
	public String getOutput(){
		return output;
	}
	

	public static void printBytes(byte[] array, String name) {
		for (int k = 0; k < array.length; k++) {
			System.out.println(name + "[" + k + "] = " + "0x"
					+ UnicodeFormatter.byteToHex(array[k]));
		}
	}

	/**
	 * @param args
	 * @throws NoSuchAlgorithmException 
	 */
	public static void main(String[] args) throws NoSuchAlgorithmException {
		// TODO Auto-generated method stub

		/*String userInput = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter data:");
		System.out.println(generateMD5(sc.nextLine()));*/
		
		/*//Proper
		String plaintext = "What a mighty God we serve.";	//While watching "Fame (2009)"
		plaintext = "1005195";
		MessageDigest m = MessageDigest.getInstance("MD5");
		//m.reset();
		m.update(plaintext.getBytes());
		byte[] digest = m.digest();
		BigInteger bigInt = new BigInteger(1,digest);
		String hashtext = bigInt.toString(16);
		// Now we need to zero pad it if you actually want the full 32 chars.
		while(hashtext.length() < 32 ){
		  hashtext = "0"+hashtext;
		}
		
		System.out.println(plaintext);
		System.out.println(hashtext);

		//Proper
		String fz = "1005195";
		final MessageDigest messageDigest = MessageDigest.getInstance("MD5");
		messageDigest.reset();
		messageDigest.update(fz.getBytes(Charset.forName("UTF8")));
		final byte[] resultByte = messageDigest.digest();
		final String result = new String(Hex.encodeHex(resultByte));
		
		System.out.println(result);*/
		
		
	}
	
	private void generateMD5(String in) throws NoSuchAlgorithmException{
		final MessageDigest messageDigest = MessageDigest.getInstance("MD5");
		messageDigest.reset();
		messageDigest.update(in.getBytes(Charset.forName("UTF8")));
		final byte[] resultByte = messageDigest.digest();
		final String result = new String(Hex.encodeHex(resultByte));
		this.output = result;
		//return result;
	}

}
