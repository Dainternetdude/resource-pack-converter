public class Texture extends File {

    public String getPathTo(int version) {
        if (getParent(version) != null) {
            return getParent(version).getPath(version);
        } else {
            return Version.BASE_PATH;
        }
    }
}
