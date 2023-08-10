package Weapons.ArmeWarrior;


import Weapons.Arme;


public class ArmeWarrior extends Arme {



    private String name;



    public ArmeWarrior(String contentCase, String name){
        super(contentCase);
        this.name= name;
    }

    @Override
    public String toString() {
        return "ArmeWarrior{" +
                "name='" + name + '\'' +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
