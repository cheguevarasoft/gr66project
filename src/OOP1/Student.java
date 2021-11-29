package OOP1;

public class Student {
    //fields
    private int id;
    private String name;
    private String surname;
    private double avg;
    private boolean isActive;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname.toUpperCase();
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

/*  public Student(){
        System.out.println("Consturkor metodu ishledi");
    }*/

   /* public Student(int id, String name,String surname,double avg,boolean isActive){

        this.id = id;
        this.name = name;
        this.surname = surname;
        this.avg = avg;
        this.isActive = isActive;

    }*/

    void printData(){

        if(this.isActive){
            System.out.println("id-si : "+this.id+" adi : "+this.name+" soyadi : "+this.surname+" ortalama : "+this.avg+" aktivdirmi : "+this.isActive);
        }


    }

}
