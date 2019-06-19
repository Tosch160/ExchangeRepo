package rover;

import java.util.LinkedList;

public class EastRover extends Rover {

    public EastRover(){
        super(">");
    }

    public void move(LinkedList<SurfaceObject> surface){
        if(surface.indexOf(this)%15 < 14) {
            int positionToGo = surface.indexOf(this) + 1;
            SurfaceObject placeToGo = surface.get(positionToGo);
            placeToGo.move(surface, this);
        }
    }

    public SouthRover turn(){
        return new SouthRover();
    }
}
