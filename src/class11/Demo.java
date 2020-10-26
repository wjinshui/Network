package class11;

class ParentClass {  //定义父类
    public ParentClass(int i) {  //构造方法
        System.out.println("这是父类的构造方法。");
    }
    

}
class ChildClass extends ParentClass {  //继承父类
    public ChildClass() {  //构造方法    	
    	super(1);
        System.out.println("这是子类的构造方法。");
    }
}
public class Demo {
    public static void main(String[] args) {
        ChildClass cc = new ChildClass(); 
    }
}
