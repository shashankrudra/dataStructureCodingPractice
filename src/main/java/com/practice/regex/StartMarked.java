package com.practice.regex;

import java.util.regex.Pattern;

public class StartMarked {

	private static final String ERROR_DYNAMIC_REGEX = ".*%s.*";
	private static final Pattern ERROR_DYNAMIC_PATTERN = Pattern.compile(ERROR_DYNAMIC_REGEX);
	private static final String QARTH_FIELD_SPLITTER = ":";
	
	public static void main(String[] args) {
		String info = "The Product Identifier (GTIN/UPC/ISBN/etc.) in the request is already setup with a different SKU: %s. In case you are trying to change the SKU for this Product Identifier, please send us the sku_override flag in the request. Please visit Walmart Knowledgebase (walmart-partner.force.com/knowledgebase) for more details.";
		System.out.println(hasDynamicInfo(info));
		
		info = "The Product Identifier (GTIN/UPC/ISBN/etc.) in the request is already setup with a different SKU. In case you are trying to change the SKU for this Product Identifier, please send us the sku_override flag in the request. Please visit Walmart Knowledgebase (walmart-partner.force.com/knowledgebase) for more details.";
		System.out.println(hasDynamicInfo(info));
	}
	
	static boolean hasDynamicInfo(String info) {
		return ERROR_DYNAMIC_PATTERN.matcher(info).matches();
	}
}