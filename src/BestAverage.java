import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

public class BestAverage {
    DecimalFormat df = new DecimalFormat("0.00");

    public void bestAverage(ArrayList<Double> medias, String type) {
        if (medias.size() >= 1) {
            for (int i = 0; i < 1; i++) {
                Collections.sort(medias);
                System.out.println("Melhor " + type + ": " + df.format(medias.getFirst()));
                System.out.println(" ");
            }
        }
    }
}
