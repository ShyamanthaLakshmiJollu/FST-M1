package activities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;

public class Activity14 {

	public static void main(String[] args) throws IOException {
		try {
			String wdir=System.getProperty("user.dir");
			File file=new File(wdir+"/newfile.txt");
			boolean fStatus = file.createNewFile();
            if(fStatus) {
                System.out.println("File created successfully!");
            } else {
                System.out.println("File already exists at this path.");
            }
            File fileUtil = FileUtils.getFile(wdir+"/newfile.txt");
            System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));
            
            //Create directory
            File destDir = new File(wdir+"/Samdir");
            //Copy file to directory
            FileUtils.copyFileToDirectory(file, destDir);
 
            //Get file from new directory
            File newFile = FileUtils.getFile(destDir, "newfile.txt");
            //Read data from file
            String newFileData = FileUtils.readFileToString(newFile, "UTF8");
            //Print it
            System.out.println("Data in new file: " + newFileData);
		}
		catch(IOException errMessage) {
            System.out.println(errMessage);
        }
		
		
	}

}
