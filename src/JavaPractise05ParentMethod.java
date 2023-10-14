
public class JavaPractise05ParentMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaPractise06ChildMethod child = new JavaPractise06ChildMethod();
		child.getdata();
		JavaPractise05ParentMethod parentmethod = new JavaPractise05ParentMethod();
		parentmethod.innermethod();
		staticmethod();

	}
	
	public void innermethod()
	
	{
	System.out.println("I come from innermethod");
	}
	
	public static void staticmethod()
	
	{
	System.out.println("I come from staticmethod");
	}
	
	

}
