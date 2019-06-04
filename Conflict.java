import jva.util.Ramdom;
public class Conflict{
	public static void main(String[] args){
		Random rnd=new Random();
		for(int i=0;i<10;i++){
			int i=rnd.nextInt(100)+1;
			System.out.println(i);
		}
	}
}

