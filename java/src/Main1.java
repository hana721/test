//課題1-30　Main　

class Main_1 {
  public static void main(String[] args) {
    Person person1 = new Person("鈴木太郎", 20, 1.7,60);
   
    System.out.println(person1.getName());
    System.out.println(person1.getAge());
    System.out.println(person1.getHeight());
    
    double bmi = person1.bmi();
    System.out.println(bmi); 
  }
}