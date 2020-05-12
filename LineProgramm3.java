package Tasks1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения): 𝑠𝑖𝑛𝑥+𝑐𝑜𝑠𝑦/𝑐𝑜𝑠𝑥−𝑠𝑖𝑛𝑦∗𝑡𝑔 𝑥𝑦

public class LineProgramm3 {
    public static void  main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float x = Integer.parseInt(reader.readLine());
        float y = Integer.parseInt(reader.readLine());

        double z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y));
        double d = Math.tan(x*y);
        double a = z * d;
        System.out.println(a);
    }
}
