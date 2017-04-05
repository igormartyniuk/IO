
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class Main {
	public static void main(String[] args) throws IOException {

		File file = new File("C:\\dev\\Core_lesson_14\\test.txt");
		
//		file.mkdirs();
		
//		file.createNewFile();
	
//		System.out.println(file.getAbsolutePath());
		
		FileOutputStream fileOutputStream = new FileOutputStream(file, true);
		
//		for (int i = 0; i < 1000; i++) {
//			fileOutputStream.write(i);
//		}
		
//		fileOutputStream.write("some text\n".getBytes());
		
//		fileOutputStream.close();
//		
//		FileInputStream fileInputStream = new FileInputStream(file);
//		
//		int tmp;
//		
//		while((tmp = fileInputStream.read()) != -1){
//			
//			System.out.print(Character.toChars(tmp));
//		}
		
//		File from = new File("from.txt");
//		
//		File to = new File("to.txt");
//		
//		from.createNewFile();
//		to.createNewFile();
//		
//		FileOutputStream fileOutputStream = new FileOutputStream(to);
//		FileInputStream fileInputStream = new FileInputStream(from);
//		
//		int tmp;
//		
//		while((tmp = fileInputStream.read()) != -1){
//			fileOutputStream.write(tmp);
//		}
//		
//		fileInputStream.close();
//		fileOutputStream.close();
//		
//		FileWriter fileWriter = new FileWriter(file);
//		
//		fileWriter.write("some1");
//		
//		fileWriter.flush();
//		
//		fileWriter.close();
//		
//		
//		FileReader fileReader = new FileReader(file);
//		
//		BufferedReader bufferedReader = new BufferedReader(fileReader);
//		
//		System.out.println(bufferedReader.readLine());
//		 
//		String tmp;
//		
//		while((tmp = bufferedReader.readLine()) != null){
//			System.out.println(tmp);
//		}
		
		String url = "https://habrastorage.org/getpro/habr/post_images/e4b/067/b17/e4b067b17a3e414083f7420351db272b.jpg";
		
		String fileName = "picture.png";
		
		BufferedImage img = ImageIO.read(new URL(url)); 
		
		File pic = new File(fileName);
		
		pic.createNewFile();
		
		ImageIO.write(img, "png", pic);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}
}