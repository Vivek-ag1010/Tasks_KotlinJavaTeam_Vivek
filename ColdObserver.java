package observableObserver;
import java.util.*;
import io.reactivex.rxjava3.core.Observable;
public class ColdObserver {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(16);
		list.add(17);
		list.add(18);
		
		Observable<Integer> source=Observable.fromIterable(list);
		source.subscribe(System.out::println);

		System.out.println();
		list=getData(list);
		source.subscribe(System.out::println);
	}
	private static List<Integer> getData(List<Integer> list)
	{
		list.add(19);
		return list;
	}
}
