---
title: Square class
---
### &nbsp;Square var

Klasė  square turi method overriding:

<SwmSnippet path="/src/main/java/lt/test/webtest/Square.java" line="22" collapsed>

---

This code snippet overrides the `getArea()` method to calculate and print the area of an object based on the value of its side length.

```java
    @Override
    public void getArea(){
        System.out.println("Area of " + this.getName() + " is " + this.side * this.side);
    }
```

---

</SwmSnippet>

<SwmToken path="/src/main/java/lt/test/webtest/Square.java" pos="3:2:3" line-data="class Square extends Shape{">`Square `</SwmToken>paveldi iš <SwmToken path="/src/main/java/lt/test/webtest/Shape.java" pos="3:4:4" line-data="public class Shape {">`Shape`</SwmToken> klasės, kuri aprašyta <SwmPath>[src/main/java/lt/test/webtest/Shape.java](/src/main/java/lt/test/webtest/Shape.java)</SwmPath>

Kvadratas turi savo atskira var <SwmToken path="/src/main/java/lt/test/webtest/Square.java" pos="4:5:5" line-data="    private int side;">`side`</SwmToken> kuris naudojamas  funkcijoje <SwmToken path="/src/main/java/lt/test/webtest/Shape.java" pos="31:5:5" line-data="    public void getArea(){">`getArea`</SwmToken>

&nbsp;

&nbsp;&nbsp;&nbsp;Aprašytas funkcionalumas <SwmToken path="/src/main/java/lt/test/webtest/Shape.java" pos="7:5:5" line-data="    public String getName() {">`getName`</SwmToken>

<SwmSnippet path="/src/main/java/lt/test/webtest/Shape.java" line="7">

---

This code snippet defines a method called `getName` which returns a `String` value stored in the variable `name`.

```java
    public String getName() {
        return name;
    }

```

---

</SwmSnippet>

<SwmMeta version="3.0.0" repo-id="Z2l0aHViJTNBJTNBc3dpbW1UZXN0JTNBJTNBU2FydW5hc01lZGVpa2lz" repo-name="swimmTest"><sup>Powered by [Swimm](https://app.swimm.io/)</sup></SwmMeta>
