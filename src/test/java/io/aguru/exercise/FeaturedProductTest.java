package io.aguru.exercise;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class FeaturedProductTest {

	@Test
	void testGetFeaturedProduct() {
		FeaturedProduct fp = new FeaturedProduct();
		List<String> productList = new ArrayList<String>();
		productList.add("Orange");
		productList.add("Blue");
		productList.add("White");
		productList.add("Black");
		productList.add("Black");
		productList.add("Blue");
		productList.add("Orange");
		productList.add("Orange");
		String featuredProduct = fp.solution(productList);
		assertEquals("Orange", featuredProduct);
	}

}
