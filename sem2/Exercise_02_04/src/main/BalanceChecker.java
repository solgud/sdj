package main;

import utility.collection.ArrayStack;
import utility.collection.StackADT;

public class BalanceChecker {

  private static StackADT<Character> stack = new ArrayStack<Character>();

  /*
   * Write a program that reads in a sequence of characters, and determines whether its parentheses,
   * braces, and curly braces are "balanced." Hint: for left delimiters, push onto a stack; for
   * right delimiters, pop from stack and check whether popped element matches right delimiter.
   */

  public static boolean check(String string) {

    char[] items = string.toCharArray(); // use a char array (could use String methods instead)
    int count = 0;
    while (count < items.length) {

      char currentItem = items[count];

      if (currentItem == '{' || currentItem == '(' || currentItem == '[') {
        stack.push(currentItem);
      }
      // Begin checking for matches
      // Note: probably lots of more efficient ways to do this
      // Unicode value checking could be an intriguing choice
      if (currentItem == '}') {
        if (stack.pop() != '{') {
          return false;
        }
      }
      if (currentItem == ')') {
        if (stack.pop() != '(') {
          return false;
        }
      }
      if (currentItem == ']') {
        if (stack.pop() != '[') {
          return false;
        }
      }
      count++;
    }
    return stack.isEmpty() ? true : false; // If stack is empty, return true, otherwise return false
  }


}
