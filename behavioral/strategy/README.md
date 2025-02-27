# Strategy Design Pattern
These examples are about Strategy design pattern. It's a part of Behavioral design pattern.
In strategy design pattern, there is a STRATEGY as an interface. There are some CONCRETE STRATEGIES, inherit the STRATEGY. 
The STRATEGY contains only the definations, but the CONCRETE STRATEGIES hold the complete implementation.
There is a CONTEXT, which has a private CONCRETE STRATEGY. CONTEXT takes CONCRETE STRATEGIES from main function and executes these CONCRETE STRATEGIES.

<img src="../../images\STRATEGY-1.png" width="50%" />