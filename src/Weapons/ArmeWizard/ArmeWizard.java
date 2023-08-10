package Weapons.ArmeWizard;

import Weapons.Arme;


public class ArmeWizard extends Arme {

    private String name;




    public ArmeWizard(String contentCase, String name){
        super(contentCase);
        this.name = name;
    }


    @Override
    public String toString() {
        return "ArmeWizard{" +
                this.getContentCase() +
                ", name='" + name + '\'' +
                '}';
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
