class	Sample6{
	void	area(){
	int	a=10;
	int	b=10;
	int	h=10;
	double	res=0.5*(a+b)*h;
	System.out.println(res);
	}
}
class	Demo6{
	public	static	void	main(String[]	args){
	Sample6	s6=new	Sample6();
	s6.area();
	}	
}