class  Employee3
{
		int emp_id;
		int emp_sal;
		String emp_grade;
		Employee3(int	emp_id,int	emp_sal,String	emp_grade){
		this.emp_id=emp_id;
		this.emp_sal=emp_sal;
		this.emp_grade=emp_grade;
		}
	public static void main(String[] args) 
	{		
	Employee3	e3=new	Employee3(25,35000,"A");
		System.out.println(e3.emp_id);
		System.out.println(e3.emp_sal);
		System.out.println(e3.emp_grade);
	}
}
