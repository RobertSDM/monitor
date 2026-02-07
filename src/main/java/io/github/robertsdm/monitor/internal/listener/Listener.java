package io.github.robertsdm.monitor.internal.listener;

public class Listener {
    /**
     * Return a FileSystemListener implementation based on the OS the script is being run
     * */
    public static FileSystemEventListener getOSListener(){
        String osName = System.getProperty("os.name");

        if  (osName.toLowerCase().startsWith("windows")) {
            return new WindowsFileSystemEventListener();
        }
        else if (osName.toLowerCase().startsWith("linux")) {
            return new  LinuxFileSystemEventListener();
        }
        else if (osName.toLowerCase().startsWith("mac")) {
            return new MacOSFileSystemEventListener();
        }
        else {
            assert false: "Operating System not identified";
        }

        return null;
    }
}
