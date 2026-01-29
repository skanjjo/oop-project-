public class Employee {
    private String name;
    private String position ;
    private double salary ;

    public Employee(String name ,String position ,double salary ){
        this .name = name ;
        setPosition (position);
        setSalary(salary);
    }
    public String getName(){
        return name ;
    }
public void setName(String name){
    this.name = name ;
}
 public String getPosition(){
     return position ;
 }
 public void setPosition(String position ){
    if (position.equalsIgnoreCase("manager")|| 
       position.equalsIgnoreCase("Developer" ) ||
         position.equalsIgnoreCase("Intern")) {
            this.position = position;
 }else{ 
    System.out.println("Uyarı: Geçersiz pozisyon girişi! (\" + position + \")");
    this.position ="Geçersiz ";
 }
 }
 public double getSalary(){ 
    return salary ;
 }
public void setSalary(double salary ){
    if (salary >=0 && salary <=50000){
        this.salary = salary ;
    }else{
        System.out.println("Uyarı: Maaş 0 ile 50000 arasında olmalıdır! ");
        this.salary =0;
    }
}
public void applyRaise(){
    double raiseRate =0;
     if (position.equalsIgnoreCase("Manager")){
 raiseRate= 0.20;
     } else if (position.equalsIgnoreCase("Developer")){
        raiseRate =0.10;
     } else if (position.equalsIgnoreCase("Intern")){
        raiseRate =0.05;
     } else {
        System.out.println("Uyarı: Geçersiz pozisyon için zam uygulanamaz! ");
        return ;
     }
     this.salary +=this. salary*raiseRate;
     System.out.println("Zam uygulandı ! yeni maaş :"+this.salary+" TL");
}
public void printInfo(){
    System.out.println("Çalışan Bilgileri :");
    System.out.println("İsim :"+this.name);
    System.out.println("Pozisyon :"+this.position);
    System.out.println("Maaş :"+this.salary+" TL");


     }


 }