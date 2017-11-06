Prototype:<br/>
Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype (Gamma 117).

<p>
  This example uses Tetris pieces to show how to implement prototypes. 
  There are a fixed number of Tetris pieces so I opted not to create a prototype manager where prototypes 
  can be registered and removed dynamically by a client. 
  Instead we are using a prototype factory which provides the means to create new 
  objects by cloning the prototypes provided to the factory upon instantiation.
</p>

<p>
  Declaring a Factory Method in the abstract Shape simplifies the implementation of clone amongst all the Tetris pieces. 
  Each Tetris shape is required to implement a Factory Method. 
  With this contract in place, the clone can safely live at the parent class level. 
  This is much simpler than having each piece implement a nearly identical clone method. 
  Clone in this case happens to be a Template Method. 
  A Template Method is a behavioral design pattern that defines the skeleton of an 
  algorithm in an operation, deferring some steps to subclasses (Gamma 325).
</p>

<p>
  The power of the prototype can be seen in Main. Prototypes can be declared at run-time. 
  This allows us to choose what objects will be prototypes and what state each will have.
  What does this mean for our Tetris example? Well, our game could have different game modes where shapes are different.
  When a game starts a new shape factory is instantiated with the correct pieces that correspond to that game mode. 
  The game would create pieces without having to know that one piece is any different than the next.
  Another thing to note, is that we are essentially defining the default state for a prototypical object when providing the factory object
  the prototypes upon instantiation. In essence, we can declare an object's default state dynamically rather than hard-coding it.
  If you look at the Shape class you can see that its position field is initialized to 'UP'.
  What if we don't want a piece to be initialized to 'UP' any longer and more reasonably what if we want it to be based
  on preference? We don't want to recompile the code every time we want a different default Shape state. Prototype solves this because
  we can declare. In the current implementation we require the orientation upon creation of a shape. So in this case the default
  is always overridden.
</p>

<p>
  Due to the nature of cloning objects with prototypes, it would also follow to use an immutable implementation for this Tetris game. 
  This would leverage the prototypes ability to clone itself and make a given application simpler.
  Immutability can prevent a lot of pitfalls. If the pieces of the Tetris game were immutable, 
  whenever the client wanted to change the state of a piece they would call some method that would clone 
  the piece then apply the change to the clone and return the clone. The client would then catch the 
  returned clone and use it appropriately. Read more on immutability
  <a href="http://www.javapractices.com/topic/TopicAction.do?Id=29">here</a>.
</p>

Source(s):<br/>
- Gamma, Erich, Design Patterns: Elements of Reusable Object-Oriented Software, Addison-Wesley Publishing Company, 1995.
