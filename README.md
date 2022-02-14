# PS This is my way of quickly remembering my design patterns.

> #CAUTION: Make your own cheat sheet

## Strategy Pattern
+ Make my related algorithms come from one manageable trackable interface
+ Client decides which strategy to implement
+ Reduce Chained Inheritances
+ Change or extend my algorithms without really affecting the structure of the client/input
  
  
## Observer Pattern
+ Enable my subscibable Object to send update notifications to registered subscribers as decided by external functions calling the update function
+ Reduce any form of polling
+ Make it easy to pass data to any new objects that depend on data from another object
+ Use in scenarios where many objects depend on one object for some data
## Factory Pattern
+ Create a factory to create objects based on some conditions
+ The resulting objects have diffente fields or method logic
+ Use for scenarios where there's some repeated logic in object creation