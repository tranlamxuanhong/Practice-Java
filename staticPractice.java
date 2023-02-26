class Empl {
  int id;
  static String ceo;


}

public class staticPractice {
  public static void main(String[] args) {
    Empl obj =  new Empl();
    obj.id = 1;
    Empl.ceo = "Mary";



    Empl obj2 = new Empl();
    obj2.id = 2;
    obj2.ceo = "Peter";
    System.out.println(obj2.ceo);
    System.out.println(obj.ceo);

  }
}
