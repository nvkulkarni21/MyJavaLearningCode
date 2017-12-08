package Assignment.pigLatin;
//used for pigLating

public class VowelIndex {
    private static int indexVal;
    private  static char caseVal;

    public VowelIndex(int indexVal, char caseVal) {
        this.indexVal = indexVal;
        this.caseVal = caseVal;
    }

    public static int getIndexVal() {
        return indexVal;
    }

    public static char getCaseVal() {
        return caseVal;
    }
}