# design-pattern-tutorial

Types of design pattern

* Creation
* Structural
* Behavioral

Creation
Ways to create a object

* Singleton Pattern
* Builder Pattern
* Prototype Pattern
* Factory Method Pattern
* Abstract Factory Pattern

Singleton Pattern:

Concept
* Only one instance created.
* Guarantees control of the resources.
* Ability of lazy load.
* Logger, Spring Bean are by default singleton.
Design
* Class is responsible for lifecycle
* Static in nature
* needs to be thread safe
* Private instance
* Private Constructor

Builder Pattern

Concept
* To make it immutable
* To Reduce the complixity of constructor.
* Have a static Builder class to build the object.
* final variable in the parent class to make it immutable 

Prototype Pattern

If a object is costly to create but we can get around by coping the member variable of the object we can use prototype

Concept
* avoid costly creation
* avoid subclassing
* typically doesn’t use new
* often utilised an interface
* usually implemented with with a registry
* Shallow Vs Deep Copy

Factory Method Pattern

Its opposite of Singleton having Common Interface but Concrete Classes

Concept
* Doesn't exposes instantiation logic
* Defer to subclass (Defer business logic to subclasses)
* Common interface
* Specified by architecture, implemented by user
* Example
    * Calander
    * ResourceBundel
    * NumberFormat

Abstract Factory

Concept
* Factory of Factory
* Factory of related objects
* Common Interface
* Defer business logic to subclasses like factory pattern 


