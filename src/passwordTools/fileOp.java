/**
 * 
 */
package passwordTools;

import java.io.*;

/**
 * @author donnie
 *
 */
public class fileOp {

	/**
	 * 
	 */
	public fileOp() {
		// TODO Auto-generated constructor stub
	}

	public void writeToFile(String filename){
		try{
			// CREATE FILE
			FileWriter fstream = new FileWriter(filename);
			BufferedWriter out = new BufferedWriter(fstream);
			out.write("Greetings Earthlings");
			
			//CLOSE OUTPUT STREAM
			out.close();
			
		}
		//CATCH EXCEPTION IF EXCEPTION OCCURS
		catch (Exception e){
			System.out.println("ERROR: " + e.getMessage());
		}
		
	}
	
	public void writeToFile(String filename, String input, String output){
		try{
			// CREATE FILE
			FileWriter fstream = new FileWriter(filename);
			BufferedWriter out = new BufferedWriter(fstream);
			out.write("Greetings Earthlings\n");
			out.write(input + "\n");
			out.write(output);
			
			//CLOSE OUTPUT STREAM
			out.close();
			
		}
		//CATCH EXCEPTION IF EXCEPTION OCCURS
		catch (Exception e){
			System.out.println("ERROR: " + e.getMessage());
		}
		
	}
}
