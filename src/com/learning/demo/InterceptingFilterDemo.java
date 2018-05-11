package com.learning.demo;

import com.learning.design.pattern.interceptingFilter.AuthenticationFilter;
import com.learning.design.pattern.interceptingFilter.Client;
import com.learning.design.pattern.interceptingFilter.DebugFilter;
import com.learning.design.pattern.interceptingFilter.FilterManager;
import com.learning.design.pattern.interceptingFilter.Target;

public class InterceptingFilterDemo {

	public static void main(String[] args) {
		FilterManager filterManager = new FilterManager(new Target());
		filterManager.setFilter(new AuthenticationFilter());
		filterManager.setFilter(new DebugFilter());

		Client client = new Client();
		client.setFilterManager(filterManager);
		client.sendRequest("HOME");

	}

}
