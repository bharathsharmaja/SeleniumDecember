package collections;

import java.util.HashMap;
import java.util.Map;

public class CountOfEachChar {

	public static void main(String[] args) {
//Each Character Count
		String txt ="aabbcc";
		char[] ch = txt.toCharArray();		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : ch) {			
			if(map.containsKey(c)){				
				Integer count = map.get(c)+1;
				map.put(c, count);				
			}else{
				map.put(c, 1);
			}			
		}		
		System.out.println(map);



		/*
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('c', 1);
		map.put('n', 1);
		map.put('c', 2);
		System.out.println(map);
		for (Entry<Character, Integer> ch : map.entrySet()) {
			System.out.println(ch.getKey()+"-->"+ch.getValue());
		}
		System.out.println(map.containsKey('c'));
		System.out.println(map.containsValue(2));*/
	}

}










