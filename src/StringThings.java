public class StringThings {
    public static void main(String[] args){
        exerciseOne();
        exerciseTwo();
        exerciseThree();
        System.out.print(exerciseFour("test"));
        exerciseFive();
        exerciseSix();
        exerciseSeven("hello", "hola");
        System.out.print(exerciseEight(7, 12));
        exerciseNine();
    }
    public static void exerciseOne(){
        System.out.print("Roman alphabet: ");
        for (char c = 'A'; c<= 'Z'; c++) {
            System.out.print(c);
        }
        System.out.println();
    }
    public static void exerciseTwo(){
        System.out.print("Greek alphabet: ");
        for (int i = 913; i <= 937; i++) {
            System.out.print((char) i);
        }
        System.out.println();
    }
    public static void exerciseThree() {
        String text = "Computer Science is fun!";
        text = text.replace("Computer Science", "CS");
        System.out.print(text);
        System.out.println();
    }
    public static String exerciseFour(String s){
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r = r + s.charAt(i);
        }
        return r;
    }
    public static void exerciseFive(){
        String fruit = "apples";
        System.out.println();
        System.out.print(fruit.substring(0, 3));
        System.out.print(fruit.substring(3, 5));
        System.out.print(fruit.substring(6, 6));
        System.out.println();

    }
    public static void exerciseSix(){
        String fruit = "banana";
        int index = fruit.indexOf('a');
        System.out.println(index);
    }
    public static void exerciseSeven(String name1, String name2) {
        int diff = name1.compareTo(name2);
        if (diff == 0) {
            System.out.println("The names are the same.");
        } else if (diff < 0) {
            System.out.println("name1 comes before name2.");
        } else if (diff > 0) {
            System.out.println("name2 comes before name1.");
        }
    }
    public static String exerciseEight(int hour, int minute) {
        String ampm;
        if (hour < 12) {
            ampm = "AM";
            if (hour == 0) {
                hour = 12; //midnight
            }
        } else {
            ampm = "PM";
            hour = hour - 12;
        }
        return String.format("%02d:%02d %s", hour, minute, ampm);
    }
    public static void exerciseNine() {
        System.out.println();
        String str = "12345";
        int num = Integer.parseInt(str);
        System.out.println(num);

        str = Integer.toString(num);
        System.out.println(str);
    }
}
