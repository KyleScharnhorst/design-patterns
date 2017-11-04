The intent of the Builder design pattern is as follows:

Separate the construction of a complex object from its representation so that the same construction process can create different representations.(Gamma 97)

In this example our complex object is a house. The house can have doors, rooms, stairs, and stories. The Builder is instantiated by our Main class to create a house. Given that we use an abstract house Builder allows us to create different concrete versions of builders to facilitate in handling variations of implementation requirements. I.e., We could have a fancy house builder or spooky house builder and still use the same create house function in main.

As mentioned in Design Patterns (Gamma 105), Builder and Abstract Factory design patterns are similar in the fact that they can both return complex objects. However, the Builder is concerned with incrementally building the complex object and finally returning it as a final step. The Abstract Factory return the complex object immediately.

Source(s):
-Gamma, Erich, et al. "Builder” Design Patterns: Elements of Reusable Object-Oriented Software, Addison-Wesley Publishing Company, 1995.
