class C {
  int m19;
  int m36;
  int m7;
  int m14;
  int m26;
  long m21;
  long m22;
  long m12;
  int[] m28 = {-3, -2, 2, -3, -1};
  int[] m34 = {3, 2, -1, 1, 0};
  int[] m25 = {-3, 3, -3, 2, 2};
  static int m39;
  static int m40;
  static int m35;
  static int m1;
  static int m8;
  public C() {
    m19 = 6;
    m36 = 6;
    m7 = 5;
    m14 = 4;
    m26 = 6;
    m21 = 7L;
    m22 = 9L;
    m12 = 0L;
  }
  public void m18() {
    System.out.println("метод m18 в классе C");
    System.out.println(m19 << 1);
  }
  public void m15() {
    System.out.println("метод m15 в классе C");
    System.out.println(m19 - 5);
  }
  public void m2() {
    System.out.println("метод m2 в классе C");
    System.out.println(m25[1]);
  }
  public void m16() {
    System.out.println("метод m16 в классе C");
    System.out.println(m34[2]);
  }
  public void m33() {
    System.out.println("метод m33 в классе C");
    System.out.println(++m8);
  }
  public void m4() {
    System.out.println("метод m4 в классе C");
    System.out.println(m26);
  }
  public static void m11() {
    System.out.println("метод m11 в классе C");
    System.out.println(m1);
  }
  public static void m6() {
    System.out.println("метод m6 в классе C");
    System.out.println((m1 + 4));
  }
  public static void m30() {
    System.out.println("метод m30 в классе C");
    System.out.println(m8);
  }
  public static void m38() {
    System.out.println("метод m38 в классе C");
    System.out.println((m8 + 1));
  }
  public void m23(C r) {
    r.m18();
  }
  public void m23(E r) {
    r.m15();
  }
}
