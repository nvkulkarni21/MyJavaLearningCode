package Assignment.fuzzyMatch;


public class FuzzyLogic {

    private String str1;
    private String str2;
    int lens1,lens2;
    //initialize total possible score and current score
    int currScore = 0,totalscore = 0;

    public FuzzyLogic(String s1, String s2) {
        this.str1 = s1;
        this.str2 = s2;

        lens1 = s1.length();
        lens2 = s2.length();
        System.out.println("Niraj S1 len :" + lens1);
        System.out.println("Niraj S2 len :" + lens2);
    }

    public int fuzzyProgram(String str1, String str2){

        int fuzzyPer=0;

        System.out.println("Niraj 1");

        //int totScore = 0;

        /***  normalize the text ***/
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        /***  give 100% match if the complete texts matches ***/

        if (str1.equals(str2)){
            return fuzzyPer = 1;
        }

        /*** Give 0% match if string length < 2 ***/

        if (lens1 < 2){
            return fuzzyPer = 0;
        }
        /**Search for single characters **/
        fuzzAlg1(str1,str2,currScore,totalscore);
        if (lens1 < lens2 ){
            fuzzAlg1(str2,str1,currScore,totalscore);
        }

        /**Search for pairs, triplets etc. **/
        fuzzAlg2(str1,str2,currScore,totalscore);
        if (lens1 < lens2 ){
            fuzzAlg2(str2,str1,currScore,totalscore);
        }

        System.out.println("Niraj 2 , currScore : " + currScore + " totalscore :  " + totalscore);
        return (fuzzyPer = (currScore/totalscore)) ;
    }

    public void fuzzAlg1(String s1, String s2,  int currscore,int totalscore ){

        int intPos = 0,startPos = 0;
        totalscore = totalscore + lens1;
        System.out.println("Niraj 2");
        for (int i = 1 ; i < lens1 ; i ++){
            startPos = intPos + 1;
            //String sub = s1.substring(i,i+1);
            intPos  = s2.indexOf(s1.substring(i,i+1));
            if (intPos > 0 ){
                if (intPos > startPos + 3){
                    intPos = startPos;
                }
                else {
                    currscore = currscore + 1;
                }
            }
            else {
                intPos = startPos;
            }
        }
    }

    public void fuzzAlg2(String s1, String s2, int currscore,int totalscore ) {
        String strwork;
        int intTo,intPos;
        System.out.println("Niraj 3");
        for (int i = 2 ; i < lens1 ; i ++){
            strwork = s2;
            intTo = lens1 - i + 1 ;
            totalscore = totalscore + (lens1/i);
            for (int j = 1 ; j  < intTo ; j=j+i ){
                //String sub = s1.substring(j,j+i);
                intPos  = strwork.indexOf(s1.substring(j,j+j+i));
                if (intPos > 0){
                    //String sub = strwork.substring(intPos,j+j+i);
                    //Mid$(strWork, intPos, intCurLen) = String$(intCurLen, &H0) 'corrupt found string
                    //above statement from the VB code is needed to be translated to java, could not understand it
                    currscore = currscore + 1;
                }

            }

        }

    }


}

