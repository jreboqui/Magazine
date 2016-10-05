public class MagazineList
{
    public MagazineNode list;
	
	public MagazineList()
	{
	    list = null;
	}
	
	public void insert (Magazine mag)
	{
	
		MagazineNode node = new MagazineNode (mag);
		
		node.next = list;
		
		list = node;
		
		
	}
	public void delete (Magazine Mag)
	{
	
	    MagazineNode currentLink = list;
		MagazineNode previousLink = list;
		
		while (currentLink.magazine.title.equals(Mag.title) == false)
		{
		    if (currentLink.next == null)
			    currentLink = null;
			
			else {
			    previousLink = currentLink;
			    currentLink = currentLink.next;
				}
		}
		if (currentLink == list)
		    list = list.next;
		
		else
		{
		    previousLink.next = previousLink.next.next;
		}
	}
	
	
	
	public void deleteAll ()
	{
	    list = null;
	}
	
	public String toString()
	{
	    String result = "";
		MagazineNode current = list;
		
		if (list == null)
		    result = "Magazine Rack is empty!";
		
		else
		{
		while (current != null)
		{
		    result += current.magazine + "\n";
			current = current.next;
		}
		}
		return result;
	}
	
	private class MagazineNode
	{
	    public Magazine magazine;
		public MagazineNode next;
		public String title;
		public MagazineNode (Magazine mag)
		{
		    magazine = mag;
			title = mag.title;
			next = null;
		}
	}
	
}