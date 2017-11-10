import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentCollectors extends FileLoaderController{
	private File file;
	private int counter;
	private FileLoaderController loader;
	
	public StudentCollectors(File file) throws IOException{
		super(file);	
	}
	
	public ArrayList<Student> getStudents(){
		return stu;
	}
	public void printStudentList(){
		for(int i = 0 ; i < stu.size();i++){
			System.out.println(stu.get(i).toString());
		}
	}
	
}
