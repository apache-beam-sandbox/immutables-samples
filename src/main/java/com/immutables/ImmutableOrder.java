package com.immutables;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Order}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableOrder.builder()}.
 */
@SuppressWarnings("all")
@Generated({"Immutables.generator", "Order"})
public final class ImmutableOrder extends Order {
  private final String item;
  private final Integer price;
  private final String auxiliaryField;

  private ImmutableOrder(String item, Integer price, String auxiliaryField) {
    this.item = item;
    this.price = price;
    this.auxiliaryField = auxiliaryField;
  }

  /**
   * @return The value of the {@code item} attribute
   */
  @Override
  String item() {
    return item;
  }

  /**
   * @return The value of the {@code price} attribute
   */
  @Override
  Integer price() {
    return price;
  }

  /**
   * @return The value of the {@code auxiliaryField} attribute
   */
  @Override
  String auxiliaryField() {
    return auxiliaryField;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Order#item() item} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param item A new value for item
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableOrder withItem(String item) {
    if (this.item.equals(item)) return this;
    String newValue = Objects.requireNonNull(item, "item");
    return new ImmutableOrder(newValue, this.price, this.auxiliaryField);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Order#price() price} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param price A new value for price
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableOrder withPrice(Integer price) {
    if (this.price.equals(price)) return this;
    Integer newValue = Objects.requireNonNull(price, "price");
    return new ImmutableOrder(this.item, newValue, this.auxiliaryField);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Order#auxiliaryField() auxiliaryField} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param auxiliaryField A new value for auxiliaryField
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableOrder withAuxiliaryField(String auxiliaryField) {
    if (this.auxiliaryField.equals(auxiliaryField)) return this;
    String newValue = Objects.requireNonNull(auxiliaryField, "auxiliaryField");
    return new ImmutableOrder(this.item, this.price, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableOrder} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableOrder
        && equalTo((ImmutableOrder) another);
  }

  private boolean equalTo(ImmutableOrder another) {
    return item.equals(another.item)
        && price.equals(another.price);
  }

  /**
   * Computes a hash code from attributes: {@code item}, {@code price}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + item.hashCode();
    h = h * 17 + price.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Order} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Order{"
        + "item=" + item
        + ", price=" + price
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link Order} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Order instance
   */
  public static ImmutableOrder copyOf(Order instance) {
    if (instance instanceof ImmutableOrder) {
      return (ImmutableOrder) instance;
    }
    return ImmutableOrder.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableOrder ImmutableOrder}.
   * @return A new ImmutableOrder builder
   */
  public static ImmutableOrder.Builder builder() {
    return new ImmutableOrder.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableOrder ImmutableOrder}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_ITEM = 0x1L;
    private static final long INIT_BIT_PRICE = 0x2L;
    private static final long INIT_BIT_AUXILIARY_FIELD = 0x4L;
    private long initBits = 0x7L;

    private String item;
    private Integer price;
    private String auxiliaryField;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Order} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Order instance) {
      Objects.requireNonNull(instance, "instance");
      item(instance.item());
      price(instance.price());
      auxiliaryField(instance.auxiliaryField());
      return this;
    }

    /**
     * Initializes the value for the {@link Order#item() item} attribute.
     * @param item The value for item 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder item(String item) {
      this.item = Objects.requireNonNull(item, "item");
      initBits &= ~INIT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the value for the {@link Order#price() price} attribute.
     * @param price The value for price 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder price(Integer price) {
      this.price = Objects.requireNonNull(price, "price");
      initBits &= ~INIT_BIT_PRICE;
      return this;
    }

    /**
     * Initializes the value for the {@link Order#auxiliaryField() auxiliaryField} attribute.
     * @param auxiliaryField The value for auxiliaryField 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder auxiliaryField(String auxiliaryField) {
      this.auxiliaryField = Objects.requireNonNull(auxiliaryField, "auxiliaryField");
      initBits &= ~INIT_BIT_AUXILIARY_FIELD;
      return this;
    }

    /**
     * Builds a new {@link ImmutableOrder ImmutableOrder}.
     * @return An immutable instance of Order
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableOrder build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableOrder(item, price, auxiliaryField);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_ITEM) != 0) attributes.add("item");
      if ((initBits & INIT_BIT_PRICE) != 0) attributes.add("price");
      if ((initBits & INIT_BIT_AUXILIARY_FIELD) != 0) attributes.add("auxiliaryField");
      return "Cannot build Order, some of required attributes are not set " + attributes;
    }
  }
}
