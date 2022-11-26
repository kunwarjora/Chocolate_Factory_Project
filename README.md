# Chocolate_Factory_Project
In this assessment, we developed the Chocolate factory with three design patterns:
1. Factory Design pattern
2. Decorator Design pattern
3. Chain of Responsibility Design pattern

The program asks the user to choose the shape, flavour and quantity of the chocolates. 

Factory design pattern is used to craft different shapes of chocolates, Shape interface is implemented by all the 5 shapes and overriden the craft method of interface Shape. Then a Factory class is created which return the Shape objects with getShape method, this getShape() method is then called in the main class after user selects the shape of chocolate.

Decorator design pattern is used to select the flavour of chocolate. FlavourDecorator abstract class the made with protected shape object and implements interface shape. Different flavour classes is created extending FlavourDecorator class with the private method of setFlavour().

Chain of Responsibility design pattern is used to give the orders of chocolate to one of the three different chocolate factory, large, medium and small based on the quantity of chocolates.

### Output Screenshot:
<img width="479" alt="DP_project" src="https://user-images.githubusercontent.com/112961351/204103839-90eb1efb-a732-439b-b070-6ab865c585c7.png">
