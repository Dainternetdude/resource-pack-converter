package ca.dainternetdude.filetypes;

import ca.dainternetdude.*;

public class Texture extends File {

    public String getPathTo(int version) {
        if (getParent(version) != null) {
            return getParent(version).getPath(version);
        } else {
            return Globals.BASE_PATH;
        }
    }
}
