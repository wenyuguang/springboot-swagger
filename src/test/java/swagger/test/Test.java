package swagger.test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;


public class Test { 
public static void main(String[] args) {
	Map<String, Map<String, String>> map = new HashMap<String, Map<String, String>>();
	Map<String, String> data1=  new HashMap<String, String>();
	Map<String, String> data2=  new HashMap<String, String>();
	data1.put("name", "新收");
	data1.put("count", "1");
	map.put("1", data1);
	data2.put("name", "旧存");
	data2.put("count", "1");
	map.put("2", data2);
//	JSONObject json =new JSONObject(map);
	
	
	List<String> list = new ArrayList<String>();
	list.add("成都");
	list.add("遂宁");
	 JSONArray json1 = new JSONArray(list);
	System.out.println(json1);
}
}
