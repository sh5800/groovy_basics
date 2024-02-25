package com.test.demo

class Methods2 {
    static void main(String[] args) {
        Methods2 obj = new Methods2();
        def sum = obj.sum(5,10)
        println sum
    }

    def sum(int a, int b){
        return a + b;
    }
}
