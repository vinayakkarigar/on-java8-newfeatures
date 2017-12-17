package com.vin.core.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class AppleInventoryUtilities {

	// filter all green apples
	public static List<Apple> filter(List<Apple> apples, Predicate<Apple> predicate) {

		List<Apple> result = new ArrayList<>();
		for (Apple apple : apples) {
			if (predicate.test(apple)) {
				result.add(apple);
			}
		}

		return result;

	}

	public static void transform(List<Apple> apples, Consumer<Apple> transformer) {
		for (Apple apple : apples) {
			transformer.accept(apple);
		}
	}

}
