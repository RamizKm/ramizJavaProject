import java.io.UnsupportedEncodingException;


public class AbcDiaTest {
	
	  private final static char[] HEX_ARRAY = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String dl="rkmÄÆrkmICAL01ÿæ";
	
		String kt=new String(dl.getBytes("ISO8859-1"));
		System.out.println("kt="+kt);
		
		String dk=new String(dl.getBytes("UTF-8"),"UTF-8");
		System.out.println("AbcDiaTest.main() dk="+dk);
		
		String a=new String(dk.getBytes("ISO8859-1"),"ISO8859-1");
		System.out.println("iso msg="+a);
		
		AbcDiaTest d=new AbcDiaTest();
		
		System.out.println("AbcDiaTest.main() dld="+a);
		
		
		
	}
	
}
