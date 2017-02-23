/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

import becker.robots.City;
import becker.robots.Direction;
import static becker.robots.Direction.EAST;
import static becker.robots.Direction.NORTH;
import static becker.robots.Direction.WEST;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author nate
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates a city named kw
        City kw = new City();
        //creates aa new robot named bob
             Robot steve = new Robot(kw, 4, 0, Direction.EAST);
             //building the mountain
        new Wall(kw, 4, 2, WEST);
        new Wall(kw, 4, 2, NORTH);
        new Wall(kw, 3, 3, WEST);
        new Wall(kw, 3, 3, NORTH);
        new Wall(kw, 2, 4, WEST);
        new Wall(kw, 2, 4, NORTH);
        new Wall(kw, 2, 5, NORTH);
        new Wall(kw, 2, 5, EAST);
        new Wall(kw, 3, 6, NORTH);
        new Wall(kw, 3, 6, EAST);
        new Wall(kw, 4, 7, NORTH);
        new Wall(kw, 4, 7, EAST);
        //the things
        new Thing(kw, 4, 1);
        new Thing(kw, 3, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 1, 4);
        //goes up the mountain picking up the things
        steve.move();
        steve.pickThing();
        steve.turnLeft();
        steve.move();
        steve.turnLeft();
        steve.turnLeft();
        steve.turnLeft();
        steve.move();
        steve.pickThing();
        steve.turnLeft();
        steve.move();
        steve.turnLeft();
        steve.turnLeft();
        steve.turnLeft();
        steve.move();
        steve.pickThing();
        steve.turnLeft();
        steve.move();
        steve.turnLeft();
        steve.turnLeft();
        steve.turnLeft();
        steve.move();
        steve.pickThing();
        //runs down the mountain and places the things
        steve.move();
        steve.putThing();
        steve.move();
        steve.turnLeft();
        steve.turnLeft();
        steve.turnLeft();
        steve.move();
        steve.putThing();
        steve.turnLeft();
        steve.move();
        steve.turnLeft();
        steve.turnLeft();
        steve.turnLeft();
        steve.move();
        steve.putThing();
        steve.turnLeft();
        steve.move(); 
        steve.turnLeft();
        steve.turnLeft();
        steve.turnLeft();
        steve.move();
        steve.putThing();
        steve.turnLeft();
        steve.move();   
    }
    
}