package ca.dainternetdude.filetypes;

import ca.dainternetdude.*;

/**
 * parent of filetypes.Directory & filetypes.Texture
 */
public class File {

    /*
    this implementation seems good
    the goal is to make it very easy to add new versions
     */

    private final String[] name = new String[Globals.LATEST_MC_VERSION + 1];
    private final Directory[] parent = new Directory[Globals.LATEST_MC_VERSION + 1];

    public File() {
    }

    public String getName(int version) {
        return this.name[version];
    }

    public void setName(String name, int version) {
        this.name[version] = name;
    }

    public String getPath(int version) {
        if (this.getParent(version) != null) {
            return getParent(version).getPath(version) + this.getName(version);
        } else {
            return Globals.BASE_PATH + this.getName(version);
        }
    }

    protected void setParent(Directory parentDir, int version) {
        if (parentDir == null)
            throw new NullPointerException("cannot set parent directory to null!");
        else
            this.parent[version] = parentDir;
    }

    protected Directory getParent(int version) {
        if (this.parent[version] == null)
            System.out.printf("Warning: parent of %s is null!%n", this.getName(version));
        return this.parent[version];
    }
}
