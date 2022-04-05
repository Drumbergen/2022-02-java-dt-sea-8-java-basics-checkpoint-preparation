package com.wildcodeschool.sea8.checkpoint.java_basics_preparation;

public class Support extends ITPerson {

    protected int level;

    public Support(String name, int level) {
        super(name);
        this.level = level;
    }

    @Override
    public boolean hasReadAccess() {
        // Add logic to evaluate Read access for Support here.
        // level 1 has R A
        if (this.level == 1) {
            return true;
        }
        // level 2 has R A
        if (this.level == 2) {
            return true;
        }
        
        // für alle Andere nix da :-) 
        return false;
    }

    @Override
    public boolean hasWriteAccess() {
        // Add logic to evaluate Write access for Admin here.
        
        // level 2 has W A
        if (this.level == 2) {
            return true;
        }
        // für alle Andere nix da :-)
        return false;
    }
}
