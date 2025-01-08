package Practicum7;

import java.util.ArrayList;

public class StringProcessor{
    private ArrayList<OpmaakProces> processor;

    public StringProcessor() {
        processor = new ArrayList<>();
    }

    public String verwerk(String input) {
        String result = input;
        for (OpmaakProces proces : processor) {
            result = proces.maakOp(result);
        }
        return result;
    }

    public void voegProcesToe(OpmaakProces proces) {
        processor.add(proces);
    }
}
