---
title: Shape class
---
Shape bus naudojama kuriant atskirus objektus.

Shape klasė turi du konstruktorius

- Default

<SwmSnippet path="/src/main/java/lt/test/webtest/Shape.java" line="23">

---

&nbsp;

```java
    public Shape() {

    }
```

---

</SwmSnippet>

- Parametrized

<SwmSnippet path="/src/main/java/lt/test/webtest/Shape.java" line="26">

---

&nbsp;

```java
    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }
```

---

</SwmSnippet>

<SwmToken path="/src/main/java/lt/test/webtest/Shape.java" pos="3:4:4" line-data="public class Shape {">`Shape`</SwmToken> klasė papildomai turi metodą, <SwmToken path="/src/main/java/lt/test/webtest/Shape.java" pos="31:5:7" line-data="    public void getArea(){">`getArea()`</SwmToken> kurį paveldinčios klasės galės prisitaikyti skaičiuoti plotui.

| Metodai                                                                                                                                            | Panaudojimas       |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------ |
| <SwmToken path="/src/main/java/lt/test/webtest/Shape.java" pos="11:5:5" line-data="    public void setName(String name) {">`setName`</SwmToken>    | Nustato pavadinimą |
| <SwmToken path="/src/main/java/lt/test/webtest/Shape.java" pos="19:5:5" line-data="    public void setColor(String color) {">`setColor`</SwmToken> | Nustato spalvą'    |

### Main

asdasd

<SwmSnippet path="/src/main/java/lt/test/webtest/WebtestApplication.java" line="9">

---

This code snippet is the entry point of a Spring Boot application. It calls the `run` method from the `SpringApplication` class to start the application. The `main` method is the starting point of the program execution.

```java
	public static void main(String[] args) {
		SpringApplication.run(WebtestApplication.class, args);
	}

```

---

</SwmSnippet>

<SwmMeta version="3.0.0" repo-id="Z2l0aHViJTNBJTNBc3dpbW1UZXN0JTNBJTNBU2FydW5hc01lZGVpa2lz" repo-name="swimmTest"><sup>Powered by [Swimm](https://app.swimm.io/)</sup></SwmMeta>
