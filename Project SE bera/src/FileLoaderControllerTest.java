import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class FileLoaderControllerTest {
	@Test
	public void checkingReadFile() {
		FileLoaderController f = new FileLoaderController(new File("classlist-cs284-160.csv"));
			assertTrue("No files",f.isFile());
		
		
	}
	
	@Test
	public void checkSize(){
		FileLoaderController f = new FileLoaderController(new File("classlist-cs284-160.csv"));
		assertTrue("Student size is 0 that mean you are not added any student from your file",f.size()>0);
	}

}
