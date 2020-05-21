# designpattern
## singleton
#### only one instance for container
that instance shold not take arguments  
not over use this becouse hard to unit test (no instacevariales, no refereces)  
example:: logger , db connection  

## factory
this takes arguments  
user dont know which intace he gonna get (which subInstace)  
user may know the higher class(Interface or absracrt classes), but don't now what are the other classes that are implemented or inherted  
based on argumants you will be switched

**example..........  
 Animal (abstract class) & Cat, Dog, Shark, Owl, Seahorse (concreat classes)  
 Category (abstract class) can hold set of animals & addAnimals (abstract method in constructor)  
 Mammals, Fishes, Birds (concreat classes) so implement addAnimals() here wich automatically calls by parent constructor  
 CategoryFactory (class) just switch createCategory(switch argument)**

## prototype
### not going through expensive initializaint process
### we also have teplate obiject and registory so use that ?? 
not use new keyword (if constructor is big .. )  
first time create next time just clone it.  
exaple:: when serching items you need to display 1000s of items .. yap just clone it  
  
shallow copy:::: obj2 = obj1 (yap 1 obj, 2 reference) so obj2.i=3 will effect the real obiject  
deep copy:::: obj2.i = obj1.i (yap mannually assign values till each immulable obj)  
clone:::: Obiject has protected clone() method inorder to use override & implements Cloneable (security purpose)  

## builder
### Avoid Telescoping constructors so evoiding pass parameter as null valuse
### Avoid setters so ensure the immutabillity of obiject
static inner class used (Bulder) with same veriables & has method :: Car build()  
till call build() method, outher methods will return builder obiject so we can append ...  

```
class Car{
    int x;
    Car(Builder builder){
        this.x = bulder.x;
    }
    static class Builder{
        int x;
        Car build() {
            return new Car(this);
        }
        Builder x(int x){
            this.x = x;
            return this;
        }
    }
}

to call .......
Car.Builder builder = new Car.Builder();
Car car = builder.x(10).build();
```
