import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("first");
        list.add("second");
        list.add("third");

        for(int i=0; i < list.size(); i++) {
            Object element = list.get(i);
        }
        String str = list.toString();
        str = str.replaceAll("[\\[\\]]", "");
        for(int i=0; i < list.size(); i++) {
            String element = (String) list.get(i);
            System.out.print("Transacoes:\n"+element+". "+str);
        }



    }
}