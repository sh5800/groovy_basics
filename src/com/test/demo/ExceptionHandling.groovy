package com.test.demo

try{
    int i  = 1/1
}catch(ArithmeticException ae){
    println "Inside Arithmetic exception"
}catch (Exception e){
    println "I am inside exception block"
    println e.getCause()
    println e.getMessage()
//    println e.printStackTrace()
}finally {  //executed without catch
    println "Inside finally block"
}

println "Another set of code"
