package com.principle.ocp;

public class test1 {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new Other());
    }
}

class GraphicEditor{
    public void drawShape(Shape s){
        s.draw();
    }
}

abstract class Shape{
    int type;
    public abstract void draw();
}

class Rectangle extends Shape{
    Rectangle(){
        super.type = 1;
    }

    @Override
    public void draw() {
        System.out.println("rectangle");
    }
}

class Circle extends Shape{
    Circle(){
        super.type = 2;
    }

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

class Triangle extends Shape{
    Triangle(){
        super.type = 3;
    }

    @Override
    public void draw() {
        System.out.println("Triangle");
    }
}

class Other extends Shape{
    Other(){
        super.type=4;
    }

    @Override
    public void draw() {
        System.out.println("Other");
    }
}