import java.io.IOException;




public class Efficiency {

	  public static void main( String[] args ) throws IOException, InterruptedException
	    {
		  Runtime rt = Runtime.getRuntime();
	
		  
		
		  System.out.println("--------------");
		  System.out.println("Testing " + args[0]);
		  
		  // get time before running pass program
		  long before = System.currentTimeMillis();
		  // run pass program in new process
		  Process p = Runtime.getRuntime().exec("java PassC " + args[0]);
		  
		  // wait for this process to terminate
		  p.waitFor();
		  
		  // get time after running pass program/process
		  long after = System.currentTimeMillis();
		  
		  // get elapsed time
		  long elapsedTime = (after-before);
		  
		  // print elapsed time
		  System.out.println("Elapsed time in ms = " + elapsedTime);
		  if(elapsedTime > 2000)
			  System.out.println("FAILED! FAILED! FAILED!. OVER 2 SEC RUNTIME");
		  else
			  System.out.println("PASSED.");
		 
		  System.out.println();

	    }

}