import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Error {

	  public static void main( String[] args ) throws IOException, InterruptedException
	    {
		  Runtime rt = Runtime.getRuntime();
	
		  
		
		  System.out.println("--------------");
		  System.out.println("Testing " + args[0]);
		  // run pass program in new process
		  Process p = Runtime.getRuntime().exec("java PassC " + args[0]);
		  BufferedReader stdInput = new BufferedReader(new
		  InputStreamReader(p.getInputStream()));

		  BufferedReader stdError = new BufferedReader(new
		  InputStreamReader(p.getErrorStream()));

		  // read the output from the command
		  String s;
 		  System.out.println("Standard output of the program:\n");
		  while ((s = stdInput.readLine()) != null) {
		  System.out.println(s);
		  }

		  // read any errors from the attempted command

		  System.out.println("Standard error of the program (if any):\n");
 		  while ((s = stdError.readLine()) != null) 
 			  System.out.println(s);
		  // wait for this process to terminate
		
		 
		  System.out.println();

	    }

}
