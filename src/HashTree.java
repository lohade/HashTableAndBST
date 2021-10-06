import javax.xml.soap.Node;
import java.util.HashMap;


public class HashTree {

    public static void main(String[] args) {
	// write your code here
        String sentence = "To be or not to be";
        HashTable<String, Integer> hashtable = new HashTable<>();
        String[] words = sentence.toLowerCase().split("");
        for (String word : words) {
            Integer count = hashtable.get(word);
            if(count == null){
                count = 1;
            }
            else {
                count = count+1;
                hashtable.add(word,count);
            }
        }
        System.out.println(hashtable);

    }
}



