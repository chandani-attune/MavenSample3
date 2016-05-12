
public class Student 
{
	public int countAvg(int m1,int m2,int m3 )
	{
		return((m1+m2+m3)/3);
	}
	
	public String getGrades(double avgMarks)
	{
		if(avgMarks>=90)
			return "A";
		else if(avgMarks>=70 & avgMarks<90)
			return "B";
		else
			return "C";
	}

	public void newMethods3()
	{
		System.out.println("Simple method  3");
		
	}

}
