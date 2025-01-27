package stream.foreach;

import java.util.List;
import java.util.ArrayList;

public class ForIterExampleMain {

	public static void main(String[] args) {
		List<Integer> integerList = new ArrayList<>();
		
		integerList.add(10);
		integerList.add(20);
		integerList.add(30);
		integerList.add(40);
		integerList.add(50);
		integerList.add(60);
		integerList.add(70);
		
		//integerList에서 40을 탐색하고, 참으면 즉시 종료시키는 반복문
		for(int i =0; i< integerList.size(); i++) {
			System.out.println(integerList.get(i));
			if(integerList.get(i) == 40) {
				System.out.println("40찾았다");
				break;
			}
		}

	}

}
