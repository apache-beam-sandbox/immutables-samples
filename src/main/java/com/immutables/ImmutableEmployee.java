package com.immutables;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Employee}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEmployee.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableEmployee.of()}.
 */
@SuppressWarnings("all")
@Generated({"Immutables.generator", "Employee"})
public final class ImmutableEmployee extends Employee {
  private final String name;
  private final Integer salary;
  private final Integer age;

  private ImmutableEmployee(String name, Integer salary) {
    this.name = Objects.requireNonNull(name, "name");
    this.salary = Objects.requireNonNull(salary, "salary");
    this.age = Objects.requireNonNull(super.getAge(), "age");
  }

  private ImmutableEmployee(ImmutableEmployee.Builder builder) {
    this.name = builder.name;
    this.salary = builder.salary;
    this.age = builder.age != null
        ? builder.age
        : Objects.requireNonNull(super.getAge(), "age");
  }

  private ImmutableEmployee(String name, Integer salary, Integer age) {
    this.name = name;
    this.salary = salary;
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
   * @return The value of the {@code salary} attribute
   */
  @Override
  Integer getSalary() {
    return salary;
  }

  /**
   * @return The value of the {@code age} attribute
   */
  @Override
  Integer getAge() {
    return age;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Employee#getName() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param name A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmployee withName(String name) {
    if (this.name.equals(name)) return this;
    String newValue = Objects.requireNonNull(name, "name");
    return new ImmutableEmployee(newValue, this.salary, this.age);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Employee#getSalary() salary} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param salary A new value for salary
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmployee withSalary(Integer salary) {
    if (this.salary.equals(salary)) return this;
    Integer newValue = Objects.requireNonNull(salary, "salary");
    return new ImmutableEmployee(this.name, newValue, this.age);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Employee#getAge() age} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param age A new value for age
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmployee withAge(Integer age) {
    if (this.age.equals(age)) return this;
    Integer newValue = Objects.requireNonNull(age, "age");
    return new ImmutableEmployee(this.name, this.salary, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEmployee} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEmployee
        && equalTo((ImmutableEmployee) another);
  }

  private boolean equalTo(ImmutableEmployee another) {
    return name.equals(another.name)
        && salary.equals(another.salary)
        && age.equals(another.age);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code salary}, {@code age}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + name.hashCode();
    h = h * 17 + salary.hashCode();
    h = h * 17 + age.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Employee} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Employee{"
        + "name=" + name
        + ", salary=" + salary
        + ", age=" + age
        + "}";
  }

  /**
   * Construct a new immutable {@code Employee} instance.
   * @param name The value for the {@code name} attribute
   * @param salary The value for the {@code salary} attribute
   * @return An immutable Employee instance
   */
  public static ImmutableEmployee of(String name, Integer salary) {
    return new ImmutableEmployee(name, salary);
  }

  /**
   * Creates an immutable copy of a {@link Employee} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Employee instance
   */
  public static ImmutableEmployee copyOf(Employee instance) {
    if (instance instanceof ImmutableEmployee) {
      return (ImmutableEmployee) instance;
    }
    return ImmutableEmployee.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEmployee ImmutableEmployee}.
   * @return A new ImmutableEmployee builder
   */
  public static ImmutableEmployee.Builder builder() {
    return new ImmutableEmployee.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEmployee ImmutableEmployee}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_SALARY = 0x2L;
    private long initBits = 0x3L;

    private String name;
    private Integer salary;
    private Integer age;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Employee} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Employee instance) {
      Objects.requireNonNull(instance, "instance");
      name(instance.getName());
      salary(instance.getSalary());
      age(instance.getAge());
      return this;
    }

    /**
     * Initializes the value for the {@link Employee#getName() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link Employee#getSalary() salary} attribute.
     * @param salary The value for salary 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder salary(Integer salary) {
      this.salary = Objects.requireNonNull(salary, "salary");
      initBits &= ~INIT_BIT_SALARY;
      return this;
    }

    /**
     * Initializes the value for the {@link Employee#getAge() age} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Employee#getAge() age}.</em>
     * @param age The value for age 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder age(Integer age) {
      this.age = Objects.requireNonNull(age, "age");
      return this;
    }

    /**
     * Builds a new {@link ImmutableEmployee ImmutableEmployee}.
     * @return An immutable instance of Employee
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEmployee build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableEmployee(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_SALARY) != 0) attributes.add("salary");
      return "Cannot build Employee, some of required attributes are not set " + attributes;
    }
  }
}
