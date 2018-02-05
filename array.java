class Array
{
  int x[] = new int[5];
  Array(int a,int b,int c,int d,int e) {
    x[0] = a;
    x[1] = b;
    x[2] = c;
    x[3] = d;
    x[4] = e;
  }
  void traverse() {
    for (int i=0;i<5;i++) {
      System.out.print(x[i]+" ");
    }
  }
  void reverse() {
    for (int i=4;i>=0;i--) {
      System.out.print(x[i]+" ");
    }
  }
  void sum() {
    int q = 0;
    for (int i=0;i<5;i++) {
      q += x[i];
    }
    System.out.print("\nSum = "+ q);
  }

  //int common = 0;
  void common(Array obj2) {
    for (int i=0;i<5;i++) {
      for (int j=0;j<5;j++) {
        if (x[i] == obj2.x[j]) {
          System.out.print(x[j]);
          break;
        }
      }
    }
  }
}
class Main
{
  public static void main(String args[]) {
    Array ob1 = new Array(9,8,7,6,5);
    Array ob2 = new Array(1,2,3,4,5);
    System.out.print("\nTraversing... ");
    ob1.traverse();
    System.out.print("\nReversing... ");
    ob1.reverse();
    ob1.sum();
    System.out.print("\nCommon values --> ");
    ob1.common(ob2);
  }
}
