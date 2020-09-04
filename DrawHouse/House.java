
import gpdraw.*;
import java.awt.Color;
public class House
{
    private DrawingTool myPencil;
    private SketchPad myPaper;
    
    public House()
    {
        myPaper = new SketchPad(500, 500);
        myPencil = new DrawingTool(myPaper);
    }
    
    public void draw()
    {
        // This makes the house walls
        myPencil.up();
        myPencil.backward(100);
        myPencil.down();
        myPencil.turnRight(90);
        myPencil.forward(200);
        myPencil.turnLeft(90);
        myPencil.forward(200);
        myPencil.turnLeft(90);
        myPencil.forward(400);
        myPencil.turnLeft(90);
        myPencil.forward(200);
        myPencil.turnLeft(90);
        myPencil.forward(200);
        // Roof
        myPencil.up();
        myPencil.move(0,200);
        myPencil.down();
        myPencil.setDirection(333.435);
        myPencil.forward(223.607);
        myPencil.setColor(new Color(2, 0, 0));
        myPencil.up();
        myPencil.move(0,200);
        myPencil.setDirection(206.565);
        myPencil.down();
        myPencil.forward(223.607);
        // Windows
        myPencil.up();
        myPencil.move(-150,0);
        myPencil.setDirection(0);
        myPencil.down();
        myPencil.forward(75);
        myPencil.turnLeft(90);
        myPencil.forward(75);
        myPencil.turnLeft(90);
        myPencil.forward(75);
        myPencil.turnLeft(90);
        myPencil.forward(75);
        myPencil.up();
        myPencil.move(75,0);
        myPencil.setDirection(0);
        myPencil.down();
        myPencil.forward(75);
        myPencil.turnLeft(90);
        myPencil.forward(75);
        myPencil.turnLeft(90);
        myPencil.forward(75);
        myPencil.turnLeft(90);
        myPencil.forward(75);
        myPencil.up();
        myPencil.move(-50,-100);
        myPencil.setDirection(0);
        myPencil.down();
        myPencil.forward(75);
        myPencil.turnLeft(90);
        myPencil.forward(100);
        myPencil.turnLeft(90);
        myPencil.forward(50);
        myPencil.turnLeft(90);
        myPencil.forward(100);
        myPencil.up();
        myPencil.move(-50,-100);
        myPencil.setDirection(60);
        myPencil.down();
        myPencil.backward(150);
        myPencil.up();
        myPencil.move(50,-100);
        myPencil.setDirection(120);
        myPencil.down();
        myPencil.backward(150);
        myPencil.up();
        myPencil.move(150,-150);
        myPencil.down();
        myPencil.drawCircle(25);
        myPencil.up();
        myPencil.move(-150,-150);
        myPencil.down();
        myPencil.drawCircle(25);
        myPencil.up();
        myPencil.move(-150,-175);
        myPencil.setDirection(90);
        myPencil.down();
        myPencil.backward(20);
        myPencil.up();
        myPencil.move(150,-175);
        myPencil.setDirection(90);
        myPencil.down();
        myPencil.backward(20);
        myPencil.up();
        myPencil.move(-150,37.5);
        myPencil.setDirection(0);
        myPencil.down();
        myPencil.forward(75);
        myPencil.up();
        myPencil.move(75,37.5);
        myPencil.setDirection(0);
        myPencil.down();
        myPencil.forward(75);
        myPencil.up();
        myPencil.move(-112.5,0);
        myPencil.setDirection(90);
        myPencil.down();
        myPencil.forward(75);
        myPencil.up();
        myPencil.move(112.5,0);
        myPencil.setDirection(90);
        myPencil.down();
        myPencil.forward(75);
        // House Sidewalk
        myPencil.up();
        myPencil.move(-250,-112.5);
        myPencil.setDirection(0);
        myPencil.down();
        myPencil.forward(192.5);
        myPencil.up();
        myPencil.move(250,-112.5);
        myPencil.setDirection(180);
        myPencil.down();
        myPencil.forward(192.5);
        myPencil.up();
        myPencil.move(-250,-100);
        myPencil.setDirection(0);
        myPencil.down();
        myPencil.forward(90);
        myPencil.forward(193);
        myPencil.up();
        myPencil.move(250,-100);
        myPencil.setDirection(180);
        myPencil.down();
        myPencil.forward(90);
        myPencil.up();
        myPencil.move(-75,-100);
        myPencil.setDirection(240);
        myPencil.down();
        myPencil.forward(15);
        myPencil.up();
        myPencil.move(-100,-100);
        myPencil.setDirection(240);
        myPencil.down();
        myPencil.forward(15);
        myPencil.up();
        myPencil.move(-125,-100);
        myPencil.setDirection(240);
        myPencil.down();
        myPencil.forward(15);
        myPencil.up();
        myPencil.move(-150,-100);
        myPencil.setDirection(240);
        myPencil.down();
        myPencil.forward(15);
        myPencil.up();
        myPencil.move(-175,-100);
        myPencil.setDirection(240);
        myPencil.down();
        myPencil.forward(15);
        myPencil.up();
        myPencil.move(-200,-100);
        myPencil.setDirection(240);
        myPencil.down();
        myPencil.forward(15);
        myPencil.up();
        myPencil.move(-225,-100);
        myPencil.setDirection(240);
        myPencil.down();
        myPencil.forward(15);
        myPencil.up();
        myPencil.move(-250,-100);
        myPencil.setDirection(240);
        myPencil.down();
        myPencil.forward(15);
        myPencil.up();
        myPencil.move(75,-100);
        myPencil.setDirection(240);
        myPencil.down();
        myPencil.forward(15);
        myPencil.up();
        myPencil.move(100,-100);
        myPencil.setDirection(240);
        myPencil.down();
        myPencil.forward(15);
        myPencil.up();
        myPencil.move(125,-100);
        myPencil.setDirection(240);
        myPencil.down();
        myPencil.forward(15);
        myPencil.up();
        myPencil.move(150,-100);
        myPencil.setDirection(240);
        myPencil.down();
        myPencil.forward(15);
        myPencil.up();
        myPencil.move(175,-100);
        myPencil.setDirection(240);
        myPencil.down();
        myPencil.forward(15);
        myPencil.up();
        myPencil.move(200,-100);
        myPencil.setDirection(240);
        myPencil.down();
        myPencil.forward(15);
        myPencil.up();
        myPencil.move(225,-100);
        myPencil.setDirection(240);
        myPencil.down();
        myPencil.forward(15);
        myPencil.up();
        myPencil.move(250,-100);
        myPencil.setDirection(240);
        myPencil.down();
        myPencil.forward(15);
        // Chimney
        myPencil.up();
        myPencil.move(125,190);
        myPencil.setDirection(270);
        myPencil.down();
        myPencil.forward(52);
        myPencil.up();
        myPencil.move(100,190);
        myPencil.setDirection(270);
        myPencil.down();
        myPencil.forward(40);
        myPencil.up();
        myPencil.move(100,190);
        myPencil.setDirection(0);
        myPencil.down();
        myPencil.forward(25);
        // Door window
        myPencil.up();
        myPencil.move(0,-25);
        myPencil.setDirection(0);
        myPencil.down();
        myPencil.drawCircle(8);
        myPencil.up();
        myPencil.move(-8,-25);
        myPencil.setDirection(0);
        myPencil.down();
        myPencil.forward(16);
        myPencil.up();
        myPencil.move(0,-17);
        myPencil.setDirection(270);
        myPencil.down();
        myPencil.forward(16);
        // Door knob
        myPencil.up();
        myPencil.move(14,-55);
        myPencil.setDirection(0);
        myPencil.down();
        myPencil.drawCircle(2);
    }

}