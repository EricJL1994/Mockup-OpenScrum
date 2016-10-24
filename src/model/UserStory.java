package model;

import java.util.ArrayList;

public class UserStory {
    private String name;
    private String description;
    private int estimation;
    private ArrayList<Class_> classes;

    public UserStory(String name, String description, int estimation) {
        this.name = name;
        this.description = description;
        this.estimation = estimation;
        classes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEstimation() {
        return estimation;
    }

    public void setEstimation(int estimation) {
        this.estimation = estimation;
    }
    
    public boolean addClass(Class_ class_){
        for (Class_ classe_ : classes) {
            if(classe_.equals(class_))return false;
        }
        return classes.add(class_);
    }
    
    public boolean removeClass(Class_ class_){
        return classes.remove(class_);
    }

    public ArrayList<Class_> getClasses() {
        return classes;
    }
    

    @Override
    public String toString() {
        return name;
    }
    
    
}
