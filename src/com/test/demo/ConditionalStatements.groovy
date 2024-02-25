package com.test.demo

//to check number is positive or not
def num = 0

if(num > 0){
    println "num is positive"
}
else if(num == 0){
    println "num is zero"
}
else{
    println "num is -ve"
}

//switch-case


def x = -10
def result = ""

switch (x){
    case 0:
        result = "x is zero"
        break
    case {x > 0}:
        result = "x is +ve"
        break
    case {x < 0}:
        result = "x is -ve"
        break
//    default:
//        result = ""
//        break
}

println "$result";