package Assignment.pigLatin;

//import sun.plugin2.message.JavaScriptCallMessage;

import java.util.Scanner;

/**
 * Created by 44020369 on 10/17/2017.
 */
public class PigLatin {

    public static void main(String a[]){
        System.out.println("Welcome to PigLatin Translator\n");

        PigLatin pigOb = new PigLatin();
        //String text = pigOb.textInput();
        pigOb.translate(pigOb.textInput());
    }

    String textInput(){
        System.out.println("Enter your text to translate ");
        Scanner scob = new Scanner(System.in);
        String textInput = scob.nextLine();
        return textInput;

    }

    public static VowelIndex vowelIndex(String s){

        String vowelCap = "AEIOU";
        String vowelSmall = "aeiou";
        for(int i = 0 ; i <= s.length()-1; i ++){

            if(vowelCap.contains(String.valueOf(s.charAt(i)))){
                return new VowelIndex(i,'c');
            }
            else if (vowelSmall.contains(String.valueOf(s.charAt(i)))){
                return new VowelIndex(i,'s');
            }

        }
        return new VowelIndex(-1,'s');
    }
    void translate(String text){
        String outputText="Code failure. Please check.";
        String vowel = "AEIOUaeiou";

        //if (text.charAt(0) == 'A' || text.charAt(0) == 'E' || text.charAt(0) == 'O' || text.charAt(0) == 'I' || text.charAt(0) == 'U'){
        if ( vowel.indexOf(text.charAt(0)) != -1   ){
            System.out.println(text);
            System.out.println("Case 1 : word starts with a vowel.");
            if (Character.isUpperCase(text.charAt(text.length()-1)) == true) {
                outputText = text + "WAY";
            }
            else if(Character.isUpperCase(text.charAt(text.length()-1)) == false){
                outputText = text + "way";
            }
        }
        else if ( vowel.indexOf(text.charAt(0)) == -1 && (text.indexOf("Y") != -1 || text.indexOf("y") != -1 )){
            System.out.println("Case 2 : Word starts with a consonant, and has Y in the word");

            int yIndex=0;
            if (text.indexOf("Y") != -1){
                yIndex=text.indexOf("Y");
            }
            else if (text.indexOf("y") != -1){
                yIndex=text.indexOf("y");
            }

            String befY = text.substring(0,yIndex);

            String aftY = text.substring(befY.length(),text.length()) ;
            System.out.println("Text before Y : " + befY);
            System.out.println("Text after Y : " + aftY);
            String textNew = aftY + befY;
            if (Character.isUpperCase(textNew.charAt(textNew.length()-1)) == true){
                outputText = textNew + "AY";
            }
            else if (Character.isUpperCase(textNew.charAt(textNew.length()-1)) == false) {
                outputText = textNew + "ay";
            }
        }

        else if ( vowel.indexOf(text.charAt(0)) == -1 && text.matches(".*[AEIOUaeiou].*") == false){
            System.out.println("Case 3 : Starts with a consonant and as no vowel or Y in it.");
            if (Character.isUpperCase(text.charAt(text.length()-1)) == true) {
                outputText = text + "AY";
            }
            else if(Character.isUpperCase(text.charAt(text.length()-1)) == false){
                outputText = text + "ay";
            }
        }
        else if ( vowel.indexOf(text.charAt(0)) == -1 && text.matches(".*[AEIOUaeiou].*") == true){
            System.out.println("Case 4: Start with consonant and has a vowel in it.");

            VowelIndex vowelIndexobj = vowelIndex(text);
            int indexval = VowelIndex.getIndexVal();
            char caseVal = VowelIndex.getCaseVal();

            String bef = text.substring(0,indexval);
            String aft = text.substring(bef.length(),text.length()) ;

            System.out.println("Text before vowel : " + bef);
            System.out.println("Text after vowel : " + aft);

            String textNew = aft + bef;
            if (caseVal == 'c' || Character.isUpperCase(textNew.charAt(textNew.length()-1)) == true  ){
                outputText = textNew + "AY";
            }
            else if (caseVal == 's'  || Character.isUpperCase(textNew.charAt(textNew.length()-1)) == false) {
                outputText = textNew + "ay";
            }
        }
        System.out.println(outputText);


    }

}