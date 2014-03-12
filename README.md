Battlecraft Debugging Library
======

What does this debugging library do ?
---
```java
DebugInterface debug = new DebugOn();
debug.log("The value of x = " + x);
debug.messagePlayer(player, "Debug msg here");
debug = new DebugOff();
```

As you can see, it adds extra information
about the state of objects & fields inside your program.

Turn debugging on when you want to inspect 
certain values and make sure they're within
an expected range.

No need to delete your debugging messages 
when you're done debugging:

```java
// To turn debugging off:
debug = new DebugOff();
```

---

```java
// To turn debugging back on:
debug = new DebugOn();
```

---

```java
// To create a debugging object:
// with default ON
DebugInterface debug = new DebugOn();
// OR
// with default OFF
DebugInterface debug = new DebugOff();
```

Contact:
======

Nick at Nikolai.Kalashnikov@hotmail.com

[http://www.Battlecraft.co/](http://www.Battlecraft.co/ "Battlecraft")
