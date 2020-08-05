package com.immutables;

import org.immutables.value.Value;
/*
 * A class where hash is computed only once during 
 * object construction and will remain same
 */
@Value.Immutable(prehash=true)
public abstract class Address {
	
	@Value.Parameter
	abstract String city();
	@Value.Parameter 
	abstract String street();
	@Value.Parameter
	abstract Integer zipCode();
	

}
