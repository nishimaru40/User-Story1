import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;

public class FileLoaderController {
	private File file;
	private int counter;
	protected ArrayList<Student> stu;
	public FileLoaderController(File file) {
		try {
			loadFile(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.file = file;
		
	} 
	
	public void loadFile(File file) throws IOException{
		stu = new ArrayList<>();
		try {
			FileReader reader = new FileReader(file);
			BufferedReader r = new BufferedReader(reader);
			String line = r.readLine();
			
			while(line!=null){
				counter++;
				if(counter > 7){
					StringTokenizer t = new StringTokenizer(line,",");
					if(t.hasMoreTokens()){
						stu.add(new Student(Integer.parseInt(t.nextToken()),Long.parseLong(t.nextToken()),t.nextToken(),t.nextToken(),t.nextToken()));	
					}
					
					line = r.readLine();
				}else{
					line = r.readLine();
				}
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int size(){
		return stu.size();
	}
	public boolean isFile(){
		boolean bool = false;
		if(file.exists()){
			bool = true;
		}else{ bool = false;}
		return bool;
	}
	
	
}
