public class ProvaCondizioni {

    public static void main(String[] args) {

        // esempio 1
        int x = 30;
        int y = 30;

        System.out.println(x == y);

        
        // esempio 2
        int r = 20;
        int u = 30;

        System.out.println(r != u);

        // esempio 3
        int a = 20;
        int b = 30;

        System.out.println(a > b);

        //operatori logici








        //prova if

            int o = 20;
            int l = 18;
            if ( o > l){
                System.out.println("o è maggiore di l");
            }

            //prova if else

            int time = 20;
                if (time < 18) {
                System.out.println("Good day.");
                } else {
                System.out.println("Good evening."); 
                }
        

            //prova else if

            int time2 = 22;
            if (time2 < 10) {
            System.out.println("Good morning.");
            } else if (time < 18) {
            System.out.println("Good day.");
            } else {
            System.out.println("Good evening.");
            }

            //prova swithc

            int day = 4;

            switch (day) {
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;} 
}
}