import java.util.StringTokenizer;


public class Main {

	int a; 
	public static void main(String[] args) {
		//System.out.println(Boolean.valueOf("42"));
		
		StringTokenizer st = new StringTokenizer("ricardo é lindao e muito gostosao");
		while(st.hasMoreElements()){
			System.out.println( st.nextToken()  );  
		}
		
		int a;

	};

}
