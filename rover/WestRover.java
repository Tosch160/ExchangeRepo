package rover;

import java.util.LinkedList;

public class WestRover extends Rover {

    public WestRover(){
        super("<");
    }

    public NorthRover turn(){
        return new NorthRover();
    }

    public void move(LinkedList<SurfaceObject> surface){
        if(surface.indexOf(this)%15 >= 1) {
            int positionToGo = surface.indexOf(this) - 1;
            SurfaceObject placeToGo = surface.get(positionToGo);
            placeToGo.move(surface, this);
        }
    }
}
