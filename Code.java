package misc;


import java.util.ArrayList;
import java.util.List;



public class main_misc2 {
	
	
		
		
	
	
	public static void main(String[] args) {
	//(a+b)%k = ((a % k)+(b % k)) % k    || ||
	
	List<Integer> set = new ArrayList<>();
	set.add(1);
	set.add(2);
	set.add(3);
	set.add(4);
	
	System.out.println(all_subsets(set));
	
	}	
	
    
	private static List<List<Integer>> all_subsets(List<Integer> set){
		List<List<Integer>> subsets = new ArrayList<>();
		all_subsets(set,subsets);
		return subsets;
	}
	
	private static boolean set_on_subset(List<Integer> set,List<List<Integer>> subsets) {
		
		for(int i = 0;i < subsets.size();i++){
			
			if(subsets.get(i).equals(set)){
				return true;
			}
			
		}
		return false;
		
	}
	
	private static void all_subsets(List<Integer> set,List<List<Integer>> subsets){
		
		if(set.size() == 0){
			return;
		}

		
		for(int i = 0;i < set.size();i++){
			List<Integer> subset = new ArrayList<>();
			subset.addAll(set);
			subset.remove(i);	
			if(set_on_subset(subset,subsets)) {
				continue;	
			}
			all_subsets(subset,subsets);
			subsets.add(subset);	
		
		}
		return;
		
		
	}

	
	} 
	
