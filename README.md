# designpattern
## singleton
#### only one instance for container
that instance shold not take arguments  
not over use this becouse hard to unit test (no instacevariales, no refereces)  
example:: logger , db connection  

## factory
this takes arguments  
user dont know which intace you gonna get (which subInstace you gonna get)  
user may know the higher class(Interface or absracrt or concreat classes), but don't now what are the other classes that are implemented or inherted  
based on argumants you will be switched

**example..........  
 Animal (abstract class) & Cat, Dog, Shark, Owl, Seahorse (concreat classes)  
 Category (abstract class) can hold set of animals & addAnimals (abstract method in constructor)  
 Mammals, Fishes, Birds (concreat classes) so each holds few animals  
 CategoryFactory (class) just switch createCategory(switch argument)**