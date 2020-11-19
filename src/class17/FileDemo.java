package class17;

import java.io.File;

public class FileDemo
{

	public static void main(String[] args)
	{
		File file = new File("src/class17/FileDemo.java");
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.length());
		File dir = new File("c:/");
		System.out.println(dir.getAbsolutePath());
		String[] subFiles = dir.list();
		System.out.println("*************************************");
		for (String subfile : subFiles)
		{
			System.out.println(subfile);
		}
		

	}

}
