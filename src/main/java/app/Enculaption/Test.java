package app.Enculaption;




        import java.util.Arrays;
        import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner rs=new Scanner(System.in);
        int b=rs.nextInt();
        int c=rs.nextInt();

        int f=0;
        int j=0;

        int[][] arr=new int[b][c];
        for (int i=0;i<b;i++){
            int d=0;
            int e=0;



            for (;j<c;j++){
                if(i==d || i==b-1 || j==c-1 || j==0){
                    arr[i][j]=1;

                }
                else if (i==1+f || i==b-2-f || j==c-2-d || j==c-d-e){
                    arr[i][j]=2+f;
                    d++;
                    e++;



                }

//                if (j=1-d)


            }
            f++;
            if(j==c-d-e)
            {j++;}

        }
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
