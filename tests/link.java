package tests;

public class link {

	String book;
	int sold;
	
	link next;
	link firstlink=null;
	public link(String book, int sold)
	{
		this.book=book;
		this.sold=sold;
	}
	
	public void display()
	{
		System.out.println(book+" "+sold);
	
	}
	
	public String toString(){
		return book;
	}
	
	
	
	public static void main(String[] args) throws Exception
	{
		linkedlist l=new linkedlist();
	    l.insertLink("hello",1);
		l.insertLink("hey",2);
		l.insertLink("howdy", 3);
		l.insertLink("lol", 3);
		l.insertLink("lil", 3);
		l.display();
		link mid=l.getmid(l.firstlink);
		l.reverse(mid);
		//l.reverse(l.firstlink);
		//System.out.println(l.recRev(l.firstlink).toString());
		//System.out.println(l.firstlink.book);
		l.display();
		//l.removefirstlink();
		//l.display();
		//l.display();
		
	}

}
