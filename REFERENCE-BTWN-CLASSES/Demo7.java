class	Sample7{
	void	area(){
	final	double	pi=3.142;
	int	a=10;
	int	b=10;
	double	res=pi*a*b;
	System.out.println(res);
	}
}
class	Demo7{
	public	static	void	main(String[]	args){
	Sample7	s7=new	Sample7();
	s7.area();
	}	
}