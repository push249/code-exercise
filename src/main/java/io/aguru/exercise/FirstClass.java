package io.aguru.exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import io.aguru.exercise.model.FirstModel;

public class FirstClass {

	public static void main(String args[]) {

		List<FirstModel> firstModelList = new ArrayList<FirstModel>();

		firstModelList.sort((FirstModel f1, FirstModel f2) -> f1.getI() - f2.getI());

		firstModelList.forEach((firstModel) -> {
			int i = firstModel.getI();
			firstModel.setI(++i);

		});

		firstModelList.sort((f1, f2) -> f1.getStr().compareTo(f2.getStr()));

		firstModelList.sort((f1, f2) -> f1.getC() - f2.getC());

		Comparator<FirstModel> reverseAgeComparator = (f1, f2) -> f1.getI() - f2.getI();

		firstModelList.sort(reverseAgeComparator.reversed());

		Map<String, String> firstMap = new HashMap<String, String>();

		firstMap.forEach((k, v) -> {
			if (k.equals(v)) {
				System.out.println("Key-Value are the same");
			}
		});

		firstModelList.stream().filter(f1 -> (f1.getI() > 10)).collect(Collectors.toList());

		firstModelList.stream().filter(f1 -> (f1.getStr().equals("model"))).findAny().orElse(null);

		firstModelList.stream().filter(f1 -> ("model".equals(f1.getStr()))).map(FirstModel::getStr).findAny()
				.orElse(null);
		
		List<Integer> intList = firstModelList.stream().map(FirstModel::getI).collect(Collectors.toList());
		
		intList.forEach(System.out::println);
		
		
		
		

	}

}