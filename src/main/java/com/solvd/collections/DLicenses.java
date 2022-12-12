package collections;

import java.util.HashSet;
import java.util.Iterator;

public class DLicenses {
    public static void main(String args[]){
        //Creating HashSet and adding elements
        HashSet<String> DLicensesSet=new HashSet<String>();
        DLicensesSet.add("A");
        DLicensesSet.add("B");
        DLicensesSet.add("C");
        DLicensesSet.add("D");
        DLicensesSet.add("BE");
        DLicensesSet.add("CE");
        //Traversing elements
        Iterator<String> itr= DLicensesSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
