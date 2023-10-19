# Lab: Determine if a Poker Hand is Flush

## MVP
Your task is to determine if a poker hand is flush, meaning if the five cards in the hand are of the same suit.

Copy over the start code from `c12_coursenotes` to your `bnta_work` directory and take some time to read the tests and the existing code.

Your method will be passed a list/array of 5 strings, each representing a poker card in the format `"5H"`, meaning the 5 of Hearts. Each element in the list/array will represent each card with the value of the card followed by the inital of its suit (`H`earts, `S`pades, `C`lubs, `D`iamonds). No jokers included.

Your function should return `true` if the hand is a flush, `false` otherwise.

Possible card values are `2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A`.

Examples:

```
["10H", "KH", "3H", "8H", "QH"] // true
["AS", "6D", "10S", "JC", "2H"] // false
```

- Create a solution that passes all tests.

## Extensions
- Refactor your code. There are many different ways to solve this problem, try to create a different solution!
- If you enjoyed solving this problem, try CodeWars (codewars.io)! CodeWars is an application that allows us to practise solving algorithmic style problems. One of the best parts of CodeWars is the ability to see how others have solved the problem before you.
