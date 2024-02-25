package com.test.demo

//Arithmetic operators
//Normal arithmetic operators
//assert  1  + 2 == 3
//assert  4  - 3 == 1
//assert  3  * 5 == 15
//assert  3  / 2 == 1.5
//assert 10  % 3 == 1
//assert  2 ** 3 == 8
//assert 9.intdiv(5) == 1
//assert 2.2 .plus(1.1) == 3.3
//
////Unary operators
//assert +3 == 3
//assert -4 == 0-4
//assert -(-1) == 1
//
////Increment and Decrement
//def a = 2
//def b = a++ * 3
//
//assert a == 3 && b == 6
//
//def c = 3
//def d = c-- * 2
//
//assert c == 2 && d == 6
//
//def e = 1
//def f = ++e + 3
//
//assert e == 2 && f == 5
//
//def g = 4
//def h = --g + 1
//
//assert g == 3 && h == 4

//Assignment operators
//def a = 4
//a += 3
//
//assert a == 7
//
//def b = 5
//b -= 3
//
//assert b == 2
//
//def c = 5
//c *= 3
//
//assert c == 15
//
//def d = 10
//d /= 2
//
//assert d == 5
//
//def e = 10
//e %= 3
//
//assert e == 1
//
//def f = 3
//f **= 2
//
//assert f == 9

//Assignment operators
assert 1 + 2 == 3
assert 3 != 4

assert -2 < 3
assert 2 <= 2
assert 3 <= 4

assert 5 > 1
assert 5 >= -2

//Logical operators
assert !false
assert true && true
assert true || false

//Logical operator precedence
assert (!false && false) == false // ! <- && <- ||
assert true || true && false

//Bitwise operators
//int a = 20
//int b = 25
//println (a & b)
//
//println Integer.toBinaryString(20)
//println Integer.toBinaryString(25)
//
//println Integer.parseInt("10000",2)

//Conditional Operators
assert (!true)    == false
assert (!'foo')   == false
assert (!'')      == true

//Ternary operator
output1 = (1>2) ? "1 is greater" : "1 is not greater"
println output1