package rover;

import java.util.LinkedList;

public class SouthRover extends Rover{
    public SouthRover(){
        super("v");
    }

    public WestRover turn(){
        return new WestRover();
    }

    public void move(LinkedList<SurfaceObject> surface){
        if(surface.indexOf(this) < 90) {
            int positionToGo = surface.indexOf(this) + 15;
            SurfaceObject placeToGo = surface.get(positionToGo);
            placeToGo.move(surface, this);
        }
    }
}
