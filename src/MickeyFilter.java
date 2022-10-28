public class MickeyFilter extends World {
    public int red; // variable of type int(eger)
    public int blue;
    public int green;

    public void go() {
        System.out.println("This will be printed to the  window. ");
        plane.teleport(0, 0);
        plane.showBackGround(); // method that shows a picture (file name found on line 12 of RunMyProgram)
        filter();
    }


    public void filter() {
        for (int row = 500; row < 680; row = row + 1) { //rows
            for (int col = 50; col < 430; col = col + 1) { //columns
                plane.teleport(col, row);
                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                // if color is yellow, change to pink
                if (blue < 100 && red > 200 && green > 190) {
                    plane.setPixelColor(255, 192, 203);
                }

            }

        } // end of shoe filter
        for (int row = 233; row < 270; row = row + 1) {
            for(int col=250; col<310; col=col+1){
                plane.teleport(col,row);
                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

                if (blue<130 && red<110 && green<130){
                    plane.setPixelColor(227, 28, 121);

                }

            }

        }

    }
}
