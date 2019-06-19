package rover;

import java.util.LinkedList;

public class NorthRover extends Rover {

    public NorthRover(){
        super("^");
    }

    public EastRover turn(){
        return new EastRover();
    }

    public void move(LinkedList<SurfaceObject> surface){
        if(surface.indexOf(this)>14) {
            int positionToGo = surface.indexOf(this) - 15;
            SurfaceObject placeToGo = surface.get(positionToGo);
            placeToGo.move(surface, this);
        }
    }
}
