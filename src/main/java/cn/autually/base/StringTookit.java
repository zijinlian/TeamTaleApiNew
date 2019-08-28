package cn.autually.base;

import java.util.ArrayList;

/**
 * @author fangzhen 2013-03-19
 * json字符串格式化
 */
public class StringTookit {
    public static String fieldToSetMethod(String fieldName) {
        String r = "set";
        char[] chars = fieldName.toCharArray();
        r += fieldName.replaceFirst((fieldName.charAt(0) + ""), (fieldName.charAt(0) + "").toUpperCase());
        return r;
    }

    public static String fieldToGetMethod(String fieldName) {
        String r = "get";
        char[] chars = fieldName.toCharArray();
        r += fieldName.replaceFirst((fieldName.charAt(0) + ""), (fieldName.charAt(0) + "").toUpperCase());
        return r;
    }

    public static String firstCharUpperCase(String s) {
        return s.replaceFirst((s.charAt(0) + ""), (s.charAt(0) + "").toUpperCase());
    }

    public static String methodToParam(String s) {
        if (s.length()<4) {
            return "";
        }
        char[] chars = s.toCharArray();
        chars[3]+=32;
        String s1 = String.valueOf(chars,3,chars.length-3);
        return s1;
    }

    public static String firstCharLowerCase(String s) {
        return s.replaceFirst((s.charAt(0) + ""), (s.charAt(0) + "").toUpperCase());
    }

    public static String fieldToIsMethod(String fieldName) {
        String r = "is";
        char[] chars = fieldName.toCharArray();
        r += fieldName.replaceFirst((fieldName.charAt(0) + ""), (fieldName.charAt(0) + "").toUpperCase());
        return r;
    }

    public static String JSONStringFormat(String json) {
        String fillStringUnit = "\t";
        if (json == null || json.trim().length() == 0) {
            return null;
        }

        int fixedLenth = 0;
        ArrayList<String> tokenList = new ArrayList<String>();
        {
            String jsonTemp = json;
            while (jsonTemp.length() > 0) {
                String token = getToken(jsonTemp);
                jsonTemp = jsonTemp.substring(token.length());
                token = token.trim();
                tokenList.add(token);
            }
        }

        for (int i = 0; i < tokenList.size(); i++) {
            String token = tokenList.get(i);
            int length = token.getBytes().length;
            if (length > fixedLenth && i < tokenList.size() - 1 && tokenList.get(i + 1).equals(":")) {
                fixedLenth = length;
            }
        }

        StringBuilder buf = new StringBuilder();
        int count = 0;
        for (int i = 0; i < tokenList.size(); i++) {

            String token = tokenList.get(i);

            if (token.equals(",")) {
                buf.append(token);
                doFill(buf, count, fillStringUnit);
                continue;
            }
            if (token.equals(":")) {
                buf.append(" ").append(token).append(" ");
                continue;
            }
            if (token.equals("{")) {
                String nextToken = tokenList.get(i + 1);
                if (nextToken.equals("}")) {
                    i++;
                    buf.append("{ }");
                } else {
                    count++;
                    buf.append(token);
                    doFill(buf, count, fillStringUnit);
                }
                continue;
            }
            if (token.equals("}")) {
                count--;
                doFill(buf, count, fillStringUnit);
                buf.append(token);
                continue;
            }
            if (token.equals("[")) {
                String nextToken = tokenList.get(i + 1);
                if (nextToken.equals("]")) {
                    i++;
                    buf.append("[ ]");
                } else {
                    count++;
                    buf.append(token);
                    doFill(buf, count, fillStringUnit);
                }
                continue;
            }
            if (token.equals("]")) {
                count--;
                doFill(buf, count, fillStringUnit);
                buf.append(token);
                continue;
            }

            buf.append(token);
            if (i < tokenList.size() - 1 && tokenList.get(i + 1).equals(":")) {
                int fillLength = fixedLenth - token.getBytes().length;
                if (fillLength > 0) {
                    for (int j = 0; j < fillLength; j++) {
                        buf.append(" ");
                    }
                }
            }
        }
        return buf.toString();
    }

    private static String getToken(String json) {
        StringBuilder buf = new StringBuilder();
        boolean isInYinHao = false;
        while (json.length() > 0) {
            String token = json.substring(0, 1);
            json = json.substring(1);

            if (!isInYinHao &&
                    (token.equals(":") || token.equals("{") || token.equals("}")
                            || token.equals("[") || token.equals("]")
                            || token.equals(","))) {
                if (buf.toString().trim().length() == 0) {
                    buf.append(token);
                }

                break;
            }

            if (token.equals("\\")) {
                buf.append(token);
                buf.append(json.substring(0, 1));
                json = json.substring(1);
                continue;
            }
            if (token.equals("\"")) {
                buf.append(token);
                if (isInYinHao) {
                    break;
                } else {
                    isInYinHao = true;
                    continue;
                }
            }
            buf.append(token);
        }
        return buf.toString();
    }

    private static void doFill(StringBuilder buf, int count, String fillStringUnit) {
        buf.append("\n");
        for (int i = 0; i < count; i++) {
            buf.append(fillStringUnit);
        }
    }

    public static void main(String[] args) {
        String name = "getName";
        char[] chars = name.toCharArray();
        chars[3]+=32;
        String s = String.valueOf(chars,3,chars.length-3);
        System.out.println(s);

    }
}
