package com.immutables;

import org.immutables.value.Value;

@Value.Immutable
public abstract class Person {

	 abstract String getName();
	 abstract long getAge();
}
