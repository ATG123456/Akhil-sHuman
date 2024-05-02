
public class son{
    String name;
    int age;
    int numLegs;
    double run_speed;
    int amount_of_guns_owned;

   public son(String name_, int age_, int numLegs_){
       this.name = name_;
       this.age = age_;
       

       if(numLegs_ > 4){
           numLegs_ = 4;
       }
       this.numLegs = numLegs_;
       
       
    }
    
   


   public String getName(){ return name; }
   public void setName(String new_name){ this.name = new_name; }
   public int getAge(){ return age; }
   public void setAge(int new_age){ this.age = (new_age > 0) ? new_age : 1;}

   public String dog_report()
   {
       String[] report_text = new String[2];
       report_text[0] = getName();
       report_text[1] = String.valueOf(getAge());
       return "My son's name is " + report_text[0] + " and he is " + report_text[1] + " years old.";
   }

    public static void main(String[] args)
    {
     
        son my_pup = new son("LeBron", 15, 2);

        System.out.println(my_pup.dog_report());
    }


}
