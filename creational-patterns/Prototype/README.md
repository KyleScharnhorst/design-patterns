Prototype:<br/>
Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype (Gamma 117).

This example uses Tetris pieces to show how to implement prototypes. There are a fixed number of Tetris pieces so I opted not to create a prototype manager where prototypes can be registered and removed dynamically by a client. Instead we are using a prototype factory which provides the means to create new objects by cloning the prototypes provided to the factory upon instantiation.

Declaring a Factory Method in the abstract Shape simplifies the implementation of clone amongst all the Tetris pieces. Each Tetris shape is required to implement a Factory Method. With this contract in place, the clone can safely live at the parent class level. This is much simpler than having each piece implement a nearly identical clone method. Clone in this case happens to be a Template Method. A Template Method is a behavioral design pattern that defines the skeleton of an algorithm in an operation, deferring some steps to subclasses (Gamma 325).

The power of the prototype can be seen in Main. Prototypes can be declared at run-time. 
<p>
Because of the nature of cloning object with prototypes, it would also follow to use an immutable implementation for this Tetris game.
Immutability can prevent a lot of pitfalls. If the pieces of the Tetris game were immutable, 
whenever the client wanted to change the state of a piece they would call some method that would clone 
the piece then apply the change to the clone and return the clone. The client would then catch the 
returned clone and use it appropriately. Read more on immutability
[here](http://www.javapractices.com/topic/TopicAction.do?Id=29)
</p>

Source(s):<br/>
- Gamma, Erich, Design Patterns: Elements of Reusable Object-Oriented Software, Addison-Wesley Publishing Company, 1995.
