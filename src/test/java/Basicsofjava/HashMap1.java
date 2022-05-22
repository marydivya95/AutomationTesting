package Basicsofjava;

import org.junit.Test;

import java.util.HashMap;

public class HashMap1 {
    @Test
    public void HashMapMethod()
    {
        HashMap<String,Integer> map=new HashMap();
         map.put("ajay", 12);
         map.put("divya",11);
         map.put("susmitha",34);

         int mapsize =map.size();
         System.out.println(mapsize);
        System.out.println(map);
        if(map.containsKey("divya"))
        {
            int keyvalue=map.get("divya");
            System.out.println(keyvalue);
        }


    }
}
