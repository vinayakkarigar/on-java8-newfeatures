package com.vin.core.methodReference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.vin.core.lambda.Apple;
import com.vin.core.lambda.Color;

public class DemoMethodReference {

	
private static List<Apple> apples; 
	
	static {
		//load apples
		apples = new ArrayList<>();
		apples.add(new Apple(Color.RED, 50));
		apples.add(new Apple(Color.GREEN, 150));
		apples.add(new Apple(Color.GREEN, 160));
		apples.add(new Apple(Color.GREEN, 79));
		apples.add(new Apple(Color.GREEN, 180));		
		apples.add(new Apple(Color.GREEN, 50));
		apples.add(new Apple(Color.GREEN, 50));
		apples.add(new Apple(Color.RED, 50));
		apples.add(new Apple(Color.RED, 50));
		apples.add(new Apple(Color.RED, 150));
		apples.add(new Apple(Color.RED, 50));
		apples.add(new Apple(Color.GREEN, 150));
		apples.add(new Apple(Color.GREEN, 150));
		apples.add(new Apple(Color.RED, 50));
		apples.add(new Apple(Color.RED, 150));
		apples.add(new Apple(Color.RED, 50));
	}
	
	
	public static void main(String[] args) {
		
		/*
		 * method reference are short hand for the lambda expressions calling only one method.
		 */
		//short apples based on their weight.
		apples.sort(Comparator.comparing(Apple::getWeight));
		System.out.println(apples);
		
		//transform all green apples to yellow
		apples.forEach((a) -> a.setColor(Color.YELLOW));
		System.out.println(apples);
		
		
		
	}
	
	
}
