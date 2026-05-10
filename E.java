class E extends C {
  public E() {
    m36 = 6;
    m7 = 9;
    m26 = 9;
    m22 = 7L;
    m12 = 3L;
  }
  public void m18() {
    System.out.println("метод m18 в классе E");
    System.out.println(m19 << 2);
  }
  public void m15() {
    System.out.println("метод m15 в классе E");
    System.out.println(m28[2]);
  }
  public void m2() {
    System.out.println("метод m2 в классе E");
    System.out.println(m14 + 3);
  }
  public void m4() {
    System.out.println("метод m4 в классе E");
    System.out.println(m26--);
  }
  public static void m11() {
    System.out.println("метод m11 в классе E");
    System.out.println(++m39);
  }
  public static void m6() {
    System.out.println("метод m6 в классе E");
    System.out.println(m40);
  }
  public static void m30() {
    System.out.println("метод m30 в классе E");
    System.out.println((m40 + 2));
  }
  public static void m38() {
    System.out.println("метод m38 в классе E");
    System.out.println(m40);
  }
  public void m23(C r) {
    r.m2();
  }
  public void m23(E r) {
    r.m16();
  }
}
