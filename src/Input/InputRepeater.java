package Input;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputRepeater implements Checker {
    public String userMessage;
    Object data;

    public InputRepeater(String message) {
        this.userMessage = message;
    }

    public void inputRepeater() throws Exception {
        while (true) {
            System.out.println(userMessage);
            read();
        }
    }

    @Override
    public boolean check(Object value) {
        return value instanceof Integer;
    }

    public void read() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        data = reader.read();
        check(data);
    }
}
