import static org.junit.Assert.*;
import org.junit.Test;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;



public class UploadTest {
	
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
	
//	@Test
//	public void checkingEmail(){
//		try {
//			BufferedReader read = new BufferedReader(new FileReader(f));
//			int id; String name,lastname,email;
//			String line = "";String line2 = "";
//			while((line = read.readLine()) != null) {
//				StringTokenizer st = new StringTokenizer(line, " ");
//				id = Integer.parseInt(st.nextToken());
//				name = st.nextToken();
//				lastname = st.nextToken();
//				email=st.nextToken();
//				try{
//					assertFalse("1 Student has 1 email",st.nextToken()!=null);
//				}
//				catch(Exception e){
//					assertTrue(true);
//				}
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//			assertTrue(true);
//		} catch (IOException e) {
//			e.printStackTrace();
//			assertTrue(true);
//		}
//	}
}
