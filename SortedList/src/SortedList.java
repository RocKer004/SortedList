import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList implements List_interface {

	List<Integer> list = new ArrayList<Integer>();
	StringBuilder sb = new StringBuilder();

	@Override
	public void add(int element) {
		list.add(element);
		
	}

	@Override
	public int size() {
	
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		if(list.isEmpty())
		return true;
		else
			return false;
	}

	@Override
	public boolean remove(int element) {
		
		if(list.contains(element)) {
			
			list.remove(list.indexOf(element));
			
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		Collections.sort(list);
		
	  for (int i = 0; i < list.size(); i++) {
		sb.append(list.get(i)+",");
	}
		
		return sb.toString();
	}
    
}
