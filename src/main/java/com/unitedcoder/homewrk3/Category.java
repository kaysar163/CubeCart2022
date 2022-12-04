package com.unitedcoder.homewrk3;

public class Category {
    //name.status,visible,parentctcategory
    private String Name;
    private  String Status;
    private String Visible;
    private  String ParentCategory;

    public Category() {
    }


    public Category(String name, String status, String visible, String parentCategory) {
        this.Name = name;
        this.Status = status;
        this.Visible = visible;
        this.ParentCategory = parentCategory;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getVisible() {
        return Visible;
    }

    public void setVisible(String visible) {
        Visible = visible;
    }

    public String getParentCategory() {
        return ParentCategory;
    }

    public void setParentCategory(String parentCategory) {
        ParentCategory = parentCategory;
    }

    @Override
    public String toString() {
        return "Category{" +
                "Name='" + Name + '\'' +
                ", Status='" + Status + '\'' +
                ", Visible='" + Visible + '\'' +
                ", ParentCategory='" + ParentCategory + '\'' +
                '}';
    }
}

