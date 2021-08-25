class Student {

  Student(String name, int mark_1, int mark_2, int mark_3) {
    this.name = name;
    this.mark_1 = mark_1;
    this.mark_2 = mark_2;
    this.mark_3 = mark_3;
  }
  String name;
  int mark_1;
  int mark_2;
  int mark_3;
  double getAverage(){
      return (this.mark_1+this.mark_2+this.mark_3)/3;
  }
  String getName(){
      return this.name;
  }
}

class Main {

  public static void main(String[] arg) {
    Student obj = new Student("Gopi", 90, 89, 88);
    
    System.out.println(obj.getName()+ ":" +"\t"+obj.getAverage());
  }
}
