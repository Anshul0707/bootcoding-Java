# Definition of all interfaces (Functional Interface)  

## Predicate

- Definition: Represents a predicate (boolean-valued function) of one argument.
- Declaration: `@FunctionalInterface public interface Predicate<T>`
- Example Usage: `Predicate<Integer> isEven = num -> num % 2 == 0;`

## Consumer

- Definition: Represents an operation that accepts a single input argument and returns no result.
- Declaration: `@FunctionalInterface public interface Consumer<T>`
- Example Usage: `Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());`

## Function

- Definition: Represents a function that accepts one argument and produces a result.
- Declaration: `@FunctionalInterface public interface Function<T, R>`
- Example Usage: `Function<Integer, String> intToString = num -> Integer.toString(num);`

## Supplier

- Definition: Represents a supplier of results.
- Declaration: `@FunctionalInterface public interface Supplier<T>`
- Example Usage: `Supplier<Double> getRandomNumber = () -> Math.random();`
