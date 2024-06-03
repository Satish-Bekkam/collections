package List;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileinputStream {
	public static void main(String args[]) throws IOException{
		
	
	File f = new File("./sample.txt");
	if(!f.exists()) {
		System.out.println(f.createNewFile());
	}
	FileInputStream fis= new FileInputStream(f);

}
}