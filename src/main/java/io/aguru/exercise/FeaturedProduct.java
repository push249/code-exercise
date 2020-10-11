package io.aguru.exercise;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

public class FeaturedProduct {

	@SuppressWarnings("rawtypes")
	public String getFeaturedProduct(List<String> productList) {

		String featuredProduct = "";
		int count = 0;
		
		Map<String, Integer> productCount = new HashMap<String, Integer>();
		for (String s : productList) {
			if (productCount.containsKey(s)) {
				int n = productCount.get(s);
				productCount.put(s, ++n);
			} else {
				productCount.put(s, 1);
			}
		}
		
		/*productCount.forEach((k, v) -> {
			if (v > count) {
				featuredProduct = k;
				count = v;
			} else if (v == count) {
				if (featuredProduct.compareTo(k) < 0) {
					featuredProduct = k;
					count = v;
				}
			}
		});*/
		
		for (Map.Entry entry : productCount.entrySet())
        {
			String key = (String) entry.getKey();
            Integer value = (Integer) entry.getValue();

            if (value > count)
            {
                count = value;
                featuredProduct = key;
            }
            else if (value == count)
            {
                if (key.compareTo(featuredProduct) > 0)
                {
                    featuredProduct = key;
                }
            }
        }
		return featuredProduct;
	}

}
