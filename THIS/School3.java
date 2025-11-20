class School3 
{
		int	school_strength;
		String	school_name;
		String	school_grade;
		School3(int	school_strength,String	school_name,String	school_grade){
		this.school_strength=school_strength;
		this.school_name=school_name;
		this.school_grade=school_grade;
		}
	public static void main(String[] args) 
	{
		School3	s3=new	School3(2000,"S.V.S","A");
		System.out.println(s3.school_strength);
		System.out.println(s3.school_name);
		System.out.println(s3.school_grade);
	}
}

	