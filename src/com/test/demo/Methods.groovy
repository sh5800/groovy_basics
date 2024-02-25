package com.test.demo

def printHello(){
    println "Hello....."
}

printHello()

def sum(int a , int b = 20){
    println "Sum is " + (a+b)
}

sum(5)

def sub(int a, int b){
    return a - b
}

def result = sub(10,5)
println result