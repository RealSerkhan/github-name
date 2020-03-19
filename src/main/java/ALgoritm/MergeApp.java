//package ALgoritm;
//
//import java.util.Arrays;
//import java.util.Random;
//
//public class MergeApp {
//  public static void main(String[] args) {
//    int[] data1 = new Random().ints(10, 30).limit(20).sorted().toArray();
//    int[] data2 = new Random().ints(10, 30).limit(20).sorted().toArray();
//    int[] data3 = merge(data1, data2);
//    System.out.println(Arrays.toString(data1));
//    System.out.println(Arrays.toString(data2));
//    System.out.println(Arrays.toString(data3));
//  }
//
//  private static int[] merge(int[] data1, int[] data2) {
//    int size = data1.length;
//    int size2 = data2.length;
//////    int in1=0,in2=0;
////    int[] result = new int[size+size2];
////    for (int i = 0; i < size + size2 -1; i++) {
////      for (int j = 1; j <size+size2-1 ; j++) {
////        if(data1[i]>data2[j]){
////          result[i]=data1[i];
////        }
////        else {
////          result[i]=data2[j];
////        }
////
////      }
////    }
//
//    return result;
//  }
//}
