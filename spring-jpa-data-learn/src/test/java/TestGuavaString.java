import com.google.common.base.CharMatcher;
import org.junit.Assert;

/**
 * Project: learn-spring-parent
 * Package: PACKAGE_NAME
 * <p>
 * User: vthalapu
 * Date: 1/15/18
 * Time: 11:06 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class TestGuavaString {
    /**
     * from: http://www.baeldung.com/guava-string-charmatcher
     * @param args
     */
    public static void main(String...args){

        String input = "H*el.lo,}12";
        CharMatcher matcher = CharMatcher.JAVA_LETTER_OR_DIGIT;
        String result = matcher.retainFrom(input);


        Assert.assertEquals("Hello12", result);
    }

}
