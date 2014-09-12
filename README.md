Project-Euler
=============

A showcase of all the problems I have solved on Project Euler

I got introduced to Project Euler by a friend. After checking it out I thought it will be worthwhile doing the problems as Mathematics and Computer Science do complement each other well. 

I hope to be introduced to a variety of mathematic principles which will help me develop efficient solutions to the problems. Also, to use them in the long term in my studies and beyond. 

Here is a link to Project Euler: https://projecteuler.net/about

Any further information which I may add will be posted in this section of the README file. Below I will provide the link to the problems and comments about how I got along and any improvements I want to make or have made.

///////////////////////////////////////////////////////////////////////////////////////////////

Problem 1: Multiples of 3 and 5

Link to problem: http://projecteuler.net/problem=1

Comments -

This problem was simple to solve and didn’t take a long time to find the answer (1ms). I can't see how I could improve my solution any further.

Overall, a good problem to get the ball rolling!

///////////////////////////////////////////////////////////////////////////////////////////////

Problem 2: Even Fibonacci numbers

Link to problem: https://projecteuler.net/problem=2

Comments -

This problem was again very enjoyable and didn’t take long to solve (2ms). I don’t think I can improve it any further. It already computes the answer pretty fast.

Overall, another problem solved easily.

///////////////////////////////////////////////////////////////////////////////////////////////

Problem 3: Largest prime factor

Link to problem: https://projecteuler.net/problem=3

Comments -

This problem was a bit more of a challenge then the previous two. I set about finding an algorithm to solve the solution. I came across the Sieve of Eratosthenes, but the problem was the number I wanted to find out the answer to was too large (600851475143) to fit into memory. So I then looked at the Sieve of Sorenson which is slower but a more space-efficient sieve. The problem with the Sieve of Sorenson was that it was a bit too complex for me to implement. So I settled with a method I had used in school, integer factorization. It served me well and I used same idea as the user called xisk on the following post to implement my solution:

http://math.stackexchange.com/questions/389675/largest-prime-factor-of-600851475143

Overall, it was a tricky problem to solve as I wanted something efficient but I was unable to implement it, my current solution takes about 20ms to solve. I definitely think I can make further improvements to bring down the time taken to solve the problem by implementing the Sieve of Sorenson, which I may look into the future.

///////////////////////////////////////////////////////////////////////////////////////////////
