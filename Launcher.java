/**
 * Created by Casper on 07/11/2016.
 */
public class Launcher {


    public static void main(String[] args) {

        ArrayList myList = new ArrayList();

        myList.add(8);

        int j = Integer.parseInt(myList.get(1).getReturnValue().toString());

        int k = j + 5;

        Object[] w = new Object[3];

        w[0] = new ReturnObjectImpl('e');




    }

}
