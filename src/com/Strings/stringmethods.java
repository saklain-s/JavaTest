
package com.Strings;
public class stringmethods {
    public static void main(String[] args) {
        String str = "Hello this is saklain";
        int l = str.length();
        String strnew = "Hello this is not Saklain";
        String str1 = str.toLowerCase();
        String str2 = str.toUpperCase();
        String str3 = str.trim();
        String str4 = str.substring(1, 3);
        String str5 = str.replace(str4, strnew);
        
        String strr = new String("   netbeans   ");
        
        strr = strr.trim();
        System.out.println(str1);
        System.out.println(l);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str2);
        System.out.println(strr);
        
    }
    
}
