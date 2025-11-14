class Reference3 
{
	int	area(){
		int a=10;
		int	res=a*a;
		return	res;
	}
	public static void main(String[] args) 
	{
		Reference3	r3=new	Reference3();
		int	x=r3.area();
		System.out.println(x);
	}
}
