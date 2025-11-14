class	Sample5{
	void	area(){
	int	r=10;
	final	double	pi=3.142;
	double	res=pi*r*r;
	System.out.println(res);
	}
}
class	Demo5{
	public	static	void	main(String[]	args){
	Sample5	s5=new	Sample5();
	s5.area();
	}	
}