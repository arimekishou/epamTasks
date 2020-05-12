package Tasks1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LineProgramm1 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        float z = (((float)a - 3) *(float) b / 2) + (float) c;
        System.out.println(z);
    }
}
