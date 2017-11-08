<p>  
  Factory Method:<br/>
  Separate the construction of a complex object from its representation so that the same construction process can create 
  different representations (Gamma 107).
</p>

<p>
  The basic idea of the Factory Method is to encapsulate the instantiation of an object. The most basic form of the factory method involves returning
  'new someObject()'. Why would we do this? Why not just call 'new someObject()' ourselves? 
  Looking at the Shape class, I have implemented a clone method.
  This method uses the Factory Method that is required to be implemented by subclasses. 
  For instance, Triangle implements the Factory Method and returns
  a new instance of itself. With that done, clone can work properly without being implemented in all subclasses. Without the use of the 
  Factory Method we would not be able to setup such a method in the base class (Shape). This is a common use for the Factory Method (Gamma 116),
  to be used in a Template Method. A Template Method is another design pattern that outlines an algorithm, but leaves it to subclasses to
  implement certain aspects of the algorithm. The Factory Method is the portion of the clone algorithm being left up to subclasses to implement.
<br/><br/>
  Factory Methods can be parameterized. I have shown this using the static createSomeShape method in the Shape class.
  In my example Shape is an abstract class, but this is not a requirement of the Factory Method design pattern.
</p>

<p>
  Source(s):<br/>
  - Gamma, Erich, Design Patterns: Elements of Reusable Object-Oriented Software, Addison-Wesley Publishing Company, 1995.
</p>
