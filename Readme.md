# Concurrency, Threading and Synchronization

## Topics
* Concurrency: the art of doing several things at the same time
* Implementing patterns 
* race condition, synchronization, volatility
* visibility, false sharing, happens-before

#### Race Condition Definition
Accessing data concurrently may lead to issue!

It means that two different threads are trying to read and write 
the same variable at the same time.

#### Synchronization
Prevents a block of code to be executed by more than one thread
at the same time.

#### Deadlock
A deadlock is a situation where a thread ${T_1} holds a key needed
by a thread ${T_2}, and the ${T_2} holds the key needed by ${T_1}.

#### Runnable Pattern
1. create an instance of Runnable
2. pass it to the constructor of the Thread class
3. call start() method of this thread object 
