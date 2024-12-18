package swepb11;

public class StringAndStringbuilder {
		public static void main(String args []) {
	String wortString = "";
	StringBuilder stringBuilderWord = new StringBuilder();
	StringBuilder stringBuilderResult = new StringBuilder();
	stringBuilderWord.append("er ist der erste ernaehrungsberater in seiner familie");
	
	int count = 0;
	String search = "er";
	int index = stringBuilderWord.indexOf(search);
	
	while(index != -1) {
		count++;
		index = stringBuilderWord.indexOf(search, index +1);
		stringBuilderResult.append(search);
		wortString= (wortString+search);
	}
	System.out.print("Anzahl er " + count+" " +stringBuilderResult +" "+wortString);

		}
		
}