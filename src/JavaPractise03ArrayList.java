import java.util.ArrayList;

public class JavaPractise03ArrayList {

	public static void main(String[] args) {

		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("January");
		a.add("february");
		a.add("March");
		a.add("April");
		a.add("May");
		a.remove(2);
		//a.clear();
		
		for (String val : a)
		{
			System.out.println(val);
		}
		
		/*if (a.contains("March"))
		{
		System.out.println("March found");
		}
		else
		{
			System.out.println("March is missing");
		}
		*/
	}

}
