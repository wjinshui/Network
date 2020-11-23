package class18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;



public class FISDemo
{

	public static void main(String[] args) 
	{
		
		String path = "src/class18/FISDemo.java";
		File file = new File(path);
		byte[] buff = new byte[(int) file.length()];
		FileInputStream fis;
		try
		{
			fis = new FileInputStream(file);
			fis.read(buff);
			String content = new String(buff);
			System.out.println(content);
			fis.close();
			System.out.println("Completed!!");
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void readFile()
	{
		try
		{
			String path = "E:\\Git\\Projects\\Java\\SQLParse\\src\\main\\resources\\DB.sqlite";
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			for (int i = 0; i < file.length(); i++)
			{
				System.out.printf("%d/%d\n", i, file.length());
				//System.out.print((char)fis.read() );
			}
			fis.close();			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**���û�����ɸ���
	 * @param ori ԭ�ļ���ַ
	 * @param dest Ŀ���ļ���ַ
	 */
	void copyByBuff(String ori, String dest)
	{
		File file = new File(ori);
		try
		{
			FileInputStream fis = new FileInputStream(file);
			byte[] buff = new byte[(int) file.length()];
			fis.read(buff);
			fis.close();
			FileOutputStream fos = new FileOutputStream(dest);
			fos.write(buff);
			fos.close();
			
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	/** ���ֽ�����ļ�����
	 * @param ori ԭ�ļ���ַ
	 * @param dest Ŀ���ļ���ַ
	 */
	 void copyByByte(String ori, String dest)
	{
		File file = new File(ori);
		try
		{
			FileInputStream fis = new FileInputStream(file);			
			FileOutputStream fos = new FileOutputStream(dest);
			int content;
			while( (content = fis.read()) != -1 )
			{
				fos.write(content);
			}
			
			fos.close();
			fis.close();
			
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
