package moodle;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

public class Hello {

	public static void main(String[] args) {
		
		//����json
		String str = "{\"name\":\"xudongwei\"}";
		JSONObject json = new JSONObject(str);
		System.out.println(json.get("name"));
		
		//��װ����json
		Map<String,Object> m = new HashMap<String,Object>();
		m.put("name", "xudongwei");
		m.put("age", 23);
		System.out.println(json.valueToString(m));
		
	}
	
	
}
