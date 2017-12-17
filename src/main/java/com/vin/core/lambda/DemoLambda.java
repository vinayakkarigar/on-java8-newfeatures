package com.vin.core.lambda;

import java.util.ArrayList;
import java.util.List;

public class DemoLambda {

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
		
		//filter green apples
		List<Apple> greenApples = AppleInventoryUtilities.filter(apples, (Apple apple) -> Color.GREEN.equals(apple.getColor()));
		System.out.println(greenApples);

		//filter all red apples having weight greater than or equal to 150
		List<Apple> redApplesHeavierThan150 = AppleInventoryUtilities.filter(apples, (Apple apple) -> Color.RED.equals(apple.getColor()) && apple.getWeight() >= 150);
		System.out.println(redApplesHeavierThan150);
		
		//convert all green apples to red
		AppleInventoryUtilities.transform(apples, (Apple apple) -> apple.setColor(Color.RED));
		System.out.println(apples);
		
		
//		System.out.println(apples.removeIf((Apple apple) -> Color.GREEN.equals(apple.getColor())));
//		System.out.println(apples);
		
	}
}
