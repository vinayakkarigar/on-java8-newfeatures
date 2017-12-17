package com.vin.core.methodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import com.vin.core.lambda.Apple;
import com.vin.core.lambda.Color;

public class DemoConstructorReference {

	public static void main(String[] args) {
		
		Supplier<Apple> c1 = Apple::new ;
		Apple a1 = c1.get();
		System.out.println(a1);
		
		//parameterized constructors
		BiFunction<Color, Integer, Apple> c2 = Apple::new;
		Apple a2 = c2.apply(Color.GREEN, 300);
		System.out.println(a2);
		
		//create green apples using different weights supplied as list
		List<Integer> weights = Arrays.asList(10,20,30,40,50);
		List<Apple> apples = map(weights, Apple::new);
		System.out.println(apples);
		
		
		
	}
	
	public static List<Apple> map(List<Integer> weights, Function<Integer, Apple> f) {
		///result
		List<Apple> result = new ArrayList<>();
		
		for (Integer integer : weights) {
			result.add(f.apply(integer));
		}
		return result;
	}
	
}
