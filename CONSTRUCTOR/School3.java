class School3 
{
		int	school_strength;
		String	school_name;
		String	school_grade;
		School3(int	a,String	b,String	c){
		school_strength=a;
		school_name=b;
		school_grade=c;
		}
	public static void main(String[] args) 
	{
		School3	s3=new	School3(2000,"S.V.S","A");
		System.out.println(s3.school_strength);
		System.out.println(s3.school_name);
		System.out.println(s3.school_grade);
	}
}

	