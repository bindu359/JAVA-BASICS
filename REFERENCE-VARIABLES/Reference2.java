class Reference2 
{
	int	area(){
		int w=10;
		int	h=10;
		int	res=w*h;
		return	res;
	}
	public static void main(String[] args) 
	{
		Reference2	r2=new	Reference2();
		int	x=r2.area();
		System.out.println(x);
	}
}
