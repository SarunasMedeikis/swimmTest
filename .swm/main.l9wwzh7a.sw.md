---
title: Main
---
### WebtestApplication

### Atsakinga už:

xxx

### Funkcionalumai:

[JIRA](https://jira.registrucentras.lt)

- metodas sukuria <SwmToken path="/src/main/java/lt/test/webtest/WebtestApplication.java" pos="14:1:1" line-data="		Shape shape = new Shape(&quot;shape&quot;, &quot;red&quot;);">`Shape`</SwmToken> ir <SwmToken path="/src/main/java/lt/test/webtest/WebtestApplication.java" pos="16:1:1" line-data="		Square square = new Square(&quot;square&quot;, &quot;blue&quot;, 5);">`Square`</SwmToken>

<SwmSnippet path="src/main/java/lt/test/webtest/WebtestApplication.java" line="13">

---

This code snippet defines a `test` method that csreates instances of `Shape` and `Square`, sets their properties, and calls the `getArea` method on each object.

```
	public void test(){
		Shape shape = new Shape("shape", "red");
		shape.getArea();
		Square square = new Square("square", "blue", 5);
		square.getArea();
		Shape shape1 = new Shape();
		shape1.setName("shape1");
	}
```

---

</SwmSnippet>

### Failo struktūra:

# File Structure

The file structure of the `swimmTest` repository follows a specific convention to ensure organization and maintainability. This section provides an overview of the main directories and files in the repository.

## Directories

The repository is structured as follows:

- `src`: This directory contains the source code of the application.
  - `main`: This directory contains the main codebase of the application.
    - `java`: This directory contains the Java source files.
      - `lt`: This directory contains the source files specific to the `lt` package.
        - `test`: This directory contains the source files specific to the `test` package.
          - `webtest`: This directory contains the source files specific to the `webtest` package.
            - `WebtestApplication.java`: This file is the entry point of the application.
    - `resources`: This directory contains the resource files used by the application.
  - `test`: This directory contains the test code for the application.

## Files

The main files in the repository include:

- `WebtestApplication.java`: This file serves as the entry point of the application. It contains a `test()` method that demonstrates the usage of the `Shape` and `Square` classes.

As seen in the code snippet from `src/main/java/lt/test/webtest/WebtestApplication.java`, the `test()` method creates instances of the `Shape` and `Square` classes and calls their `getArea()` methods

&nbsp;

<SwmMeta version="3.0.0" repo-id="Z2l0aHViJTNBJTNBc3dpbW1UZXN0JTNBJTNBU2FydW5hc01lZGVpa2lz" repo-name="swimmTest"><sup>Powered by [Swimm](https://app.swimm.io/)</sup></SwmMeta>
