import java.util.Random;

public class DirectionOfRotation {
    public String direction;

    public void randomDirection(){
        Random rng = new Random();
        int Y = rng.nextInt(3)+1;
        switch (Y) {
            case 1:
                direction = " ";
                break;
            case 2:
                direction = "' ";
                break;
            case 3:
                direction = "2 ";
                break;
        }
    }
}
