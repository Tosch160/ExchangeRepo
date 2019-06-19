package rover;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.LinkedList;

public class Map {

    private LinkedList<SurfaceObject> surface = new LinkedList<SurfaceObject>();

    public Map(){
        //Map has 105 Elements, 7 Rows, with 15 Elements each
        for (int i = 0; i < 105; i++) {
            surface.add(new SurfaceObject());
        }
        surface.set(52, new NorthRover());
    }

    public void print(PrintStream out){
        int i = 1;
        for (SurfaceObject shape : surface) {
            shape.print(out);
            i = this.linebreak(out,i);
        }
        linebreak(out,0);
    }

    private int linebreak(PrintStream out, int i){
        if(i%15 == 0){
            out.println();
        }
        return i=i+1;
    }

    public void move(){
        Iterator<SurfaceObject> iterator = surface.iterator();
        SurfaceObject temporary = surface.getFirst();
        while(iterator.hasNext() && !(temporary instanceof Rover)){
            temporary = iterator.next();
        }
        Rover rover = (Rover) temporary;
        rover.move(surface);
    }

    public void turn(){
        Iterator<SurfaceObject> iterator = surface.iterator();
        SurfaceObject temporary = surface.getFirst();
        while(iterator.hasNext() && !(temporary instanceof Rover)){
            temporary = iterator.next();
        }
        Rover rover = (Rover) temporary;
        surface.set(surface.indexOf(temporary),rover.turn());
    }
}
