import java.util.HashMap;
import java.util.Map;



public class countryCapital {
    public static String getCapital(String country ) throws NoMatchFoundExecption{
Map<String ,String>countryCaptialMap = new HashMap<>();
countryCaptialMap.put("india","new delhi");

if (countryCaptialMap.containsKey(country)){
    return countryCaptialMap.get(country);
}else{
    throw new NoMatchFoundExecption("no match found for the country ")
}
    }
    public static void main(String[] args) {
        if (args.length == 0){
            System.err.println(" pls entered the country name");
            return;
        } 
        String country = agrs[0];
        try{
            String capital = getCapital(country);

        }catch(NoMatchFoundExecption e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
