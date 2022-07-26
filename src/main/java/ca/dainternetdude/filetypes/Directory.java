package ca.dainternetdude.filetypes;

import ca.dainternetdude.*;

import java.util.*;

public class Directory extends File {

    private final ArrayList<Directory>[] subDirectories = (ArrayList<Directory>[]) new ArrayList[Globals.LATEST_MC_VERSION + 1];
    private final ArrayList<Texture>[] textures = (ArrayList<Texture>[]) new ArrayList[Globals.LATEST_MC_VERSION + 1];

    public Directory() {
        for (int i = 0; i < subDirectories.length; i++) {
            subDirectories[i] = new ArrayList<>();
        }
        for (int i = 0; i < textures.length; i++) {
            textures[i] = new ArrayList<>();
        }
    }

    public ArrayList<Directory> getSubDirectories(int version) {
        return subDirectories[version];
    }
    
    public void addSubDirectory(Directory directory, int version) {
        if (directory == null)
            throw new NullPointerException("cannot add directory as it is null!");
        else {
            directory.setParent(this, version);
            subDirectories[version].add(directory);
        }
    }

    public boolean hasSubDirectories(int version) {
        return !this.subDirectories[version].isEmpty();
    }

    public ArrayList<Texture> getTextures(int version) {
        return textures[version];
    }

    public void addTexture(Texture texture, int version) {
        if (texture == null)
            throw new NullPointerException("cannot add texture as it is null!");
        else {
            texture.setParent(this, version);
            textures[version].add(texture);
        }
    }
}
