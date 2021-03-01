package pl.lublin.wsei.java.cwiczenia;

public class Zad7h {
    public static void tabelka(int rozmiar) {
        int arg = 1;
        int log;
        int sum = 0;

        System.out.println("arg\t\tlog2(arg)\t\tsum(arg)");
        for (int i = 1; i < rozmiar; i++) {
            if (i == 1) {
                log = log2(arg);
                sum += arg;
                System.out.println(arg + "\t\t " + log + "\t\t\t" + sum);
            }
            arg *= 2;
            log = log2(arg);
            sum += arg;
            System.out.println(arg + "\t\t " + log + "\t\t\t" + sum);

        }
        System.out.println();
    }
    public static int log2(int N) {
        int result = (int) (Math.log(N) / Math.log(2));
        return result;
    }
}

