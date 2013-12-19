package org.flowplayer.ant;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

public class Flatten extends Task {

    private String property;
    private String value;

    public void setProperty(String property) {
        this.property = property;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void execute() {
        if (property == null) throw new BuildException("property not set");
        if (value    == null) throw new BuildException("value not set");
        getProject().setNewProperty(property, value.replace("\n", " "));
    }

}
