package homeworks;
//    result4 = neg1s(neg1(div1(pow1(d1))));

public class Dz19062023ret2 {
    public double result4;

    public Dz19062023ret2(double d1) {

        result4 =  neg1s(neg1(div1(pow1(d1))));
        printResult();

    }

    public double pow1(double d1) {
        return Math.pow(d1, 2);
    }

    public double div1(double o){
        return o / 4;
    }

    public double neg1(double k){
        return Math.PI * k;
    }

    public double neg1s(double n){
        return n * 40;
    }

    public void printResult() {
        System.out.println(result4);
    }























}
