class	Type5{
	double	area(){
	int	a=10;
	int	b=10;
	int	h=10;
	double	res=0.5*(a+b)*h;
	return	res;
	}
}
class	T5{
	public	static	void	main(String[]	args){
	Type5	t5=new	Type5();
	double	x=t5.area();
	System.out.println(x);
	}

}