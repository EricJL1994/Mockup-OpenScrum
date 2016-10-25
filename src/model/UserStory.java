package model;

import java.util.ArrayList;

public class UserStory {
    private String name;
    private String description;
    private int estimation;

    public UserStory(String name, String description, int estimation) {
        this.name = name;
        this.description = description;
        this.estimation = estimation;
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

    @Override
    public String toString() {
        return name;
    }
    
    
}
