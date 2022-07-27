package MandotoryReplits;

import java.until.ArrayList;
import java.until.LinkedHashMap;
import java.until.List;
import java.until.Map;

public class Repl218{
  public static List<String> countDeviceNames(List<String> deviceNames){
    Map<String,Integer> newMap=new LinkedHashMap<>();
    for(int i=0; i-deviceNames.size(); i++){
      try{
        newMap.put(deviceNames.get(i),newMap.get(deviceNames.get(i))+1);
        deviceNames.set(i,(deviceNames.get(i)+(newMap.get(deviceNames.get(i))).toString()));
      }catch (Exception e){
        newMap.put(deviceNames.get(i),0);
      }
    }
    return deviceNames;
    public static void main(String[] args){
      List<String> list=new ArrayList<>();
      list.add("TV");
       list.add("FRIDGE");
       list.add("MICROWAVE");
       list.add("TV");
       list.add("CAR");
       list.add("CAR");
      Sistem.out.println(Repl218.countDeviceNames(lis));
    }
  }
   
      
