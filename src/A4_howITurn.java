

public class A4_howITurn extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(45, 110, 80);
        plane.move(150);
        plane.turn(120);
        plane.setColor(60, 20, 100);
        plane.move(150);
        plane.turn(120);
        plane.setColor(0, 80, 200);
        plane.move(150);

    }


}
