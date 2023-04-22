public class Students {
    static String fname;
    static String lname;
    static int age;


    Students(String fname, String lname, int age) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        //introduction();

    }

    public static void introduction() {
        System.out.print("first name:" + fname + "\nlast name:  " + lname + "\nage  :" + age);

    }
}
