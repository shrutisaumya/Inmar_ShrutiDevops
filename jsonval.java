/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypackage;

/**
 *
 * @author Shruti
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class jsonval {
    private static final String filePath = "C:\\Users\\Ankit\\Desktop\\JSON\\config.json";
    public static void main(String[] args) {
        try {
            
            String $user = "ABC";
            String $api_key = "12";
            String $conn_string = "xyz";
            String $ip_address = "192.168.0.0";
            
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader(filePath));
            JSONObject jsonObject = (JSONObject) obj;
            //for(Iterator iterator = jsonObject.keySet().iterator(); iterator.hasNext();) {
            //String key = (String) iterator.next();
            //String val = (String)jsonObject.get(key);  
                        
            
            String userval =  (String)jsonObject.get("user");         
            if(userval.isEmpty())
                userval = $user;
                jsonObject.put("user",userval);
            String apival =  (String)jsonObject.get("api_key");         
            if(apival.isEmpty())
                apival = $api_key;
                jsonObject.put("api_key",apival);
            String conval =  (String)jsonObject.get("conn_string");         
            if(conval.isEmpty())
                conval = $conn_string;
                jsonObject.put("conn_string",conval);
            String ipval =  (String)jsonObject.get("ip_address");         
            if(ipval.isEmpty())
                ipval = $ip_address;
                jsonObject.put("ip_address",ipval);
            StringWriter out = new StringWriter();
            jsonObject.writeJSONString(out);
      
            String jsonText = out.toString();
            System.out.print(jsonText+ "\n");       
            
            } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ParseException ex) {
            ex.printStackTrace();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }

    }

}


