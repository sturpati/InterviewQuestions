package Other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SingleKeyMultipleValues {

	public static void main (String [] args){
		String input = "Srujana:Dolly,Sujju ; Sravanthi:Sweety,Sravs ;Srujana:Tweety";
		String [] inputSplits = input.split(";");
		Map<String, List<String>> map = new HashMap<String, List<String>>();

		for (String inputSplit : inputSplits){

			String[] seperatedInput = inputSplit.split(":");

			String[] nameList = seperatedInput[1].split(",");
			List<String> values = new ArrayList<String>();	
			for (String name : nameList){
				values.add(name);
			}
			if(map.containsKey(seperatedInput[0])){
				List<String> previousValue = map.get(seperatedInput[0]);
				values.addAll(previousValue);
				map.put(seperatedInput[0], values);
				
			}else {
			    map.put(seperatedInput[0], values);
			}

		}
		for(Entry<String, List<String>>  entry : map.entrySet()){
			System.out.println("key "+entry.getKey()+" value "+ entry.getValue());
		}

	}
	
	public static void anotherMain(String[] args) {
		String input = "Srujana:Dolly,Sujju ; Sravanthi:Sweety,Sravs ;Srujana:Tweety";
		String [] inputSplits = input.split(";");
		Map<String, List<String>> map = new HashMap<String, List<String>>();

		for (String inputSplit : inputSplits){

			String[] seperatedInput = inputSplit.split(":");

			List<String> nameList = Arrays.asList(seperatedInput[1].split(","));
			
			if(map.containsKey(seperatedInput[0])){
				map.get(seperatedInput[0]).addAll(nameList);
			}else {
			    map.put(seperatedInput[0], nameList);
			}

		}
		for(Entry<String, List<String>>  entry : map.entrySet()){
			System.out.println("key "+entry.getKey()+" value "+ entry.getValue());
		}

	}
	
	public static void adf() {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		
		List<String> list = new ArrayList<String>();
		map.put("Srujana", list);
		list.add("Dolly");
	}
}
