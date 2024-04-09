import java.util.Scanner;
public class Lab5_3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		vovel v=new vovel();
		int count = 0;

		while(true)
		{
			
		System.out.println("Enter A Sentence :");
		String s = sc.nextLine();

			if(s.equals("quit"))
			{
				break;
			}
			else
			{
				v.count(s);
			}
		}
		v.display();
	}
}

class vovel{

	int a=0;
	int e=0;
	int i=0;
	int o=0;
	int u=0;

	void count(String s){
		for(int j=0; j<s.length(); j++)
		{

			char c = s.charAt(j);
			if(c=='a')
			{
				a++;
			}

			if(c=='e')
			{
				e++;
			}

			if(c=='i')
			{
				i++;
			}

			if(c=='o')
			{
				o++;
			}

			if(c=='u')
			{
				u++;
			}
		}
}
		void display()
		{
			System.out.println("a= " +a);
			System.out.println("e= " +e);
			System.out.println("i= " +i);
			System.out.println("o= " +o);
			System.out.println("u= " +u);

		}
}