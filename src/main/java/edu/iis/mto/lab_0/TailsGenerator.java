package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {

        if (value == null) {
            return new ArrayList<>(0);
        }
        ArrayList<String> tails = new ArrayList<>();
        for (int i = 0; i < value.length(); i++) {
            String tail = value.substring(i);
            tails.add(tail);
        }
        tails.add("");

        return tails;
    }

}
