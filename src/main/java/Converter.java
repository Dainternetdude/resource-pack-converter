import org.jetbrains.annotations.*;

import java.io.File;
import java.util.*;

/**
 * a class who does the actual conversion on a low level
 */
public class Converter {

    private int sourceVersion;
    private int destinationVersion;
    private File sourceFile;
    //public static final basePath
    
    public void setSourceFile(File sf) {
        if (sf == null)
            throw new NullPointerException("Source file is null!");
        else if (!sf.isDirectory())
            System.out.println("Warning: selected source file is not a directory!");
        else
            sourceFile = sf;
    }
    
    public void setSourceVersion(int sv) {
        if (sv < UserInterfaceFrame.LOWEST_SUPPORTED_MC_VERSION || sv > UserInterfaceFrame.LATEST_MC_VERSION)
            throw new RuntimeException("Source version " + sv + " is out of bounds!");
        else
            sourceVersion = sv;
    }
    
    public void setDestinationVersion(int dv) {
        if (dv < UserInterfaceFrame.LOWEST_SUPPORTED_MC_VERSION || dv > UserInterfaceFrame.LATEST_MC_VERSION)
            throw new RuntimeException("Destination version " + dv + " is out of bounds!");
        else
            destinationVersion = dv;
    }

    public void convert() { //todo take path to file
        
        //todo setting up source & dest dirs
        
        for (Directory dir : Version.TOP_LEVEL_DIRECTORIES) {
            convert(dir);
        }
    }
    private void convert(@NotNull Directory dir) {

        // convert all textures in the directory dir
        for (Texture texture : dir.getTextures(sourceVersion)) {

            //rename file from source name to destination name
            File sourceFile = new File(texture.getPathTo(sourceVersion) + texture.getName(sourceVersion));//todo
            File destFile = new File(texture.getPathTo(destinationVersion) + texture.getName(destinationVersion));//todo

            if (sourceFile.renameTo(destFile)) {
                System.out.println("success to renaming ability file ing \"" + texture.getName(sourceVersion) + "\"");
            } else {
                System.out.println("ERROR!!!! of renaming file \"" + texture.getName(sourceVersion) + "\"");
            }
        }
        if (dir.hasSubDirectories(sourceVersion)) {
            ArrayList<Directory> subDirectories = dir.getSubDirectories(sourceVersion);
            //for each subdirectory in dir
            for (Directory subDir : subDirectories) {
                //recursively run convert on that subDir
                convert(subDir);

                //rename subDir

                File sourceDir = new File(subDir.getPath(sourceVersion));
                File destDir = new File(subDir.getPath(destinationVersion));

                if(sourceDir.renameTo(destDir)) {
                    System.out.println("successfully renamed " + subDir.getName(sourceVersion));
                } else {
                    System.out.println("error renaming " + subDir.getName(sourceVersion));
                }
            }
        }
    }
}
