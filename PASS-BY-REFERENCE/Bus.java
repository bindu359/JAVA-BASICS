class	Bus{
	int	seats_avail=25;
	public	static	void	main(String[]	args){
	Bus	b=new	Bus();
	Abhibus.Seats(b);
	Redbus.Seats(b);
	Makemytrip.Seats(b);
	}	
}
class	Abhibus{
static	void	Seats(Bus	b1){
System.out.println("Abhibus	Seats	available	"+b1.seats_avail);
}
}
class	Redbus{
static	void	Seats(Bus	b2){
System.out.println("Redbus	Seats	available	"+b2.seats_avail);
}
}
class	Makemytrip{
static	void	Seats(Bus	b3){
System.out.println("Makemytrip	Seats	available	"+b3.seats_avail);
}
}