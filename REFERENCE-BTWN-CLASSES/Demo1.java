class	Sample1{
	void	area(){
	int	b=10;
	int	h=10;
	double	res=0.5*b*h;
	System.out.println(res);
	}
}
class	Demo1{
	public	static	void	main(String[]	args){
	Sample1	s1=new	Sample1();
	s1.area();
	}	
}