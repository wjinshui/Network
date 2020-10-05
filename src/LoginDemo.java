import java.util.Scanner;

public class LoginDemo
{

	public static void main(String[] args)
	{
		String name,pwd;
		System.out.println("请输入用户名");
		Scanner scanner = new Scanner(System.in);
		name = scanner.nextLine();
		System.out.println("请输入密码");
		pwd = scanner.nextLine();
		if(name.equals("Java") && pwd.equals("201406"))
			System.out.println("Success");
		else {
			System.out.println("Fail");
		}		

	}

}
