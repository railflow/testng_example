package io.railflow.demo.test.testng;

import org.testng.annotations.Test;

public class PizzaOrderTest {

	@Test
	public void orderPizza() {
		System.out.println("Pizza ordered");
	}

	@Test
	public void orderPizzaFailTypeNotSet() {
		System.out.println("Pizza type not set");
	}

	@Test
	public void setPizzaTypeMargherita() {
		System.out.println("Pizza margherita");
	}

	@Test
	public void setPizzaToppingCheese() {
		System.out.println("Pizza topping - cheese");
	}

	@Test
	public void orderPizzaFailNoCreditCard() {
		System.out.println("No credit card");
	}
}
