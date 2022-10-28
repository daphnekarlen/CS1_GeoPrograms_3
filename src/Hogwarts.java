public class Hogwarts extends World{

    public void go() {
        plane.isTrail = true;
        plane.pausetime=0;

        int choose = plane.random(1,4);
        if (choose==1){
            house();
        }
        if (choose==2){
            tree();
        }
        if(choose==3){
            roadSign();
        }
    }


    public void pickhouse(int x){
        if (x == 1) {
            house();
        }
    }
    public void picktree(int x){
        if(x==10){
            tree();
        }
    }
    public void pickroadSign(int x){
        if(x==20){
            roadSign();
        }
    }

    public void house(){
        plane.startingAngle(0);
        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.setColor(plane.random(100,250),plane.random(100,250), plane.random(1,250));
        plane.teleport(100,500);
        plane.move(150);
        plane.turn(120);
        plane.move(150);
        plane.turn(120);
        plane.move(150);

        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.move(200);
        plane.turn(90);
        plane.move(150);
        plane.turn(90);
        plane.move(200);

        plane.teleport(160,570);
        plane.move(40);
        plane.turn(90);
        plane.move(40);
        plane.turn(90);
        plane.move(40);
        plane.turn(90);
        plane.move(40);

        plane.teleport(190,570);
        plane.move(40);
        plane.turn(90);
        plane.move(40);
        plane.turn(90);
        plane.move(40);
        plane.turn(90);
        plane.move(40);

        plane.teleport(160,640);
        plane.startingAngle(90);
        plane.move(60);
        plane.turn(90);
        plane.move(40);
        plane.turn(90);
        plane.move(60);
        plane.turn(90);
        plane.move(40);
    }

    public void tree(){
        plane.startingAngle(90);
        plane.teleport(400,500);
        plane.setColor(102,51,0);
        plane.move(200);
        plane.turn(90);
        plane.move(50);
        plane.turn(90);
        plane.move(200);
        plane.turn(90);
        plane.move(50);

        plane.setColor(0,100,0);
        plane.turn(320);
        plane.move(60);
        plane.turn(320);
        plane.move(60);
        plane.turn(320);
        plane.move(60);
        plane.turn(320);
        plane.move(60);
        plane.turn(320);
        plane.move(60);
        plane.turn(320);
        plane.move(60);
        plane.turn(320);
        plane.move(60);
        plane.turn(320);
        plane.move(60);

    }

    public void roadSign(){
        plane.startingAngle(90);
        plane.teleport(700,500);
        plane.setColor(0,0,0);
        plane.move(200);
        plane.teleport(800,500);
        plane.move(200);
        plane.startingAngle(0);
        plane.setColor(0,0,100);
        plane.teleport(650,400);
        plane.move(200);
        plane.turn(270);
        plane.move(100);
        plane.turn(270);
        plane.move(200);
        plane.turn(270);
        plane.move(100);
    }










    public void pickShape(int x){
        if(x==1){
            square();
        }
        if(x==1){
            tri();
        }
    }



    public void letter(int length){
        plane.teleport(100,100);
        plane.startingAngle(90);
        plane.move(length*20);
        plane.turn(135);
        plane.move(length*5);
        plane.turn(45);
        plane.move(length*12);
        plane.turn(45);
        plane.move(length*5);

    }

    public void first(){
        plane.teleport(600,400);
        plane.move(100);
    }

    public void second(){
        plane.teleport(200,400);
        plane.square(100);
    }

    public void third(){
        plane.teleport(200,200);
        plane.triangle(100);

    }


    public void tri(){

        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.setColor(45, 110, 80);
        plane.move(150);
        plane.turn(120);
        plane.setColor(0, 0, 0);
        plane.move(150);
        plane.turn(120);
        plane.setColor(0, 80, 200);
        plane.move(150);
    }

    public void square(){
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.setColor(45, 110, 80);
        plane.move(150);
        plane.turn(90);
        plane.setColor(60, 20, 100);
        plane.move(150);
        plane.turn(90);
        plane.setColor(0, 80, 200);
        plane.move(150);
        plane.turn(90);
        plane.setColor(0, 80, 200);
        plane.move(150);
    }


    public void mySquare(int length, int width){
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.setColor(0, 0, 0);
        plane.move(length*2);
        plane.turn(90);
        plane.setColor(0, 0, 0);
        plane.move(width);
        plane.turn(90);
        plane.setColor(0, 0, 0);
        plane.move(length*2);
        plane.turn(90);
        plane.setColor(0, 0, 0);
        plane.move(width);

    }


}
