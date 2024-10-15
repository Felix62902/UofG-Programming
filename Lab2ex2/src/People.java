public class People {
    String name;

    public People(){

    }

    public People(String name){
        name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String toString(){
        return "My name is " + this.name;
    }
}
