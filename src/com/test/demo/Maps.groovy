package com.test.demo

def employee = ['name':'Shreyash',
                                             'age':40
                                             ]
println employee
println employee.name
println employee['name']
println employee.get('age')
println employee.getAt('age')

println employee.size()

employee.put('city','Mumbai')
println employee

println employee.containsKey('city')
println employee.containsValue('Mumbai')

println employee.getClass()

def emp2 = employee.clone()
println emp2

employee.each {key,value ->
    println "$key : $value"
}

employee.eachWithIndex{ key,value,i ->
    println "$i | $key : $value"
}

employee.eachWithIndex {entry,i ->
    println "$i | $entry.key : $entry.value"
}

employee.clear()
println employee