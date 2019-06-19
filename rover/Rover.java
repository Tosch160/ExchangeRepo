package rover;

import java.util.LinkedList;

public abstract class Rover extends SurfaceObject {
    public Rover(String shape){
        super(shape);
    }

    public abstract void move(LinkedList<SurfaceObject> surface);
    public abstract Rover turn();
}
