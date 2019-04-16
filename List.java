class list {
	list succ;
	Integer val;
	
	Integer first() {
		return val;
	}
	
	list rest() {
		return succ;
	}
	
	boolean isEmpty(){
		return val == null;
	}
	
	list append(Integer element) {
		if (isEmpty()) {
			val = element;
			return this;
		}
		else {
				list newList = new list();
				newList.val = element;
				newList.succ = this;
				return newList;
			}
	}
	
	list concat (list andereListe) {
		if (isEmpty())
			return andereListe;
		else if (andereListe.isEmpty())
			return this;
		else {
			list lauf = this;
				while (lauf.succ!=null) 
					lauf=lauf.succ;
				lauf.succ = andereListe;
				return this;
		}
	}
}

public class Main {

	public static void main(String[] args) {
		
		list l1 = new list();
		
		l1 = l1.append(2);
		l1= l1.append(3);
		
		for(int i=0; i< 10; i++)
			l1 = l1.append(i);
		
		list l2 = new list();
		
		for (int i=100; i>90; i--)
			l2 = l2.append(i);
		
		list lauf = l1.concat(l2);
		
		while (lauf!=null) {
			System.out.println(lauf.first());
			lauf = lauf.rest();
		}

	}

}
