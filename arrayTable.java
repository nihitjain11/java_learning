class Array
{
  int x[] = new int[10];
  Array(int a,int b,int c,int d,int e,int f,int g,int h,int i,int j) {
    x[0] = a;
    x[1] = b;
    x[2] = c;
    x[3] = d;
    x[4] = e;
    x[5] = f;
    x[6] = g;
    x[7] = h;
    x[8] = i;
    x[9] = j;
  }
  void table(int k) {
    double start =  System.currentTimeMillis();
    for (int i=1;i<11;i++) {
      System.out.println(k+" * "+i+" = "+(k*i));
    }
    double end = System.currentTimeMillis();
    System.out.println("\nTime taken in printing above Table = "+(end-start)+" ms\n");
  }
}

class Main
{
  public static void main(String args[]) {
    double start =  System.currentTimeMillis();
    Array ob1 = new Array(1,2,3,4,5,6,7,8,9,10);
    System.out.println("\nTables... \n");
    for (int i=0;i<10;i++){
      ob1.table(ob1.x[i]);
    }
    double end = System.currentTimeMillis();
    System.out.println("\nCumulative time of Program Execution = "+(end-start)+" ms\n");
  }
}
