package edu.dmacc.codedsm.hw6;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class StringCombiner {
    public static void main(String[] args) {

        String father = "Papa";
        String son = "Fils";
        String family = setFamily(father, son);
        System.out.println( family);
        System.out.println("To day is " + outputDate());

        String familyDate = setFamily(family,outputDate());
        System.out.println(familyDate);

    }

    public static String setFamily(String strA, String strB ){

        return strA + " " + strB;
    }

    public static String outputDate (){

        SimpleDateFormat format = new SimpleDateFormat("dd MMMM yyyy");
        return format.format(Date.from(Instant.now()));
    }

}

