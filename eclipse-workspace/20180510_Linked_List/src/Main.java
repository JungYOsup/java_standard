
public class Main {
	
	public static void main(String[] args) {
		
		Linked_List list = new Linked_List();
		
		System.out.println(list.toString());
		
		
		//Arraylist vs LinkedList
		
		//Arraylist 
		//1.ArrayList는 새로운 데이터를 추가할때 기존의 데이터의 이동이 필요하다
		//따라서 100만건의 데이터가 있을대 100만건의 데이터를 다 이동시켜야한다는 문제가있다.
		//2.특정 위치의 데이터를 가져올떄
		//위치를 알고 있기때문에 그 위치로 접근만 해주면된다.(즉 어느위치로 접근하든 동일한 속도를 보장받음(빠름))
			
		//LinkedList
		//1.LinkedList는 새로운 데이터를 추가할때 기존데이터와 연결만 해주면됨
		//2.특정 위치의 데이터를 가져올떄
		//서로 연결되어있는데, 3번째를 알려면 2번째의  next를 알아야한다.
		//즉 2번째의 next를 알려면 1번쨰의 next를 알아야한다. 즉 100만번재 데이터를 알고싶으면
		//첫번째에서 2번째로 2번째에서 3번째로 계속 next로 이동해가면서 100번째로 이동해서 데이터를 가져와야한다.
		
		//그러나 우리가 만든 LinkedList가 아닌 Collector에서 제공하는 LinkedList는 단방향이 아닌 양방향이기 떄문에
		//위에서의 문제를 해결하여 100번째를 가져오러면 99번째의 데이터를 가져오게끔 가능하게 해줌
		
		//ArrayList.ListIterator vs LinkedList.ListIterator
		
		//ArrayList.ListIterator
		//1.중간에 데이터를 추가할시 
		//마찬가지로 추가할 데이터의 위치 뒤에있는 데이터를 한칸씩 이동시킨다음에
		//새로운 데이터를 추가해줘야한다.
		
		//2.데이터의 양
		//데이터 양이 정해져있다.(ex new Object[100])
		//데이터를 100개보다 더 추가할경우 안된다(오류가 뜸).
		//그러나 ArrayList에서는 이런점을 방지하고자 데이터를 초과할때 정확하게 2배이상의
		//데이터를 넣을수 있게 확장을 시킴, 그리고 기존에 데이터는 확장된곳에 copy
		
		
		//LinkedList.ListIterator
		//1.중간에 데이터를 추가할시 
		//이전노드가 새로운노드를 가리키고 새로운노드가 앞노드를 가리키면 된다.
		//즉 중간에 데이터를 추가할시 ArraylIst보다 훨씬 빠르게 처리함
		
		//2.데이터의 양
		//메모리의 양을 넘지 않은이상 무한한 데이터의 양을 추가할수 있다.
		
	}

}
