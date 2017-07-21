package vip.hewe.common.util;

/**
 * Hello world!
 */
public class Validator {
    /**
     * 是否是手机号
     *
     * @param cel
     * @return
     */
    public static boolean isCel(String cel) {
        if (cel.matches("^1[3|4|5|8][0-9]\\d{8}$")) {
            return true;
        }
        return false;
    }

    /**
     * 是否是email
     *
     * @param email
     * @return
     */
    public static boolean isEmail(String email) {
        if (email.matches("^[a-zA-Z_]{1,}[0-9]{0,}@(([a-zA-z0-9]-*){1,}\\.){1,3}[a-zA-z\\-]{1,}$")) {
            return true;
        }
        return false;
    }
}
