class Reference4 
{
	int	area(){
		int b=10;
		int	h=10;
		int	res=b*h;
		return	res;
	}
	public static void main(String[] args) 
	{
		Reference4	r4=new	Reference4();
		int	x=r4.area();
		System.out.println(x);
	}
}
