package com.hydra.utils;

import java.util.UUID;

public class UuidUtil {
	public static String[] chars = new String[] { "a", "b", "c", "d", "e", "f",
            "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
            "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I",
            "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
            "W", "X", "Y", "Z" };

    /**
     * 获取8位随机数
     * */
public static String generateShortUuid() {
    StringBuffer shortBuffer = new StringBuffer();
    String uuid = UUID.randomUUID().toString().replace("-", "");
    for (int i = 0; i < 8; i++) {
        String str = uuid.substring(i * 4, i * 4 + 4);
        int x = Integer.parseInt(str, 16);
        shortBuffer.append(chars[x % 0x3E]);
    }
    return shortBuffer.toString();

}
/**
 * 获取6位随机数
 * */
public static String generateRedeem() {
    StringBuffer shortBuffer = new StringBuffer();
    String uuid = UUID.randomUUID().toString().replace("-", "");
    for (int i = 0; i < 6; i++) {
        String str = uuid.substring(i * 4, i * 4 + 4);
        int x = Integer.parseInt(str, 16);
        shortBuffer.append(chars[x % 0x3E]);
    }
    return shortBuffer.toString();

}

    public static void main(String[] args) {
    for (int i =0,leng =10;i<leng;i++){
        String test1 = generateShortUuid();
        String test2 = generateRedeem();
        System.out.println("tets1:"+test1+"      "+"test2:"+test2);
    }
    }
}
