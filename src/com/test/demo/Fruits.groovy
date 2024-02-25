package com.test.demo

class Fruits {
    private def fruitName
    private def fruitColor

    def getFruitName() {
        return fruitName
    }

    void setFruitName(fruitName) {
        this.fruitName = fruitName
    }

    def getFruitColor() {
        return fruitColor
    }

    void setFruitColor(fruitColor) {
        this.fruitColor = fruitColor
    }

    static void main(String[] args) {

        Fruits f = new Fruits();
        f.setFruitColor("Red")
        f.setFruitName("Apple")

        println f.getFruitColor()
        println f.getFruitName()
    }
}
