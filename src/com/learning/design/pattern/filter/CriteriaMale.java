package com.learning.design.pattern.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {

		List<Person> femalePersons = new ArrayList<Person>();

		for (Person person : persons) {
			if (person.getGender().equalsIgnoreCase("Male")) {
				femalePersons.add(person);
			}
		}
		
		return femalePersons;
	}

}
