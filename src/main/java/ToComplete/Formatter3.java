package ToComplete;

public class Formatter3 implements Formatter {
    @Override
    public String changeApp(String a) {
        StringBuilder stringBuilder = new StringBuilder();
        a=a.toUpperCase();
        String b;
        for (int i=0;i<a.length()+4;i++){
            stringBuilder.append("*");

        }
        b=stringBuilder.toString();
        stringBuilder.append(String.format("\n* %s *\n%s",a,b));
        return stringBuilder.toString();



    }
}
