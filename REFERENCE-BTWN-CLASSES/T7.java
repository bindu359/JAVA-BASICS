class	Type7{
	double	area(){
	final	double	pi=3.142;
	int	a=10;
	int	b=10;
	double	res=pi*a*b;
	return	res;
	}
}
class	T7{
	public	static	void	main(String[]	args){
	Type7	t7=new	Type7();
	double	x=t7.area();
	System.out.println(x);
	}

}