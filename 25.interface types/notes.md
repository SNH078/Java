**Types of Interfaces**


**Marker Interfaces :** 
->interfaces without any methods declared.
->use  : Identifies classes with specific properties/behaviors at runtime.
-> Examples: Serializable, Cloneable, Remote.

**Functional Interfaces :**
->one abstract method  (can have default & static methods).
->Used for Lambda Expressions & functional programming.
->

**Single Abstract Method (SAM) Interfaces :** 
->any number of default or static methods, but only one abstract method. (like Functional Interfaces).
-> use : Before Java 8, these were used to define Lambda-compatible interfaces.
->  Examples: Runnable, Comparator, MouseListener.

**Normal Interfaces :** 
-> interface that define multiple abstract methods and can have default & static methods.
-> use : Used for defining contracts that classes must follow.
-> Examples: List, Set, Map from java.util.

---------------------------------
**Serializable**
-> refers to capability of an object to be converted into a format((such as JSON, binary, or XML) ) that can be stored or transmitted and then reconstructed later.

-> use : used in data persistence, networking, and inter-process communication.

**Deserialization**
is the process of converting serialized data (like JSON, binary, or XML) back into an object or data structure in a programming language