class  College3
{
		String course_name;
		String univer_name;
		int exam_cost;
		College3(String	course_name,String	univer_name,int	exam_cost){
		this.course_name=course_name;
		this.univer_name=univer_name;
		this.exam_cost=exam_cost;
		}
	public static void main(String[] args) 
	{		
		College3	c3=new	College3("Java","VTU",2000);
		System.out.println(c3.course_name);
		System.out.println(c3.univer_name);
		System.out.println(c3.exam_cost);
	}
}
