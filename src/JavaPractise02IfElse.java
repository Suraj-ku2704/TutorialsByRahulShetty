
public class JavaPractise02IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr01 = {1,2,3,4,5,6};
		
		for (int i=0; i<arr01.length;i++)
		{
			if (arr01[i] % 2 == 1)
			{
				System.out.println(arr01[i] + " is odd");
				//break;
			}
			else
			{
				System.out.println(arr01[i] + " is even");
			}
		}
	}

}
