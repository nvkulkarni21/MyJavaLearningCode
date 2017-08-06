/**
 * Created by user on 7/30/2017.
 */
import java.lang.*;
import java.util.Locale;
import java.util.regex.Matcher;

public class CryptoProject {

    public static String normalizeText(String sVal){
        String sNormal;
        sNormal = sVal.toUpperCase().replaceAll("[ ,.:;'\"!?()]","");

        return sNormal;
    }

    public static String obifyText(String sVal){
        String sObify = "";
        System.out.println(sVal.length());
        //String sObify = sVal.replaceAll("[AEIOUY]", Matcher.quoteReplacement("OB"));
        for (int i = 0 ; i < sVal.length() ; i++){
            char s = sVal.charAt(i);

            if  (s != 'A' && s != 'E' && s != 'I' && s != 'O' && s != 'U' && s != 'Y')
            {
                //System.out.println("Char vlaue " + s);
                sObify   = sObify + s ;
            }
            else if  (s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U' || s == 'Y'){
                sObify = sObify + "OB" + s;
            }
        }
        return sObify;
    }

    public static String unObifyText(String sVal){

        String sunObify = sVal.replace("OB","");
        return sunObify;
    }

    public static String Caesarify(String sEncrypt, int iKey) {

        //int s = (int) 'A';
        String sCaesarified = "";
        for(int i=0 ; i < sEncrypt.length() ; i++){
            char s = sEncrypt.charAt(i);
            int iS = (int) s;
            if (iKey > 0) {
                int iVal = iS + iKey;
                char iStr = (char) iVal;

                if (iVal > (int) 'Z'){
                    iVal = (iVal - (int) 'Z') + (int) 'A' - 1;
                    iStr = (char) iVal;
                }
                sCaesarified = sCaesarified + iStr;
                    //System.out.println("Value of each character \"" + s + "\" before iKey is : " + iS);
                    //System.out.println("Value of each character \"" + s + "\" after iKey is : " + iStr);

            }
            else if (iKey < 0 ){
                int iVal = iS + iKey;
                char iStr = (char) iVal;

                if (iVal < (int)'A'){
                    iVal = -( (int) 'A' - iVal ) + (int) 'Z' + 1;
                    iStr = (char) iVal;
                }
                sCaesarified = sCaesarified + iStr;
            }

        }
        return sCaesarified;
    }

    public static String groupify(String sString , int iVal){

        int iCount = 0;
        String sFinalStr = "";
        while(iCount <= sString.length()){
            System.out.println(iCount);
            for(int i = iCount; i <= iVal ; i++){
                String sStr = sString.substring(i,iVal-1);
                sFinalStr = sStr + " ";
                //System.out.println(sFinalStr);
            }

            iCount += iVal;
        }

        return "";
    }




    public static void main(String[] args) {
        String snormalizeVal = normalizeText("This  is some \"really\" great. (Text)!?");
        System.out.println("Normalized word is : " + snormalizeVal);
        String sobifyText = obifyText(snormalizeVal);
        System.out.println("Obified text is : " + sobifyText);
        String sunobifyText = unObifyText(sobifyText);
        System.out.println("Un-Obified text is : " + sunobifyText );
        String sEncrypt = Caesarify("ILIKEZOOS",+1);
        System.out.println("Changed string : " + sEncrypt);
        String sgroupify = groupify("Niraj",'2');
        System.out.println("Groupified String  : " + sgroupify);
    }
}