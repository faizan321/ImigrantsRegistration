package com.hisdu.meas.util.MultiSelectionSpinner;

public class KeyPairBoolData {
    private int id;
    private String name;
    private boolean isSelected;
    private Object object;

    public KeyPairBoolData(String name, boolean isSelected){
        this.name = name;
        this.isSelected	= isSelected;
    }

    public KeyPairBoolData() {
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the isSelected
     */
    public boolean isSelected() {
        return isSelected;
    }

    /**
     * @param isSelected the isSelected to set
     */
    public void setSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }
}