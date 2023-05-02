package sample05;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutputter implements Outputter {
	private String filePath, fileName;
	
	public FileOutputter() {
		System.out.println("FileOutputter 기본생성자 확인용");
	}

	public void setFilePath(String filePath) {
		System.out.println("setFilePath(String filePath)");
		this.filePath = filePath;
	}

	public void setFileName(String fileName) {
		System.out.println("setFileName(String fileName)");
		this.fileName = fileName;
	}

	@Override
	public void output(String message) {
		System.out.println("output(String message)");
		
		try {
			FileWriter fileWriter =new FileWriter(new File(filePath, fileName));
			fileWriter.write(message);
			fileWriter.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

//IO Stream
/*
1. byte 단위 InputStream OutputStream

2.문자(2byte)단위 Reader
 */

