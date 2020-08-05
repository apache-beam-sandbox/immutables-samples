package com.immutables;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Address}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAddress.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableAddress.of()}.
 */
@SuppressWarnings("all")
@Generated({"Immutables.generator", "Address"})
public final class ImmutableAddress extends Address {
  private final String city;
  private final String street;
  private final Integer zipCode;
  private final int hashCode;

  private ImmutableAddress(String city, String street, Integer zipCode) {
    this.city = Objects.requireNonNull(city, "city");
    this.street = Objects.requireNonNull(street, "street");
    this.zipCode = Objects.requireNonNull(zipCode, "zipCode");
    this.hashCode = computeHashCode();
  }

  private ImmutableAddress(
      ImmutableAddress original,
      String city,
      String street,
      Integer zipCode) {
    this.city = city;
    this.street = street;
    this.zipCode = zipCode;
    this.hashCode = computeHashCode();
  }

  /**
   * @return The value of the {@code city} attribute
   */
  @Override
  String city() {
    return city;
  }

  /**
   * @return The value of the {@code street} attribute
   */
  @Override
  String street() {
    return street;
  }

  /**
   * @return The value of the {@code zipCode} attribute
   */
  @Override
  Integer zipCode() {
    return zipCode;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Address#city() city} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param city A new value for city
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAddress withCity(String city) {
    if (this.city.equals(city)) return this;
    String newValue = Objects.requireNonNull(city, "city");
    return new ImmutableAddress(this, newValue, this.street, this.zipCode);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Address#street() street} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param street A new value for street
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAddress withStreet(String street) {
    if (this.street.equals(street)) return this;
    String newValue = Objects.requireNonNull(street, "street");
    return new ImmutableAddress(this, this.city, newValue, this.zipCode);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Address#zipCode() zipCode} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param zipCode A new value for zipCode
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAddress withZipCode(Integer zipCode) {
    if (this.zipCode.equals(zipCode)) return this;
    Integer newValue = Objects.requireNonNull(zipCode, "zipCode");
    return new ImmutableAddress(this, this.city, this.street, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAddress} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAddress
        && equalTo((ImmutableAddress) another);
  }

  private boolean equalTo(ImmutableAddress another) {
    return city.equals(another.city)
        && street.equals(another.street)
        && zipCode.equals(another.zipCode);
  }

  /**
   * Returns a precomputed-on-construction hash code from attributes: {@code city}, {@code street}, {@code zipCode}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    return hashCode;
  }

  private int computeHashCode() {
    int h = 31;
    h = h * 17 + city.hashCode();
    h = h * 17 + street.hashCode();
    h = h * 17 + zipCode.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Address} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Address{"
        + "city=" + city
        + ", street=" + street
        + ", zipCode=" + zipCode
        + "}";
  }

  /**
   * Construct a new immutable {@code Address} instance.
   * @param city The value for the {@code city} attribute
   * @param street The value for the {@code street} attribute
   * @param zipCode The value for the {@code zipCode} attribute
   * @return An immutable Address instance
   */
  public static ImmutableAddress of(String city, String street, Integer zipCode) {
    return new ImmutableAddress(city, street, zipCode);
  }

  /**
   * Creates an immutable copy of a {@link Address} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Address instance
   */
  public static ImmutableAddress copyOf(Address instance) {
    if (instance instanceof ImmutableAddress) {
      return (ImmutableAddress) instance;
    }
    return ImmutableAddress.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAddress ImmutableAddress}.
   * @return A new ImmutableAddress builder
   */
  public static ImmutableAddress.Builder builder() {
    return new ImmutableAddress.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAddress ImmutableAddress}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_CITY = 0x1L;
    private static final long INIT_BIT_STREET = 0x2L;
    private static final long INIT_BIT_ZIP_CODE = 0x4L;
    private long initBits = 0x7L;

    private String city;
    private String street;
    private Integer zipCode;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Address} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Address instance) {
      Objects.requireNonNull(instance, "instance");
      city(instance.city());
      street(instance.street());
      zipCode(instance.zipCode());
      return this;
    }

    /**
     * Initializes the value for the {@link Address#city() city} attribute.
     * @param city The value for city 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder city(String city) {
      this.city = Objects.requireNonNull(city, "city");
      initBits &= ~INIT_BIT_CITY;
      return this;
    }

    /**
     * Initializes the value for the {@link Address#street() street} attribute.
     * @param street The value for street 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder street(String street) {
      this.street = Objects.requireNonNull(street, "street");
      initBits &= ~INIT_BIT_STREET;
      return this;
    }

    /**
     * Initializes the value for the {@link Address#zipCode() zipCode} attribute.
     * @param zipCode The value for zipCode 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder zipCode(Integer zipCode) {
      this.zipCode = Objects.requireNonNull(zipCode, "zipCode");
      initBits &= ~INIT_BIT_ZIP_CODE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAddress ImmutableAddress}.
     * @return An immutable instance of Address
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAddress build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAddress(null, city, street, zipCode);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_CITY) != 0) attributes.add("city");
      if ((initBits & INIT_BIT_STREET) != 0) attributes.add("street");
      if ((initBits & INIT_BIT_ZIP_CODE) != 0) attributes.add("zipCode");
      return "Cannot build Address, some of required attributes are not set " + attributes;
    }
  }
}
