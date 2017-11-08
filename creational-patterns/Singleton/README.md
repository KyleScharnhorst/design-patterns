<p>
  Singleton:<br/>
  Ensure a class only has one instance, and provide a global point of access to it (Gamma 127).
</p>

<p>
  Singleton is one of the simpler design patterns to implement. You are ensuring that only one instance of an object can be instantiated.
  The Singleton design pattern is a great alternative to creating global variables for objects and many other patterns can be
  implemented with a Singleton. Such as: Abstract Factory, Builder, and Prototype (Gamma 134).
</p>

<p>
  There are a few options when it comes to implementing singletons. You get to choose when your one instance is created.
  Essentially there are two options to be concerned about. Albeit there are many ways to implement a singleton in Java.
  The object is either created immediately via static initialization (eager initialization) or
  the object is created when client code makes the first call to retrieve the instance (lazy initialization).
  Choosing between the to depends on the situation. The ultimate question is, When do you want the work to be done?
  If your singleton has potentially blocking properties like accessing files on disk, then you may want to do it on
  startup to avoid the overhead during client use of the application. Both eager and lazy initialization can have thread safe
  implementations. You may choose eager because you don't need to explicitly ensure that the getIntance method is thread safe
  like with lazy initialization.
</p>
  
<p>
  I have included three implementations: eager, lazy, and thread safe lazy initialization.
</p>
  
<p>
  Source(s):<br/>
  - Gamma, Erich, Design Patterns: Elements of Reusable Object-Oriented Software, Addison-Wesley Publishing Company, 1995.
</p>
