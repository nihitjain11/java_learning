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
  void traverse(int k) {
    double start =  System.currentTimeMillis();
    for (int i=1;i<11;i++) {
      System.out.println(k+" * "+i+" = "+(k*i));
    }
    double end = System.currentTimeMillis();
    System.out.println("\nTime taken by table print = "+(end-start)+" ms\n");
  }
}

class Main
{
  public static void main(String args[]) {
    Array ob1 = new Array(9,8,7,6,5);
    Array ob2 = new Array(1,2,3,4,5);
    System.out.print("\nTraversing... ");
    for (int i=0;i<5;i++){
      ob1.traverse(ob1.x[i]);
    }
  }
}
