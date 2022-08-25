### Interface Function<T,R>

##### T - the type of the input to the function
R - the type of the result of the function

```java
static Function<Integer, Integer> incrementByOneFunction
        = number -> number +1;
```
#### same as 
```java
static int incrementByOne(int number){
        return number +1;
    }
```

##### To call the function 
```java
        int n1 = incrementByOne(1);
        System.out.println(n1);
        
        // Using Function Interface
        int n2 = incrementByOneFunction.apply(11);
        System.out.println(n2);
```