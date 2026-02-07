package fileMonitor;

import fileMonitor.listener.FileSystemEventListener;
import fileMonitor.listener.LinuxFileSystemEventListener;
import fileMonitor.listener.MacOSFileSystemEventListener;
import fileMonitor.listener.WindowsFileSystemEventListener;

import java.util.List;

public class FileMonitor {

    /**
    * Return a FileSystemListener implementation based on the OS the script is being run
    * */
    private static FileSystemEventListener getOSListener(){
        String osName = System.getProperty("os.name");
        System.out.println("OS name: " + osName);

        if  (osName.toLowerCase().startsWith("windows")) {
            return new WindowsFileSystemEventListener();
        }
        else if (osName.toLowerCase().startsWith("linux")) {
            return new LinuxFileSystemEventListener();
        }
        else if (osName.toLowerCase().startsWith("mac")) {
            return new MacOSFileSystemEventListener();
        }
        else {
            assert false: "Operating System not identified";
        }

        return null;
    }

    /**
     * Start watching the specified path
     * */
    public static void watch(String watchPath, FileSystemEventListener listener, List<String> include, List<String> exclude) {}

}