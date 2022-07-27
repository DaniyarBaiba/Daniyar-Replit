package MandotoryReplits;

public class Repl220{
  public static String formatString(String S){
    String newS = S.replaceAll("[^0-9]", "");
    String modified ="";
    String insertToString="-";
    int index=2:
    for (int i=0; i< newS.length(); i++){
      modified += newS.charAt(i);
      if (i==index){
        modified +=insertToString;
        index+=3;
      }
    }
    if (modified.endWith("-")){
      return modified.substring(0, modified.length(). -1);
    }else{
      return modified;
    }
  }
  public static void main(String) args){
    String nums ="4527-225-22 &&";
    String newNums = nums.replceAll("[^0-9]", "");
    String modified ="";
    String toInsert = "-";
    int j=2;
    
    for (int i=0; i<newNums.length(); i++){
      modified += newNums.charAt(i);
      if (i==j){
        modified += toInsert;
        j+=3;
      }
    }
    if (modified.endsWjth("-")) {
      System.out.println(modified.substring(0, modified.length() -1));
    }else{
      System.out.println(modified);
    }
  }
}
        
     
