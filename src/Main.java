import java.util.Arrays;

class Main {
    static Students classmembers[]  = new Students[4];

     static void createArray(){


    classmembers[0]=new Students("brian","motari",99);
    classmembers[1]=new Students("joseph","theuri",21);
    classmembers[2]=new Students("eddie","muhia",20);
    classmembers[3]=new Students("kodo","austin",25);

}
    public static void main(String[] args) {
        createArray();
        for (int i=0;i<4;i++){
            classmembers[i].introduction();
        }

    }
}