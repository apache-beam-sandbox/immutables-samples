package com.immutables;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Person}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePerson.builder()}.
 */
@SuppressWarnings("all")
@Generated({"Immutables.generator", "Person"})
public final class ImmutablePerson extends Person {
  private final String name;
  private final long age;

  private ImmutablePerson(String name, long age) {
    this.name = name;
    this.age = age;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @Override
  String getName() {
    return name;
  }

  /**
   * @return The value of the {@code age} attribute
   */
  @Override
  long getAge() {
    return age;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Person#getName() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param name A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson withName(String name) {
    if (this.name.equals(name)) return this;
    String newValue = Objects.requireNonNull(name, "name");
    return new ImmutablePerson(newValue, this.age);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Person#getAge() age} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param age A new value for age
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson withAge(long age) {
    if (this.age == age) return this;
    return new ImmutablePerson(this.name, age);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePerson} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePerson
        && equalTo((ImmutablePerson) another);
  }

  private boolean equalTo(ImmutablePerson another) {
    return name.equals(another.name)
        && age == another.age;
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code age}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + name.hashCode();
    h = h * 17 + (int) (age ^ (age >>> 32));
    return h;
  }

  /**
   * Prints the immutable value {@code Person} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Person{"
        + "name=" + name
        + ", age=" + age
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link Person} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Person instance
   */
  public static ImmutablePerson copyOf(Person instance) {
    if (instance instanceof ImmutablePerson) {
      return (ImmutablePerson) instance;
    }
    return ImmutablePerson.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePerson ImmutablePerson}.
   * @return A new ImmutablePerson builder
   */
  public static ImmutablePerson.Builder builder() {
    return new ImmutablePerson.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePerson ImmutablePerson}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_AGE = 0x2L;
    private long initBits = 0x3L;

    private String name;
    private long age;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Person} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Person instance) {
      Objects.requireNonNull(instance, "instance");
      name(instance.getName());
      age(instance.getAge());
      return this;
    }

    /**
     * Initializes the value for the {@link Person#getName() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link Person#getAge() age} attribute.
     * @param age The value for age 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder age(long age) {
      this.age = age;
      initBits &= ~INIT_BIT_AGE;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePerson ImmutablePerson}.
     * @return An immutable instance of Person
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePerson build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePerson(name, age);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_AGE) != 0) attributes.add("age");
      return "Cannot build Person, some of required attributes are not set " + attributes;
    }
  }
}
