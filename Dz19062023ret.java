package homeworks;

public class Dz19062023ret {
    // delta = 40 * (((d2^2 / 4) * 3.14) - ((d1^2 / 4) * 3.14))
    // где d2 и d1 пиццы диаметрами 28 и 24 см соответственно
    // умножение, степень, сумма, деление, вычитание
    //    neg,      pow,    sum,    div,     sub
    // для решения задачи методом return придется представить формулу
    // задачи в следующем виде
    // delta = (40 * ((d2^2 / 4) * 3.14)) - (40 * ((d1^2 / 4) * 3.14))
    // разделим на 2 части
    // delta = l2 - l1
    // где l2 = 40 * ((d2^2 / 4) * 3.14; l1 = 40 * ((d1^2 / 4) * 3.14;
    // следовательно для данного метода решения задачи эти
    // формулы можно представить в следующем виде
    // l2 = neg2s(neg2(div2(pow2(d2))))
    // l1 = neg1s(neg1(div1(pow1(d1))))



    public double result4s;

    public Dz19062023ret(double d2) {

        result4s = neg2s(neg2(div2(pow2(d2))));
        printResult();

    }

    public double pow2(double d2) {
        return Math.pow(d2, 2);
    }

    public double div2(double p){
        return p / 4;
    }

    public double neg2(double l){
        return Math.PI * l;
    }

    public double neg2s(double m){
        return m * 40;
    }

    public void printResult() {
        System.out.println(result4s);
    }

}
