private class Calc {
  public int addMethod(int i, int j) {
    return i+j;
  }
}

private class CalAdv extends Calc {
  public int subMethod(int y, int z) {
    return y-z;
  }
}

public class Inheritance {
  public static void main(String[] args) {
    CalAdv obj = new CalAdv();
    int result = obj.addMethod(2,3);
    System.out.println(result);
  }
}
