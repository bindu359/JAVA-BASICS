class	Type4{
	double	area(){
	int	b=10;
	int	h=10;
	double	res=0.5*b*h;
	return	res;
	}
}
class	T4{
	public	static	void	main(String[]	args){
	Type4	t4=new	Type4();
	double	x=t4.area();
	System.out.println(x);
	}

}