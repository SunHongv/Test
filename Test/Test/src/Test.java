import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("helloworld");

		Map<Integer,Integer> map=new HashMap<>();
		map.containsKey("44");
		String s="6";
		//String ss=s.substring(0, 2);
		System.out.println(romanToInt("III"));
	}
	public static int romanToInt(String s) {
        Map<String,Integer> map=new HashMap();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        
        map.put("IV",4);
        map.put("IX",9);
        map.put("XL",40);
        map.put("XC",90);
        map.put("CD",400);
        map.put("CM",900);
        int len=s.length();
        int i=0;int j=1;int res=0;
        while(i<len){
            if(j<len)
            {
                
                String key=s.substring(i,j+1);
                if(map.containsKey(key)){
                    res+=map.get(key);
                    i+=2;
                    j=i+1;
                }else{
                	//char a=s.charAt(i);
                	
                    if(map.containsKey(s.substring(i,i+1))){
                        res+=map.get(s.substring(i,i+1));
                        i++;
                        j=i+1;
                    }
                    
                }
            }  
            else{
                res+=map.get(s.substring(i,i+1));
                i++;
            }
            
            
        }
        return res;
        
        
    }
}
