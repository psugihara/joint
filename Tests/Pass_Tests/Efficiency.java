import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;




public class Efficiency {

	  public static void main( String[] args ) throws IOException, InterruptedException
	    {
		  Runtime rt = Runtime.getRuntime();
		  // freeMemory returns the amount of free memory in the JVM
		  // get free memory
		  long beforeMemory = rt.freeMemory();
		  
		  // get time before running pass program
		  long before = System.currentTimeMillis();
		  
		  // run pass program in new process
		  Process p = Runtime.getRuntime().exec("java PassC ./Test_Files/input1.pass");
		  
		  // wait for this process to terminate
		  p.waitFor();
		  
		  // get time after running pass program/process
		  long after = System.currentTimeMillis();
		  
		  // print elapsed time
		  System.out.println("Elapsed time in ms = " + (after-before));

		  // print free memory available now
		  long afterMemory = rt.freeMemory();
		  
		  // print memory values
		  System.out.println("before memory = " + beforeMemory);
		  System.out.println("after memory = " + afterMemory);
		
		  // print difference
		  
		  System.out.println("memory cost = " + (beforeMemory - afterMemory));

	    }

}