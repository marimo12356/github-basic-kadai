package kadai_021;

import java.util.HashMap;
import java.util.Map;

public class Dictionary_Chapter21 {
	Map<String,String> jisyo=new HashMap<>();
	public Dictionary_Chapter21(){
		jisyo.put("apple", "りんご");
		jisyo.put("peach", "桃");
		jisyo.put("banana", "バナナ");
		jisyo.put("lemon", "レモン");
		jisyo.put("pear", "梨");
		jisyo.put("kiwi", "キウィ");
		jisyo.put("strawberry", "いちご");
		jisyo.put("grape", "ぶどう");
		jisyo.put("muscat", "マスカット");
		jisyo.put("cherry", "さくらんぼ");
	}
	public void search(String[] word) {
		for(int i=0;i<word.length;i++) {
			if(jisyo.get(word[i])!=null) {
				System.out.println(word[i]+"の意味は"+jisyo.get(word[i]));
			}else {
				System.out.println(word[i]+"は辞書に存在しません");
			}
		}
	}
	
	
}
