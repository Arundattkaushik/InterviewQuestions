package listProblems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CreateArrayList {

	public static void main(String[] args) {
		CreateArrayList cal = new CreateArrayList();
		List colors = createList();
		cal.iterateList(colors);
		System.out.println("I have added this comment");

	}
	
	public static List createList() {
		ArrayList<String> ls = new ArrayList<String>();
		ls.add("Red");
		ls.add("White");
		ls.add("Green");
		ls.add("Black");
		ls.add("Blue");
		ls.add("Grey");
		ls.add("Purple");
		return ls;
	}
	
	
	public void iterateList(List list) {
		for (int i=0; i<list.size(); i++) {
			
			System.out.print(" "+list.get(i));
		}
	}

}
