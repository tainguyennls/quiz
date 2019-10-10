**1. Choose the best option based on the following program:**


```java
class Color {
    int red, green, blue;

    Color() {
        this(10, 10, 10);
    }

    Color(int r, int g, int b) {
        red = r;
        green = g;
        blue = b;
    }

    String toString() {
        return "The color is: " + " red = " + red + " green = " + green + "
        blue = " + blue;
    }

    public static void main(String [] args) {
        // implicitly invoke toString method
        System.out.println(new Color());
    }
}
```

- A. Compiler error: attempting to assign weaker access privileges; `toString` was public in `Object`
- B. Compiles fine, and when run, it prints the following: The color is: red = 10 green = 10 blue = 10
- C. Compiles fine, and when run, it prints the following: The color is: red = 0 green = 0 blue = 0
- D. Compiles fine, and when run, it throws `ClassCastException`


**2. Choose the correct option based on this code segment:**
```java
class Rectangle { }
class ColoredRectangle extends Rectangle { }
class RoundedRectangle extends Rectangle { }
class ColoredRoundedRectangle extends ColoredRectangle , RoundedRectangle { }
```

Choose an appropriate option:
- A. Compiler error: '{' expected cannot extend two classes
- B. Compiles fine, and when run, crashes with the exception `MultipleClassInheritanceException`
- C. Compiler error: class definition cannot be empty
- D. Compiles fine, and when run, crashes with the exception `EmptyClassDefinitionError`