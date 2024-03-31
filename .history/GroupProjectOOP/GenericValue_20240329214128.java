package GroupProjectOOP;

/**
 * A generic class is a wrapper class used to store a single value of any type.
 * Generics are a type of Polymorphism, specifically Parametric polymorphism
 * It involves the usage of placeholders or generics types that are substituted at compile time
 * <T> the type of the value stored
 */

public class GenericValue<T> {
    public T value = null;

    public void setValue(T value) {
        //The value can be a string, int, float, double or any data type, depending on the user input
        //Even custom data types can be passed in

        this.value = value;

    }

    public T getValue() {
        return this.value;
    }

}
