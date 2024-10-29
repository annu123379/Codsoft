 import java.util.Scanner;

public class StudentGradeCalculator 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Hello,Enter the number of Subjects: ");
		int numSubjects = scanner.nextInt();
		
		int[] marks = new int[numSubjects];
		int totalMarks = 0;
		
		for(int i=0; i< numSubjects; i++)
		{
			System.out.print("Enter marks obtained in each Subjects " + (i+1) + ":");
			marks[i] = scanner.nextInt();
			totalMarks += marks[i];
			
		}
		double averagePercentage =(double) totalMarks / (numSubjects*100) *100;
		
		System.out.println("Your result is here :");
		System.out.println("Your Total Marks: "+ totalMarks);
		System.out.println("Average Percentage: "+ averagePercentage + "%");
		
		String grade = calculateGrade(averagePercentage);
		System.out.println("Grade: " +grade);
		
		scanner.close();
		
	}
	public static String calculateGrade(double percentage)
	{
		if (percentage >= 95)
		{
			return "A+";
		}
		else if(percentage >= 85)
		{
			return "A";
		}
		else if(percentage >= 75)
		{
			return "B";
		}
		else if(percentage >= 65)
		{
			return "C";
		}
		else if(percentage >= 55)
		{
			return "D";
		}
		else
		{
			return "F";
		}
		
	}
	

    
}

    

