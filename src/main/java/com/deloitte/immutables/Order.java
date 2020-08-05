package com.deloitte.immutables;

import org.immutables.value.Value;

@Value.Immutable
public abstract class Order {

	abstract String item();
	abstract Integer price();
	
	/* An Auxiliary field is one that is stored in object's instance
	 * but ignored in equals() hashCode() and toString() methods
	 */
	@Value.Auxiliary
	abstract String auxiliaryField();
}
