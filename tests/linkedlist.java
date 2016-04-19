package tests;

public class linkedlist {

		
		link firstlink;
		link middle;
		linkedlist(){
			firstlink=null;
		}
		
		public void insertLink(String book,int sold){
			link newlink=new link(book,sold);
			
			newlink.next=firstlink;
			
			firstlink=newlink;
			
		}
		
		public link removefirstlink(){
			link linkref=firstlink;
			if(firstlink!=null)
			{
				firstlink=linkref.next;
			}
			return linkref;
		}
		
		public void display()
		{
			link thelink=firstlink;
			
			while(thelink!=null){
				System.out.println(thelink.book);
				thelink=thelink.next;
			}
			
		}
		
		public void remove(String book){
			link remlink=firstlink;
			link curr=firstlink;
			link prev=firstlink;
			while(remlink!=null){
				if(remlink.book==book){
					
				}
				remlink=remlink.next;
			}
		}
		
		public void reverse(link firstl){
			link nxt=null;
			link result=null;
			link current = firstl;
			link temp=firstlink;
			while(temp.next!=firstl){
				temp=temp.next;
			}
			
			//System.out.println(chk.book+"----");

			while(current!=null){
				nxt=current.next;
				current.next=result;
				result=current;
				current=nxt;
				
			}	
			
			temp.next=result;
			
			
		}
		
		public link getmid(link firstl){
			link current=firstl;
			//link current = firstlink;
		      int length = 0;
		     middle = firstl;
		    
		      while(current.next != null){
		    	  //middle=current;
		          length++;
		          if(length%2 ==0){
		              middle = middle.next;
		          }
		          current = current.next;
		      }
		    
		      if(length%2 == 1){
		          middle = middle.next;
		      }
		      
		      return middle;
			
		}
		
		
		public link recRev(link firstl){
			
			if(firstl==null||firstl.next==null)
				return firstl;
			link remrev=recRev(firstl.next);
			link cur=remrev;
			while(cur.next!=null){
				cur=cur.next;
				}
			cur.next=firstl;
			firstl.next=null;
			firstlink=remrev;
			return firstlink;
		}

	}


