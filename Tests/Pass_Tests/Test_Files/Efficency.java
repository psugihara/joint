import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;




public class Efficiency {

	  public static void main( String[] args ) throws IOException
	    {
		  Runtime rt = Runtime.getRuntime();
		  long beforeMemory = rt.freeMemory();
		  
		  // get time before running pass program
		  long before = System.currentTimeMillis();
		  Process p = Runtime.getRuntime().exec("java PassC ./Test_Files/input1.pass");
		  BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
 System.out.println("Here is the standard output of the command:");
				  BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

				  // read the output from the command
				  String s;
				  System.out.println("Here is the standard output of the command:");
				  while ((s = stdInput.readLine()) != null) {
				  System.out.println(s);
				  }

				  // read any errors from the attempted command
				
				  System.out.println("Here is the standard error of the command (if any):\n");
				  while ((s = stdError.readLine()) != null) {
				  System.out.println(s);
		  // get time after running pass program
		  long after = System.currentTimeMillis();
		  System.out.println("Elapsed time in ms = " + (after-before));
		  
		  long afterMemory = rt.freeMemory();
		  
		  System.out.println("before memory = " + beforeMemory);
		  System.out.println("after memory = " + afterMemory);

	    }
	

}
}