package OOP.EnumExample;


public class Basic {

    // All the enums explicitly extends java.lang.enum class, therefore enums can't extend antthing else. Becuz multiple inheritence are not supported by java.
    // But enums can implement interfaces.
    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        //     These are enum constants.
        //     These all are public, static and final.
        //     Since its final, you can't create child enums.
        //     There type is Week

        Week(){
            System.out.println("Constructor is called for: " + this);

            // this is not public or protected, so only private or default.
            // why?? -> becuz we dont want to create new objects.
            // And this is not the enum concept, that's why.
            // internally: public static final Week Monday = new Week();
            

        }

        public void hello(){
            System.out.println("Hey, how are you?");
        }
    }

    public static void main(String[] args) {

        Week week;
        week = Week.Monday;

        for(Week day: Week.values()){
            System.out.println(day);
        }

        System.out.println(week.ordinal());

        System.out.println(Week.valueOf("Monday"));

        week.hello();
    }
}
