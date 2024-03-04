import java.util.Scanner;
class Student_Grade
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Marks of the :");
		int m1 = input.nextInt();
		int m2 = input.nextInt();
		int m3 = input.nextInt();
		int m4 = input.nextInt();
		int m5 = input.nextInt();
		int tot = m1+m2+m3+m4+m5;
		float per = tot/5;
		System.out.println("Total Marks out of 500:"+tot);
		System.out.println("Percentage:"+per);	
		if(per>=90)
			System.out.println("Grade A: Excellent!");
		else if(per>=80)
			System.out.println("Grade B: Very Good!");
		else if(per>=70)
			System.out.println("Grade C: Good!");
		else if(per>=60)
			System.out.println("Grade D: Average!");
		else if(per>=40)
			System.out.println("Grade E: Poor Performance!");
		else
			System.out.println("Grade F: Fail!");
	}
}