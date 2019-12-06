/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osutils;

/**
 * This simple file helps to know which OS the program is running on.
 * @author aborbon
 */
public class OS {
    
    /**
     * Constant with the OS' name
     */
    public static String OS = System.getProperty("os.name").toLowerCase();
    
    /**
     * If the OS' name has "win" then the computer has a Windows OS
     * @return True if the computer's OS is Windows
     */
    public static boolean isWindows() {
        return (OS.contains("win"));
    }

    /**
     * If the OS' name has "mac" then the computer has a Mac OS
     * @return True if the computer's OS is Mac
     */
    public static boolean isMac() {
        return (OS.contains("mac"));
    }

    /**
     * If the OS' name has "nix", "nux" or "aix" then the computer has a Unix OS
     * @return True if the computer's OS is Unix (Linux)
     */
    public static boolean isUnix() {
        return (OS.contains("nix") || OS.contains("nux") || OS.contains("aix"));

    }

    /**
     * If the OS' name has "sunos" then the computer has a Solaris OS
     * @return True if the computer's OS is Solaris
     */
    public static boolean isSolaris() {
        return (OS.contains("sunos"));
    }
}
