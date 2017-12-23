
import org.apache.commons.lang.StringEscapeUtils;

public class RkmEscapeTest {
	
	public static final String abc="test";
	
	public static void main(String[] args) {
	String a=StringEscapeUtils.escapeXml("rkm&*^");
	String b=StringEscapeUtils.escapeXml("&amp;rkm&amp;");
		System.out.println(a);
		System.out.println(b);
	String ab=StringEscapeUtils.unescapeXml("rkm&*^");
	System.out.println(ab);
	System.out.println(StringEscapeUtils.unescapeXml("&amp;rkm&amp;"));
	
	String bc="&amp;&amp;rkm*amp;test";
	System.out.println(StringEscapeUtils.unescapeXml(bc));
	
	
	
	String kd=abc+"ttktl";
	System.out.println(kd);
	
	
	String abcd="&amp;test";
	System.out.println("original="+abcd);
	String conv=StringEscapeUtils.unescapeXml(abcd);
	
	System.out.println(conv);
	
	String con2=StringEscapeUtils.unescapeXml(conv);
	System.out.println("convert again="+con2);
	
	String f=StringEscapeUtils.escapeXml(conv);
	System.out.println("final="+f);
	
	
	String ax="&121";
	
	String abx=StringEscapeUtils.unescapeXml(ax);
	System.out.println("abx="+abx);
	
	System.out.println("aby="+StringEscapeUtils.escapeXml(abx));
	
		
	}

}
