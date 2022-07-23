import java.util.*;

public class Directory extends File {

    private final ArrayList<Directory>[] subDirectories = (ArrayList<Directory>[]) new ArrayList[UserInterfaceFrame.LATEST_MC_VERSION + 1];
    private final ArrayList<Texture>[] textures = (ArrayList<Texture>[]) new ArrayList[UserInterfaceFrame.LATEST_MC_VERSION + 1];

    public Directory() {
        for (ArrayList<Directory> subDirectoryArray : subDirectories) {
            subDirectoryArray = new ArrayList<>();
        }
        for (ArrayList<Texture> textureArray : textures) {
            textureArray = new ArrayList<>();
        }
    }

    public ArrayList<Directory> getSubDirectories(int version) {
        return subDirectories[version];
    }
    
    public void addSubDirectory(Directory directory, int version) {
        if (directory == null)
            throw new NullPointerException("cannot add directory as it is null!");
        else
            subDirectories[version].add(directory);
    }

    @Deprecated
    private void setSubDirectories(Directory[] subDirectories, int version) {
        if (subDirectories != null) {
            this.subDirectories[version] = subDirectories.clone();

            for (Directory dir : this.subDirectories[version]) {
                dir.setParent(this, version);
            }
        } else {
            this.subDirectories[version] = null;
        }
    }

    public boolean hasSubDirectories(int version) {
        return !this.subDirectories[version].isEmpty();
    }

    public ArrayList<Texture> getTextures(byte version) {
        return textures[version].clone();
    }

    public void addTexture(Texture texture, int version) {
        if (texture == null)
            throw new NullPointerException("cannot add texture as it is null!");
        else
            textures[version].add(texture);
    }
    
    @Deprecated
    private void setTextures(Texture[] textures, int version) {
        if (textures != null) {
            this.textures[version] = textures.clone();

            for (Texture texture : this.textures[version]) {
                texture.setParent(this, version);
            }
        } else {
            this.textures[version] = null;
        }
    }
}
