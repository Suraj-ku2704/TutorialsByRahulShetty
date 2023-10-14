
public class JavaPractise04StringMethods {

	public static void main(String[] args) {
		
		//String Literal
		String[] s = {"Java learning tutorial"};
		 
		//String Method
		//String p1 = new String("Welcome");
		//String p2 = new String("Welcome");
		
		
		String p3 = new String("Java is robust language");
		String[] splitted1 = p3.split(" ");
		
		for (String val : splitted1)
		{
			System.out.println(val.trim());
		}
		
		
		String p = "Java is simple";
		
		for (int i= 0; i < p.length();i++)
		{
			System.out.println(p.charAt(i));
		}

		System.out.println("*****************");
		
		String q = "Java is fun";
		
		for (int i= q.length()-1; i>= 0 ;i--)
		{
			System.out.println(q.charAt(i));
		}
	}

}
