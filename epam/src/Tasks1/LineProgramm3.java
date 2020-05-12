package Tasks1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LineProgramm3 {
    public static void  main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float a = Integer.parseInt(reader.readLine());
        float b = Integer.parseInt(reader.readLine());
        float c = Integer.parseInt(reader.readLine());

        double z = ((b + Math.sqrt(b * b + 4 * a * c))) / (2 * a);
        double y = (Math.pow(a, 3) * c) + Math.pow(b, -2);
        double x = z - y;
        System.out.println(x);
    }
}
