import java.util.Scanner;
public class Grade{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		
		int totalmarks;
                float averagemarks;
		System.out.print("enter the marks optain in subject1:");
		int subject1=scanner.nextInt();
		System.out.print("enter the marks optain in subject2:");
		 int subject2=scanner.nextInt();
		System.out.print("enter the marks optain in subject3:");
		int subject3=scanner.nextInt();
		System.out.print("enter the marks optain in subject4:");
		int subject4=scanner.nextInt();
		System.out.print("enter the marks optain in subject5:");
		int subject5=scanner.nextInt();
		System.out.print("enter the marks optain in subject6:");
		int subject6=scanner.nextInt();
		
		totalmarks=subject1+subject2+subject3+subject4+subject5+subject6;
		System.out.println("total marks optained :"+totalmarks);

		averagemarks=(totalmarks)/6;
		System.out.println("average Marks of All Subjects:"+averagemarks);
		if(subject1>=40 && subject2>=40 &&subject3>=40 &&subject4>=40 &&subject5>=40 &&subject6>=40 && averagemarks>=90)
		{
			System.out.println("Grade=A+");
		}
		else if(subject1>=40 && subject2>=40 &&subject3>=40 &&subject4>=40 &&subject5>=40 &&subject6>=40 && averagemarks<90&&averagemarks>=80)
		{
			System.out.println("Grade=A");
		}
		else if(subject1>=40 && subject2>=40 &&subject3>=40 &&subject4>=40 &&subject5>=40 &&subject6>=40 && averagemarks<80&&averagemarks>=70)
		{
			System.out.println("Grade=B+");
		}
		else if(subject1>=40 && subject2>=40 &&subject3>=40 &&subject4>=40 &&subject5>=40 &&subject6>=40 && averagemarks<70&&averagemarks>=60)
		{
			System.out.println("Grade=B");
		}
		else if(subject1>=40 && subject2>=40 &&subject3>=40 &&subject4>=40 &&subject5>=40 &&subject6>=40 && averagemarks<60&&averagemarks>=50)
		{
			System.out.println("Grade=c");
		}
		else if(subject1>=40 && subject2>=40 &&subject3>=40 &&subject4>=40 &&subject5>=40 &&subject6>=40 && averagemarks<50&&averagemarks>=40)
		{
			System.out.println("Grade=D");
		}
		else
		{
			System.out.println("Fail");
			if(subject1<40)
			{
                             
				System.out.println("Fail in subject1 because the obtain marks in subject 1 is"+subject1);
			}
			 if(subject2<40)
			{
                             
				System.out.println("Fail in subject2 because the obtain marks in subject 2 is"+subject2);
			}
			 if(subject3<40)
			{
                             
				System.out.println("Fail in subject3 because the obtain marks in subject 3 is"+subject3);
			}	
			 if(subject4<40)
			{
                             
				System.out.println("Fail in subject4 because the obtain marks in subject 4 is"+subject4);
			}
			 if(subject5<40)
			{
                             
				System.out.println("Fail in subject5 because the obtain marks in subject 5 is"+subject5);
			}
			if(subject6<40)
			{
				System.out.println("Fail in subject6 because the obtain marks in subject 6 is"+subject6);
			}
		}

	}
}