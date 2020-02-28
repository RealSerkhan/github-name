package app.Enculaption;

public class SwapApp {
    public static void Swap(int i,int j){
        int c=i;
        i=j;
        j=c;
        System.out.print(i+",");
        System.out.println(j);
    }

    public static void main(String[] args) {
        Box box = new Box();
        Box box1 = new Box();
        int i=6;
        int j=7;
        Swap(i,j);
        Swap(box, box1);
        System.out.println(box.a);

    }

    private static void Swap(Box box, Box box1) {
        box.a=4;
    }
}
