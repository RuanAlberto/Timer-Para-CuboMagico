import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class Average {
    BestAverage bestAverage = new BestAverage();
    DecimalFormat df = new DecimalFormat("0.00");
    ArrayList<Double> mo3 = new ArrayList<>();
    ArrayList<Double> ao5 = new ArrayList<>();
    ArrayList<Double> ao12 = new ArrayList<>();

    private double aOFive;
    private double mOthree;
    private double aOTwelve;

    public double getMOthree() {
        return this.mOthree;
    }

    public void setmOthree(double mOthree) {
        this.mOthree = mOthree;
    }

    public double getaOFive() {
        return this.aOFive;
    }

    public void setaOFive(double aOFive) {
        this.aOFive = aOFive;
    }

    public double getaOTwelve() {
        return this.aOTwelve;
    }

    public void setaOTwelve(double aOTwelve) {
        this.aOTwelve = aOTwelve;
    }

    public void MO3(ArrayList<Double> tempos) {

        if (tempos.size() >= 3) {
            double[]lastThree = new double[3];

            for (int i = 0; i < 3; i++){
                lastThree[i] = tempos.get(tempos.size()-(i + 1));
            }

            mOthree = (lastThree[0] + lastThree[1] + lastThree[2]) / 3;

            setmOthree(mOthree);
            System.out.println("MO3 atual: " + df.format(getMOthree()));

            mo3.add(getMOthree());
            bestAverage.bestAverage(mo3, "MO3");

        }
    }

    public void AO5(ArrayList<Double> tempos) {

        if (tempos.size() >= 5) {
            double[]lastFive = new double[5];

            for (int i = 0; i < 5; i++){
                lastFive[i] = tempos.get(tempos.size()-(i + 1));
            }

            Arrays.sort(lastFive);
            aOFive = (lastFive[1] + lastFive[2] + lastFive[3]) / 3;

            setaOFive(aOFive);
            System.out.println("AO5 atual: " + df.format(getaOFive()));

            ao5.add(getaOFive());
            bestAverage.bestAverage(ao5, "AO5");
        }
    }
    public void AO12(ArrayList<Double> tempos) {

        if (tempos.size() >= 12) {
            double[]lastTwelve = new double[12];

            for (int i = 0; i < 12; i++){
                lastTwelve[i] = tempos.get(tempos.size()-(i + 1));
            }
            Arrays.sort(lastTwelve);

            aOTwelve = (lastTwelve[2] + lastTwelve[3] + lastTwelve[4] + lastTwelve[5] + lastTwelve[6]
                    + lastTwelve[7] + lastTwelve[8] + lastTwelve[9]) / 8;

            setaOTwelve(aOTwelve);
            System.out.println("AO12 atual: " + df.format(getaOTwelve()));

            ao12.add(getaOTwelve());
            bestAverage.bestAverage(ao12, "AO12");
        }
    }
}
