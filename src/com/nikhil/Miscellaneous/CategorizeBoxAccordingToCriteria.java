package com.nikhil.Miscellaneous;

public class CategorizeBoxAccordingToCriteria {
    public static void main(String[] args) {
        int length = 2909; int width = 3968; int height = 3272; int mass = 727;
        String ans = category(length, width, height, mass);
        System.out.println(ans);
    }

    public static String category(int length, int width, int height, int mass){
        String ansBulky = "";
        String ansHeavy = "";
        String ans = "";
        
        if(length >= 10000 || width >= 10000 || height >= 10000 || (long)length*width*height >= 1000000000){
            ansBulky = "" + "Bulky";
            ans = "" + "Bulky";
        }

        if(mass >= 100){
            ansHeavy= "" + "Heavy";
            ans = "" + "heavy";
        }

        if(ansHeavy.equalsIgnoreCase("Heavy") && ansBulky.equalsIgnoreCase("Bulky")){
            ans = "" + "Both";
        }

        if(ansHeavy.isEmpty() && ansBulky.isEmpty()){
            ans = "" + "Neither";
        }

        if(ansHeavy.isEmpty() && ansBulky.equalsIgnoreCase("Bulky")){
            ans = "" + "Bulky";
        }

        if(ansHeavy.equalsIgnoreCase("Heavy") && ansBulky.isEmpty()){
            ans = "" + "Heavy";
        }

        return ans;
    }
}
