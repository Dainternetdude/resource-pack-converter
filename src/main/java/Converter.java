import org.jetbrains.annotations.*;

import java.io.File;

/**
 * a completely static class who does the actual conversion on a low level
 */
public class Converter {

    private byte sourceVersion;
    private byte destinationVersion;
    //public static final basePath

    public void convert(byte sourceVersion, byte destinationVersion) { //todo take path to file
        this.sourceVersion = sourceVersion;
        this.destinationVersion = destinationVersion;
        convert(Version.TOP_LEVEL_DIRECTORIES);
    }
    public void convert(@Nullable Directory dir) {

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
        if (dir.getHasSubDirectories(sourceVersion)) {
            Directory[] subDirectories = dir.getSubDirectories(sourceVersion);
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

    public void convert(Directory[] dirTree) {
        for (Directory dir : dirTree) {
            convert(dir);
        }
    }
}
