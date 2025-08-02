import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Timer {

    private double tempo;

    public double getTempo() {
        return this.tempo;
    }

    public void setTempo(double sec, double mili) {
        mili = mili / 100;
        this.tempo = sec + mili;
    }

    public void timer() {

        int[] tempo = {0, 0};

        Scanner sc = new Scanner(System.in);

        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

        System.out.print("\naperte 'Enter' para iniciar o cronometro:");

        String comando = sc.nextLine();
        if (comando.isEmpty()) {
            executor.scheduleAtFixedRate(() -> {
                tempo[0]++;
                if (tempo[0] == 100) {
                    tempo[0] = 0;
                    tempo[1]++;
                }
            }, 0, 10, TimeUnit.MILLISECONDS);
        }
        System.out.print("Resolvendo... ");
        String comando2 = sc.nextLine();
        if (comando2.isEmpty()) {
            setTempo(tempo[1], tempo[0]);
            System.out.println(getTempo());
            System.out.println(" ");
        }
    }
}