public class Directory extends File {

    private final Directory[][] subDirectories = new Directory[UserInterfaceFrame.LATEST_MC_VERSION + 1][];
    private final boolean[] hasSubDirectories = new boolean[UserInterfaceFrame.LATEST_MC_VERSION + 1];
    private final Texture[][] textures = new Texture[UserInterfaceFrame.LATEST_MC_VERSION + 1][];

    public Directory() {
    }

    public Directory[] getSubDirectories(byte version) {
        return subDirectories[version];
    }

    protected void setSubDirectories(Directory[] subDirectories, byte version) {
        if (subDirectories != null) {
            this.subDirectories[version] = subDirectories.clone();
            this.hasSubDirectories[version] = true;

            for (Directory dir : this.subDirectories[version]) {
                dir.setParent(this, version);
            }
        } else {
            this.subDirectories[version] = null;
            this.hasSubDirectories[version] = false;
        }
    }

    public boolean getHasSubDirectories(byte version) {
        return this.hasSubDirectories[version];
    }

    public Texture[] getTextures(byte version) {
        return textures[version].clone();
    }

    public void setTextures(Texture[] textures, byte version) {
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
