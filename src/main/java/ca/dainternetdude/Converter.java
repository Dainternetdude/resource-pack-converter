package ca.dainternetdude;

import ca.dainternetdude.filetypes.*;
import ca.dainternetdude.mappings.*;
import org.jetbrains.annotations.*;

import java.io.*;
import java.io.File;
import java.nio.file.*;
import java.util.*;

/**
 * a class who does the actual conversion on a low level
 */
public class Converter {

    private int sourceVersion = -1;
    private int destinationVersion = -1;
    private File sourceFile;
    private File destinationFile;
    
    public void setSourceFile(File sf) {
        if (sf == null)
            throw new NullPointerException("Source file is null!");
        else if (!sf.isDirectory())
            System.out.println("Warning: selected source file is not a directory!");
        else
            sourceFile = sf;
    }
    
    public void setSourceVersion(int sv) {
        if (sv < Globals.LOWEST_SUPPORTED_MC_VERSION || sv > Globals.LATEST_MC_VERSION)
            throw new RuntimeException("Source version " + sv + " is out of bounds!");
        else
            sourceVersion = sv;
    }
    
    public void setDestinationVersion(int dv) {
        if (dv < Globals.LOWEST_SUPPORTED_MC_VERSION || dv > Globals.LATEST_MC_VERSION)
            throw new RuntimeException("Destination version " + dv + " is out of bounds!");
        else
            destinationVersion = dv;
    }

    public void convert() {
        
        if (sourceVersion == -1) {
            throw new RuntimeException("Error: No source version selected!");
        } else if (destinationVersion == -1) {
            throw new RuntimeException("Error: No destination version selected!");
        } else if (sourceFile == null) {
            throw new RuntimeException("Error: No source file selected!");
        }
        
        String path = sourceFile.getPath();
        String[] splitPath = path.split("/");
        var len = splitPath.length;
        var c = splitPath[len - 1].length();
        String sourceFileName = path.substring(path.length() - c);
        String destinationFilePath = path + " 1." + destinationVersion;
    
        System.out.println("Source path:      " + path);
        System.out.println("Destination path: " + destinationFilePath);
        
        destinationFile = new File(destinationFilePath);
        
        if (destinationFile.mkdir()) {
            System.out.println("Destination directory successfully created!");
        }
        
        for (Directory dir : Bindings.TOP_LEVEL_DIRECTORIES) {
            //convert(dir);
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
