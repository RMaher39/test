package data;

import java.nio.charset.Charset;
import java.util.*;

public class NameGenerator {
	
	public static String generatedString;
	
	public void  givenUsingPlainJava_whenGeneratingRandomStringUnbounded_thenCorrect() {
	    byte[] array = new byte[7]; // length is bounded by 7
	    new Random().nextBytes(array);
	     generatedString = new String(array, Charset.forName("UTF-8"));

	    System.out.println(generatedString);

}
}