public class Vowel {

	void check(char ch) {	
		
		int value = ch;
		
		if((value>=65 && value<=90) || (value >=97 && value <=122)) {
			
			if(ch=='A'|| ch=='E' || ch=='I' || ch=='O'|| ch=='U'|| ch =='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				System.out.println("Vowel");
			}
			else
			{
				System.out.println("Consonant");
			}
			
		}
		else
		{
			System.out.println("Error");
		}
	}
	
	
	public static void main(String[] args) {	
		
	Vowel k1 = new Vowel();
		
	k1.check('a');
	k1.check('C');
	k1.check('1');
		

	}

}