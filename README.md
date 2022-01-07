# Java 8 to 11

## Java releases
- A new version of Java to be released every 6 months - March and September.
- With Java 11, Oracle JDK will be released under a commercial license and developers can use OracleJDK for free for development but not for production
    - adoptOpenJDK11

## Migration
- Easy
    - If no modularization of the application to use the Module system.
- Compile and update dependencies.

## GC
- from Parallel garbage collector (Parallel GC) in java 8 to Garbage First garbage collector (G1GC) in Java 9.

## Errors
- internal usage or deprecated packages/classes, e.g. `sun.misc` (Java core libraries are already modularized).
    - [jdepscan](https://docs.oracle.com/en/java/javase/11/tools/jdeprscan.html) - looks for use of deprecated or removed API
    - [jdeps](https://docs.oracle.com/en/java/javase/11/tools/jdeps.html) - which is a Java class dependency analyzer, tells you which class depends on which internal API

### Removal of Java EE modules:
The following modules had been marked as deprecated in JDK 9 and have been removed in Java 11.
- xml.ws (JAX-WS, plus the related technologies SAAJ and Web Services Metadata)
- xml.bind (JAXB)
- activation (JAF)
- xml.ws.annotation (Common Annotations)
- corba (CORBA)
- transaction (JTA)

```
<dependency>
    <groupId>javax.xml.bind</grouId>
    <artifactId>jaxb-api</artifactId>
    <version>2.3.1</version>
</dependency>
```

## Deprecations
Some deprecations and removals (check official documentation)

## Features
### Java 9
- Modularization
- JShell
- [Instance Private Methods and Static private Methods in Interface](src/main/java/java9/PrivateMethodsInterface.java)
- [Improved try with resource Blocks](src/main/java/java9/TryWithResources.java)
- [Immutable Collection](src/main/java/java9/ImmutableCollection.java)
- [Streaming API](src/main/java/java9/StreamingAPI.java)
- [Optionals](src/main/java/java9/Optionals.java)
- [CompletableFutures](src/main/java/java9/CompletableFutures.java)
- [New HTTP Client](src/main/java/java9/NewHTTPClient.java)
- [ProcessAPI](src/main/java/java9/ProcessAPI.java)

### Java 10
- [var](src/main/java/Java10/VarKeyword.java)
- [Collectors API](src/main/java/Java10/CollectorsAPI.java)
- [Immutable Collection](src/main/java/java10/ImmutableCollection.java)
- [Optionals](src/main/java/java10/Optionals.java)

### Java 11
- [String API Updates](src/main/java/java11/StringAPI.java)
- [File API Updates](src/main/java/java11/FileAPI.java)
- [Optional isEmpty](src/main/java/java11/OptionalIsEmpty.java)
- [Collection To Array](src/main/java/java11/CollectionToArray.java)
- [Predicate Not](src/main/java/java11/PredicateNot.java)
