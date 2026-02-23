# The static Keyword in Java

What is static?

The static keyword is a tool used in Java mainly to save memory.

1. One-Time Loading : Instead of being created over and over for every object, a static item is created only once in the memory.

2. Shared Values: It always holds the most updated value, and every part of your program sees that same value.

3. Class Level: It belongs to the Class itself, not to the individual objects.

# How to access Static Members?

Since static members belong to the class, you don’t need to create an object to use them. You can access them in two ways:

Using the Class Name: (The best way) Just use ClassName.variableName.

Using an Object: You can create an object and use it, but it’s not necessary.

**Note** : If you make a variable, method, or inner class static, you can call it directly using the Dot (.) operator without building an object first.

# Where can we use static?

You can apply the static keyword to these four things:

* Variables: To create a shared variable for all objects.

* Methods: To create functions that run without needing an object.

* Blocks: To run specific code automatically when the class first loads.

* Inner Classes: To allow a nested class to exist without needing the outer class.
