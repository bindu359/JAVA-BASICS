class	Reference1{
	double	area(){
		int	b=10;
		int	h=10;
		double	res=0.5*b*h;
		return	res;
	}
	public	static	void	main(String[]	args){
	Reference1	r1=	new	Reference1();
	double	x=r1.area();
	System.out.println(x);
	}
}