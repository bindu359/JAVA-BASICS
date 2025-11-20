class	Library{
int	book_qty=2000;
public	static	void	main(String[]	args){
Library	l1=new	Library();
Staff.Book(l1);
Student.Book(l1);
}
}
class	Staff{
static	void	Book(Library	l2){
System.out.println("Books	available	for	Staff	"+l2.book_qty);
}
}
class	Student{
static	void	Book(Library	l3){
System.out.println("Books	available	for	Students	"+l3.book_qty);
}
}