package com.aracem.utils.version; 
 
import android.os.Build;
 
/** 
 * Util class to check if the current device is running some of the awesome Android versions. 
 * <p/> 
 * Created by Marcos Trujillo
 */ 
public class SupportVersion { 
 
    /** 
     * @return true when the caller API version is at least Cupcake 3 
     */ 
    public static boolean cupcake() { 
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.CUPCAKE;
    } 
 
    /** 
     * @return true when the caller API version is at least Donut 4 
     */ 
    public static boolean donut() { 
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.DONUT;
    } 
 
    /** 
     * @return true when the caller API version is at least Eclair 5 
     */ 
    public static boolean eclair() { 
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.ECLAIR;
    } 
 
    /** 
     * @return true when the caller API version is at least Froyo 8 
     */ 
    public static boolean froyo() { 
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.FROYO;
    } 
 
    /** 
     * @return true when the caller API version is at least GingerBread 9 
     */ 
    public static boolean gingerbread() { 
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD;
    } 
 
    /** 
     * @return true when the caller API version is at least Honeycomb 11 
     */ 
    public static boolean honeycomb() { 
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB;
    } 
 
    /** 
     * @return true when the caller API version is at least Honeycomb 3.2, 13 
     */ 
    public static boolean honeycombMR2() { 
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2;
    } 
 
    /** 
     * @return true when the caller API version is at least ICS 14 
     */ 
    public static boolean iceCreamSandwich() { 
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH;
    } 
 
    /** 
     * @return true when the caller API version is at least jellyBean 16 
     */ 
    public static boolean jellyBean() { 
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN;
    } 
 
    /** 
     * @return true when the caller API version is at least jellyBean MR1 17 
     */ 
    public static boolean jellyBeanMR1() { 
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1;
    } 
 
    /** 
     * @return true when the caller API version is at least jellyBean MR2 18 
     */ 
    public static boolean jellyBeanMR2() { 
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2;
    } 
 
    /** 
     * @return true when the caller API version is at least Kitkat 19 
     */ 
    public static boolean kitkat() { 
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT;
    } 
 
    /** 
     * @return true when the caller API version is at least Kitkat Watch 20 
     */ 
    public static boolean kitkatWatch() { 
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT_WATCH;
    } 
 
    /** 
     * @return true when the caller API version is at least lollipop 21 
     */ 
    public static boolean lollipop() { 
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP;
    } 
 
    /** 
     * @return true when the caller API version is at least lollipop 22 
     */ 
    public static boolean lollipopMR1() { 
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP_MR1;
    } 
 
    /** 
     * @return true when the caller API version is at least marshmallow 23 
     */ 
    public static boolean marshmallow() { 
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.M;
    } 
 
    /** 
     * @return true when the caller API version is at least nougat 24 
     */ 
    public static boolean nougat() { 
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.N;
    } 
     
    /** 
     * @return true when the caller API version is at least nougat MR1 25 
     */ 
    public static boolean nougatMR1() { 
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.N_MR1;
    } 
     
    /** 
     * @return true when the caller API version is at least oreo 26 
     */ 
    public static boolean oreo() { 
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.O;
    } 
 
    /** 
     * @param apiLevel minimum API level version that has to support the device 
     * @return true when the caller API version is at least apiLevel 
     */ 
    public static boolean isAtLeastAPI(int apiLevel) {
        return Build.VERSION.SDK_INT >= apiLevel;
    } 
} 
