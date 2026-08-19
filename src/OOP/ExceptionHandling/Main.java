package OOP.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b =0;
        try{
            // divide(a, b);

            // // mimicing
            // throw new Exception("just doing it for fun");

            String name = "Nikhil";
            if(name.equals("Nikhil")){
                throw new MyException("Name is Nikhil");
            }
        }
        catch(MyException e){
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("Normal exception");
        }finally{
            System.out.println("No matter what, it will always run.");
        }
        
    }

    static int divide(int a, int b)throws Exception{
        if(b == 0){
            throw new Exception("please do not divide with zero.");
        }
        return a/b;
    }
}
