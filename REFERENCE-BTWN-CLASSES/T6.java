class	Type6{
	double	area(){
	final	double	pi=3.142;
	int	r=10;
	double	res=pi*r*r;
	return	res;
	}
}
class	T6{
	public	static	void	main(String[]	args){
	Type6	t6=new	Type6();
	double	x=t6.area();
	System.out.println(x);
	}

}