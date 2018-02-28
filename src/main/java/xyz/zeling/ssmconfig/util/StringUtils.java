package xyz.zeling.ssmconfig.util;

/**
 * String工具类
 * 
 * @author zeling
 * @date 2018年3月1日 上午12:33:38
 */
public class StringUtils {
    /**
     * <p>
     * Checks if a CharSequence is whitespace, empty ("") or null.
     * </p>
     *
     * <pre>
     * StringUtils.isBlank(null) = true
     * StringUtils.isBlank("") = true
     * StringUtils.isBlank(" ") = true
     * StringUtils.isBlank("bob") = false
     * StringUtils.isBlank("  bob  ") = false
     * </pre>
     * 
     * @param cs the CharSequence to check, may be null
     * @return {@code true} if the CharSequence is null, empty or whitespace
     * @date 2018年3月1日 上午12:46:28
     */
    public static boolean isBlank(final CharSequence cs) {
        int strLen;
        if (cs == null || (strLen = cs.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if (Character.isWhitespace(cs.charAt(i)) == false) {
                return false;
            }
        }
        return true;
    }

    /**
     * 测试
     * 
     * @param args
     * @date 2018年3月1日 上午12:33:38
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }
}
