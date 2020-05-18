public class Pet {
        public static void main(String[] args) {
            Pet pet1 = new Pet();
            Pet pet2 = new Pet("Obie", 10, "Concord","Westie");
            
            System.out.println("This pet's name is " + pet1.getName());
            System.out.println("This pet is " + pet1.getAge() + " years old.");
            System.out.println("It is a " + pet1.getType());
            System.out.println("It lives in " + pet1.getLocation());
    
            System.out.println("This pet's name is " + pet2.getName());
            System.out.println("This pet is "+pet2.getAge() + " years old.");
            System.out.println("It is a "+pet2.getType());
            System.out.println("It lives in " +pet2.getLocation());
            
    
        }
    
    
    private String name;
    private String location;
    private String type;
    private int age;

    Pet(){
        this.name = "Kimchi";
        this.age = 2;
        this.location= "Charlotte";
        this.type= "Chihuahua";
      }

    Pet(String name, int age, String location, String type){
          this.name= name;
          this.age = age;
          this.location= location;
          this.type= type;
          
      }
      //get 
    public String getName(){
        return this.name;
    }
    public String getLocation(){
        return this.location;
    }
    public String getType(){
        return this.type;
    }
    public int getAge(){
        return this.age;
    }



    public void setName(String newName) {
        this.name = newName;
      }
    public void setLocation(String newLocation){
        this.location = newLocation;
    }

    public void setType(String newType){
        this.type = newType;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

}