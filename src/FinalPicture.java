public class FinalPicture extends World {

    public int red;
    public int blue;
    public int green;


    public void go() {
        plane.isTrail=true;
        plane.pausetime=0;
        plane.showBackGround();
        Sun();
        Houses();
        treeFire();
        littleTreeFire();

    }

    public void Sun(){
        plane.trailWidth=1;
        plane.setColor(255,255,0);
        plane.teleport(800,100);
        plane.fillCircle(100);
        plane.trailWidth=10;
        plane.fillCircle(10);

    }


    public void Houses() {
        plane.teleport(100,500);
        plane.setColor(200,50,200);
        for(int row=100; row<800; row=row+400){
                plane.teleport(row, 600);
                plane.house(180);

        }

    }

    public void treeFire(){

        for (int row = 130; row < 444; row = row + 1) {
            for(int col=80; col<489; col=col+1){
                plane.teleport(col,row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

                if(blue<100 && red<80 && green<100){
                plane.setPixelColor(255,127,0);
                }
            }


    }
}

public void littleTreeFire(){
        for(int row=218; row<354; row++){
            for(int col=690; col<870; col++){
                plane.teleport(col,row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();


                if(blue<140 && red<120 && green <160){
                    plane.setPixelColor(255,127,0);
                }

            }
        }

}





}








