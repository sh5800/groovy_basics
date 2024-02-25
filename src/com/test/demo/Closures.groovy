package com.test.demo

def str = "Hello"

def myClosure = {name -> println "$str ${name}"}

myClosure.call("Shreyash")

def myMethod(clos){
    clos.call("Groovy")
}

myMethod(myClosure)

def myClosure2 = {
    a,b,c -> return a+b+c;
}

def result = myClosure2.call(1,2,3)
println result

def myList1 = ["Apples","Oranges","Grapes"]
println myList1.each {it }


def myMap = ['subject' : 'groovy',
                                      'topic': 'closures'
                                      ]
println myMap.each {it}

def myList = [1,2,3,4,5]

println myList.find(item -> item == 3)
println myList.findAll(item -> item > 3)
println myList.any(item -> item > 3)
println myList.every(item -> item > 3)
println myList.collect(item -> item*2)
