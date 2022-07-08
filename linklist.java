package linked_list;
public class Linked_lst_implement {
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
		}
	}
  public void insert_at_end(int v)
  {
	  Node new_node = new Node(v);
	  new_node.next = null;
	  
	  if(head==null)
	  {
		  head=new_node;
	  }
	  else
	  {
		Node n=head;
		  while(n!=null)
		  {
			  if(n.next==null)
			  {
				  break;
			  }
			  n=n.next;
		  }
		  n.next = new_node;
	  }
	  
  }
  public void insert_at_beg(int v)
  {
	  Node new_node = new Node(v);
	  new_node.next = head;
	  head = new_node;
  }
  public void insert_after_key(int v,int k)
  {
	   
	  Node n= head;
	  while(n.data!= k)
	  {
		  n= n.next;
	  }
	  Node new_node = new Node(v);
	  new_node.next =  n.next;
	  n.next = new_node;
  }
  public void list_traverse()
  {
	  Node n = head;
	  while(n!=null)
	  {
		  System.out.print(n.data +" ");
		  n= n.next;
	  }
	  System.out.println();
  }
  public void delete_Node(int key)
  {
	  Node temp = head , prev = null ;
	  if(temp!=null && temp.data == key)
	  {
		  head = temp.next;
		  return;
	  }
	  while(temp!= null && temp.data!=key)
	  {
		  prev= temp;
		  temp= temp.next;
	  }
	  if(temp==null)return;
	  prev.next= temp.next;
	  
  }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linked_lst_implement obj = new Linked_lst_implement();
		obj.insert_at_end(5);
		obj.insert_at_end(25);
		obj.insert_at_end(4);
		obj.insert_at_end(6);
		obj.insert_at_beg(14);
		obj.insert_at_beg(11);
		obj.insert_after_key(9, 5);
		obj.list_traverse();
		
		obj.delete_Node(4);
		obj.list_traverse();
	}

}
