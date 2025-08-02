import java.util.Random;

public class Scramble {
    DirectionOfRotation DoF = new DirectionOfRotation();
    Random random = new Random();
    char randomMove;
    int[] move = new int[23];


    public void scramble() {
        int i = 2;
        while (i < 23) {
            int numberRNG = random.nextInt(6) + 1;
            move[i] = numberRNG;
            if (move[i] % 2 == 0 && move[i] != move[i - 1]) {
                if (move[i - 1] + 1 != move[i - 2]) {
                    i++;
                }

            } else if (move[i] % 2 != 0 && move[i] != move[i - 1]) {
                if (move[i - 1] - 1 != move[i - 2]) {
                    i++;
                }
            }
        }


        int I = 2;
        while (I < 23) {
            switch (move[I]) {
                case 1:
                    randomMove = 'F';
                    DoF.randomDirection();
                    System.out.print(randomMove + DoF.direction);
                    break;
                case 2:
                    randomMove = 'B';
                    DoF.randomDirection();
                    System.out.print(randomMove + DoF.direction);
                    break;
                case 3:
                    randomMove = 'R';
                    DoF.randomDirection();
                    System.out.print(randomMove + DoF.direction);
                    break;
                case 4:
                    randomMove = 'L';
                    DoF.randomDirection();
                    System.out.print(randomMove + DoF.direction);
                    break;
                case 5:
                    randomMove = 'U';
                    DoF.randomDirection();
                    System.out.print(randomMove + DoF.direction);
                    break;
                case 6:
                    randomMove = 'D';
                    DoF.randomDirection();
                    System.out.print(randomMove + DoF.direction);
                    break;
            }
            I++;
        }
    }
}