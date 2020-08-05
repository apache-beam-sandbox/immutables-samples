package com.immutables;

import org.immutables.value.Value;

@Value.Immutable
public abstract class Employee {
	// For generating constructor with fields use parameter
	@Value.Parameter
	abstract String getName();
	@Value.Parameter
	abstract Integer getSalary();
	
	// For generating with default value create a non-abstract() as shown
	
	@Value.Default
	Integer getAge() {
		return 40;
	}
}
