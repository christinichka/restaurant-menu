package restaurant;

import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menu;
    public Menu(ArrayList<MenuItem> menu) {
        this.menu = menu;
    }
    public Menu() {
        this.menu = new ArrayList<>();
    }
    public ArrayList<MenuItem> getMenus() {
        return menu;
    }
    public void setMenu(ArrayList<MenuItem> menu) {
        this.menu = menu;
    }
    public void addMenuItem(MenuItem aMenuItem) {
        this.menu.add(aMenuItem);
    }
}

