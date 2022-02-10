package org.framework.rodolfo.freire.git.design.pattern.factory.util.enums;

public enum EnumMarital {
    SINGLE("SINGLE"), MARRIED("MARRIED");

    private final String description;

    EnumMarital(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
