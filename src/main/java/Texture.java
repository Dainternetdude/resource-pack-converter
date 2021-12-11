public class Texture extends File {

    public String getPathTo(byte version) {
        if (getParent(version) != null) {
            return getParent(version).getPath(version);
        } else {
            return DirectoryTrees.basePath;
        }
    }
}
