---
title: Test
---
```mermaid
classDiagram
    Animal <|-- Duck
    Animal <|-- Fish
    Animal <|-- Zebra
    Animal : Shape
    Animal : +String gender
    Animal: +isMammal()
    Animal: +mate()
    class Duck{
      +String beakColor
      +swim()
      +quack()
    }
    class Fish{
      -int sizeInFeet
      -canEat()
    }
    class Zebra{
      +bool is_wild
      +run()
    }

%% Swimm:
%% classDiagram
%%     Animal <|-- Duck
%%     Animal <|-- Fish
%%     Animal <|-- Zebra
%%     Animal : <SwmToken path="/src/main/java/lt/test/webtest/Shape.java" pos="3:4:4" line-data="public class Shape {">`Shape`</SwmToken>
%%     Animal : +String gender
%%     Animal: +isMammal()
%%     Animal: +mate()
%%     class Duck{
%%       +String beakColor
%%       +swim()
%%       +quack()
%%     }
%%     class Fish{
%%       -int sizeInFeet
%%       -canEat()
%%     }
%%     class Zebra{
%%       +bool is_wild
%%       +run()
%%     }
```

<SwmPath>[pom.xml](/pom.xml)</SwmPath>

<SwmMeta version="3.0.0" repo-id="Z2l0aHViJTNBJTNBc3dpbW1UZXN0JTNBJTNBU2FydW5hc01lZGVpa2lz" repo-name="swimmTest"><sup>Powered by [Swimm](https://app.swimm.io/)</sup></SwmMeta>
