import java.util.ArrayList;

public class NewCSTimer {
    public static void main(String[] args) {
        Scramble scramble = new Scramble();
        Timer timer = new Timer();
        Average average = new Average();
        ArrayList<Double> time = null;
        try {
            time = new ArrayList<>();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        int i = 1;

        while (true) {
            scramble.scramble();
            timer.timer();
            System.out.print(i + ": ");
            time.add(timer.getTempo());

            average.MO3(time);
            average.AO5(time);
            average.AO12(time);
            i++;
        }
    }
}
