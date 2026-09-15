package com.nikhil.DsaPatterns.SlidingWindow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DestinationCity {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> paths = new ArrayList<>();

        paths.add(new ArrayList<>(List.of("London", "New York")));
        paths.add(new ArrayList<>(List.of("New York", "Lima")));
        paths.add(new ArrayList<>(List.of("Lima", "Sao Paulo")));

        String ans = city(paths);
        System.out.println(ans);

    }

    public static String city(ArrayList<ArrayList<String>> paths){

        HashSet<String> dest = new HashSet<>();

        for (int i = 0; i < paths.size(); i++) {
            dest.add(paths.get(i).get(0));
        }

        for (int j = 0; j < paths.size(); j++) {

            String finalDest = paths.get(j).get(1);

            if (!dest.contains(finalDest)) {
                
                return finalDest;
            }
        }
    
        return "";

    }
}
