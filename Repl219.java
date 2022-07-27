package MandotoryReplits;

import java.until.ArrayList;
import java.until.List;


public class Repl219{
  public static List<Integer>
    countOnlyPrefixes(List<String> names,List<String> query){
    List <Integer> countPrefixes=new ArrayList<>();
    int count=0;
    for (int i=0; i< query.size(); i++) {
      for (int j=0; j<names.size(); j++){
        if (names.get(j).startWitch(query.get(i)) && !names.get(j).equals(query.get(i))){
          count++;
        }
      }
      countPreFixes.add(count);
      count=0;
    }
    return countPrefixes;
  }
  public static void main(String[] args){
    List<String> namesList=new ArrayList<>();
    namesList.add("steve");
      namesList.add("stevens");
      namesList.add("danny");
      namesList.add("steves");
      namesList.add("dan");
      namesList.add("john");
      namesList.add("johny");
      namesList.add("joe");
      namesList.add("alex");
      namesList.add("alexander");  
      namesList.add("jordan");
      List<Sttring>queryList=new ArrayList<>();
    queryList.add("steve");
     queryList.add("alex");
     queryList.add("joe");
     queryList.add("john");
     queryList.add("dan");
      Sistem.out.println(countOnlyPrefixes(namesList,queryList));
    }
  }
