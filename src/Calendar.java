import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Calendar {
    private BufferedReader reader;
    private List<String> list = new ArrayList<String>();

    public Calendar() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String read() throws IOException {
        return reader.readLine();
    }

    public void write(String message) {
        System.out.println(message);
    }

    public void createList () throws IOException {
        String str = read();
        String[] arr = str.split(".");
       list = Arrays.asList(arr);
    }
}
