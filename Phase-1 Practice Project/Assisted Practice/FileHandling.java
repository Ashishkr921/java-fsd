import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileHandling 
{
	public static void main(String[] args)
	{
		// create a file
		
		  	try {	
			File file=new File("D:\\javafsd\\javaproject\\FileHandling\\File1.txt");
			if(file.createNewFile()) {
				System.out.println("file is created");
			}else {
				if(file.exists())
				{
				System.out.println("file already exists");
				System.out.println("file path"+file.getAbsolutePath());
				System.out.println("file length"+file.length());
				System.out.println("file name"+file.getName());
				System.out.println("file class"+file.getClass());
				System.out.println("file parent"+file.getParent());
				System.out.println("file space"+file.getUsableSpace());
			}
			else {
				System.out.println("file doesnt exists");
			}
				Boolean b= file.delete();
				  if(b==true)
	              {
	              	System.out.println("File deleted !!");
	              }
	              else
	              {
	              	System.out.println("File not deleted");
	              }
			}
			}
			
			catch(Exception e){
			e.printStackTrace();
			}
			
	        // Write a file
			String data="i am writing the data inside the file";
			try {
				FileWriter output= new FileWriter("D:\\\\javafsd\\\\javaproject\\\\FileHandling\\\\File1.txt");
				output.write(data);
				System.out.println("Data is written inside the file");
				output.close();
			}
			catch(Exception e) {
				e.getStackTrace();
			}
			 
		
			// Read a file
             
			
		File myFile = new File("D:\\\\javafsd\\\\javaproject\\\\FileHandling\\\\File1.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
            }
         catch (FileNotFoundException e) {
            e.printStackTrace();
			   }
			
	               
			    
			   
			// Delete a file
		 File myFile1 = new File("D:\\\\\\\\javafsd\\\\\\\\javaproject\\\\\\\\FileHandling\\\\\\\\File1.txt");
	        if(myFile1.delete()){
	            System.out.println("I have deleted: " + myFile1.getName());
	        }
	        else{
	            System.out.println("Some problem occurred while deleting the file");
	        }
		        
	}
	
}