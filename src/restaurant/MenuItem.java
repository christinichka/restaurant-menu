package restaurant;

//import java.util.Arrays;
import java.util.Date;

public class MenuItem {
    public String foodName;
    public double price;
    public String description;
    public String category = null;
    public boolean isNew = true;
    private Date dateAdded;

    //Setters
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    // Getters
    public String getFoodName() {
        return foodName;
    }
    public double getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    public String getCategory() {
        return category;
    }

}

