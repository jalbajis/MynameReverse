
public class ReverseString {

	public static void main(String[] args) {
		String s="Sakhare";
		String rev="";
		int len= s.length();
		for(int i=0; i<=len-1; i++)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
	}

}
