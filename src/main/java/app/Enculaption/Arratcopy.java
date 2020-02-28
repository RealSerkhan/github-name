package app.Enculaption;




public class Arratcopy {

    public static void main(String[] args) {
        int array1[]={9,4,2,6,3,7};
        int array2[]=new int[5];
        System.arraycopy(array1, 1, array2, 0, 4);
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Dizi'nin "+i+". eleamanı: "+array2[i]);
        }
    }

}
