package class17;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class FileExplorer
{

	public static void main(String[] args)
	{
		FileExplorer fileExplorer = new FileExplorer();
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入路径");
		String path = scanner.nextLine();
		fileExplorer.showSubFiels(path);
		//fileExplorer.showFile(path);
	}
	
	void showFile(String path)
	{
		try
		{
			Runtime.getRuntime().exec("attrib -h \"" + path + "\"");
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void hideFile(String path)
	{
		try
		{
			Runtime.getRuntime().exec("attrib +h \"" + path + "\"");
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void showSubFiels(String path)
	{
		File file = new File(path);

		if (file.exists())
		{
			if (file.isDirectory())
			{
				File[] subfiles = file.listFiles();
				if (subfiles != null)
					for (File subfile : subfiles)
					{
						Date date = new Date(subfile.lastModified());
						System.out.print(date);
						if (subfile.isDirectory())
						{
							System.out.println("\t<DIR>\t\t" + subfile.getAbsolutePath());
							showSubFiels(subfile.getAbsolutePath());

						} else
						{
							System.out.println("\t\t" + subfile.length() + "\t" + subfile.getName());
						}
						hideFile(subfile.getAbsolutePath());
					}
			} else
			{
				System.out.println(file);
			}
		} else
		{
			System.out.println("找不到文件");
		}
	}

}
