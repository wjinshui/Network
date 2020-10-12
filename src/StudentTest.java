public class StudentTest
{

	public static void main(String[] args)
	{
		Student zhangsan = new Student();
		zhangsan.age = 18;
		zhangsan.name = "уехЩ";
		zhangsan.no = "0000001";		
		zhangsan.choiceCourse("Java");
		zhangsan.choiceCourse("Python");
		zhangsan.quitCourse("Java");
		zhangsan.dispInfo();
	}
	
	

}
