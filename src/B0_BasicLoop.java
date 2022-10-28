public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.isTrail = true;
        plane.pausetime = 1;
        plane.trailWidth=20;
        squareGrid();
    }

    public void squareGrid(){
        for (int row = 0; row < 8; row = row + 1) {
            squareRow(row);
        }
    }

    public void squareRow(int row){

        plane.pausetime=0;
        plane.isTrail=true;
        for(int col=0;col<10;col=col+1) {
            plane.setColor(row*25,100,col*20);
            plane.teleport(col*100,row*100);
            System.out.println(col);
            plane.square(50);

        }
    }

}
