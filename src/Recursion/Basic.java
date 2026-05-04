package Recursion;
public class Basic {

    static void reach_home(int src, int dest){

        System.out.println("Source: " + src + "   " + "Destination: " + dest);
        if(src==dest){
            System.out.println("pahuch gya");
            return;
        }
        src++;
        reach_home(src, dest);
    }
    public static void main(String[] args) {
        int src = 0;
        int dest = 10;
        reach_home(src, dest);    
    }
}
