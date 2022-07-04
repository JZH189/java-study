import java.util.Scanner;

public class demoScanner {
  /*
    步骤一：导包，需要写在class的上面
            import java.util.Scanner

    步骤二：创建对象
    Scanner sc = new Scanner(System.in)
      只有sc可以改变，其他属于固定格式
    
    步骤三： 使用变量接收数据
      int i = sc.nextInt();
      只有变量i可以改变，其他属于固定格式
  */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println(a);
  }
}