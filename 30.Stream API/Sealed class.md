✅ What is a sealed class?
A sealed class restricts which other classes or interfaces may extend or implement it.

🔐 Syntax:
```
public sealed class Animal
    permits Dog, Cat {
    // class body
}

final class Dog extends Animal {
    // Dog is allowed
}

non-sealed class Cat extends Animal {
    // Cat is also allowed, but can be extended further
}
```


🔍 Explanation:
sealed keyword restricts who can extend the class.

permits clause lists the allowed subclasses.

Subclasses must be one of:

final → cannot be extended further

sealed → continue restricting inheritance

non-sealed → removes the restriction, allows free extension