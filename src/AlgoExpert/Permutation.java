package AlgoExpert;

import java.util.ArrayList;
import java.util.List;

public class Permutation
{
	public static void generatePermutation(List<Integer> arr, List<List<Integer>> result, int i){
		if( i == arr.size()-1 ){
			result.add(new ArrayList<>(arr));
		} else {
			for(int j=i; j<arr.size(); j++){
				swap(arr, i, j);
				generatePermutation(arr, result, i+1);
				swap(arr, i, j);
			}
		}
	}

	public static void swap(List<Integer> arr, int i, int j){
		int temp = arr.get(i);
		arr.set(i, arr.get(j));
		arr.set(j, temp);
	}

	public static void main(String[] args)
	{
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		List<List<Integer>> result = new ArrayList<>();
		generatePermutation(arr, result, 0);
		for(List<Integer> r : result){
			System.out.println(r);
		}
	}
}
