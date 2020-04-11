package com.zhoushuiping.principle.ocp.improve;

public class Ocp {
    public static void main(String[] args) {

        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
    }
}

class GraphicEditor{

    public void drawShape(Shape shape){
        shape.draw();

    }
}

abstract  class Shape{


    public abstract  void draw();
}

class  Rectangle extends Shape{

    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape{

    public void draw() {
        System.out.println("绘制圆形");
    }
}