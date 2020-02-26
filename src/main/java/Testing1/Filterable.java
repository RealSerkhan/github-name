package Testing1;

public class Filterable implements Iclass {
    public  String filter(String origin) {
        String a="aeiou";

//        origin = origin.replaceAll("[AaEeIiOoUu]", "");
//        origin=origin.toLowerCase();
//        return origin;
        origin=origin.toLowerCase();

        StringBuilder rs=new StringBuilder();
        char[] ch=origin.toCharArray();
        for (int i=0;i<origin.length();i++){


            if (origin.charAt(i) != 'a' && origin.charAt(i) != 'e' && origin.charAt(i) != 'i' && origin.charAt(i) != 'o' && origin.charAt(i) != 'u') {
                rs.append(origin.charAt(i));
            }
        }
        return rs.toString();

    }
//        StringBuilder rs=new StringBuilder();
//        for (int i=0;i<origin.length();i++){
//
//            if (a.contains(origin.charAt(i))){
//                rs.append(origin.charAt(i));
//            }
//
//            }
//        return rs.toString();
//        }

}
