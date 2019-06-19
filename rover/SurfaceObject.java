package rover;

import java.io.PrintStream;
import java.util.LinkedList;

public class SurfaceObject {
    private String shape;

    public SurfaceObject(){
        if(Math.random()<0.25){
            shape = "#";
            return;
        }
        shape = " ";
    }

    public SurfaceObject(String shape){
        this.shape = shape;
    }

    public void print(PrintStream out){
        out.print(shape);
    }

    public void move(LinkedList<SurfaceObject> surface, Rover rover){
        if(shape.equals(" ")){
            int oldPositionRover = surface.indexOf(rover);
            surface.set(surface.indexOf(this),rover);
            surface.set(oldPositionRover, new SurfaceObject(" "));
        }
    }

}
