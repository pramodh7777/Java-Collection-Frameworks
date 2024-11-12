

public class StringPatternSearch {
    static void patSearch(String txt , String pat)
{
    int pos = txt.indexOf(pat);
    while (pos>=0) {
        System.out.println(pos+" ");
        pos=txt.indexOf(pat,pos+1);
        
    }
    



}
    public static void main(String[] args) {
        String txt ="strstrstr";
        String pat ="str";
        patSearch(txt,pat);
    }
}
