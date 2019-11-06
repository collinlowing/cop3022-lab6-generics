# Generics Lab

## Outcomes
* Students have created a generic class
* Students have instantiated a realized instance of a generic class

## Description
ArrayLists have a lot of methods available.
Let's assume that we want to offer users of our container class only a subset of those methods, specifically: `add`, `get`, and `min`.
Additionally, we want the class to hold no more than 20 elements.

Note that extending the ArrayList class would leave all methods in our class (one of the beautiful things about inheritance), so rather than extending ArrayList, we'll simply want to have an instance variable that is an ArrayList.
That way, our class can limit control in any way we choose.

## Tasks
* Create some tests for the class, for example:
	* Test calling `add` on the 21st element (remember we only want to support up to 20 items).
	* Test calling `get` beyond the index of the last element (should throw exception or display output).
	* Test `min` function.
	* Be sure to utilize at least two different object types to populate it (String and Integer, for example).
* Create a MyArrayList generic class
	* Create `add` and `get` methods that work on whatever class type is used to instantiate the MyArrayList.
		* Be sure to handle out-of-bounds conditions from your test cases.
	* Create a `min` function that returns the minimum element in the list.