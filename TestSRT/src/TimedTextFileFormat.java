

import java.io.IOException;
import java.io.InputStream;


public interface TimedTextFileFormat {
	
	/**
	 * This methods receives the path to a file, parses it, and returns a TimedTextObject
	 * 
	 * @param path String that contains the path to the file
	 * @return TimedTextObject representing the parsed file
	 * @throws IOException when having trouble reading the file from the given path
	 */
	TimedTextObject parseFile(String fileName, InputStream is) throws IOException, FatalParsingException;
	
	/**
	 * This method transforms a given TimedTextObject into a formated subtitle file
	 * 
	 * @param tto the object to transform into a file
	 * @return NULL if the given TimedTextObject has not been built first,
	 * 		or String[] where each String is at least a line, if size is 2, then the file has at least two lines.
	 * 		or byte[] in case the file is a binary (as is the case of STL format) 
	 */
	Object toFile(TimedTextObject tto);
	

}
