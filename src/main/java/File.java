/**
 * parent of Directory & Texture
 */
public class File {

    /*
    this implementation seems good
    the goal is to make it very easy to add new versions
     */

    private final String[] name = new String[UserInterfaceFrame.LATEST_MC_VERSION + 1];
    private final Directory[] parent = new Directory[UserInterfaceFrame.LATEST_MC_VERSION + 1];

    public File() {
    }

    public String getName(byte version) {
        return this.name[version];
    }

    public void setName(String name, byte version) {
        this.name[version] = name;
    }

    public String getPath(byte version) {
        if (this.getParent(version) != null) {
            return getParent(version).getPath(version) + this.getName(version);
        } else {
            return DirectoryTrees.basePath + this.getName(version);
        }
    }

    protected void setParent(Directory parentDir, byte version) {
        this.parent[version] = parentDir;
    }

    protected Directory getParent(byte version) {
        return this.parent[version];
    }
}
