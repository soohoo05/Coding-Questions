import java.util.ArrayList;

/*
 * question: given a list of words, compare to master word. if word in list is only a letter off of the master word, return it in arrayList
 * ex: List: tool, toot, pool, coop, coot, root  master word: cool
 * new list will be tool, pool, coop, coot
 */
public class oneLetterOff {
	   public static void main(String[] args) {
String oneOffWords[]={"tool", "toot","pool","coop","coot","root"};
String masterWord="cool";

ArrayList<String>wordList=oneLetteroff(oneOffWords,masterWord);

for (int i=0; i<wordList.size();i++){
	System.out.println(wordList.get(i)+" is one letter off from "+masterWord);
}

	   }
private static ArrayList<String> oneLetteroff(String[] oneOffWords2, String masterWord2) {
	ArrayList<String> newList=new ArrayList<String>();
	boolean off=false;
	int count=0;
	for (int i=0;i<oneOffWords2.length;i++){
		for(int j=0;j<masterWord2.length();j++){
			if(masterWord2.charAt(j)!=oneOffWords2[i].charAt(j)){	
			
				count++;
				if(count>1){
					count=0;
					off=true;
					break;
				}//if
			}//if
		}//for j to masterWord.length
		
		if(off==false){			
			newList.add(oneOffWords2[i]);
		}
		count=0;
		off=false;
	}//for i to oneOffWords2.length
	
	return newList;
}
}
