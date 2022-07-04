# Java 变量类型
> 在Java语言中，所有的变量在使用前必须声明。声明变量的基本格式如下：

```java
type identifier [ = value][, identifier [= value] ...] ;
```
格式说明：type为Java数据类型。identifier是变量名。可以使用逗号隔开来声明多个同类型变量。
以下列出了一些变量的声明实例。注意有些包含了初始化过程。

```java
int a, b, c;         // 声明三个int型整数：a、 b、c
int d = 3, e = 4, f = 5; // 声明三个整数并赋予初值
byte z = 22;         // 声明并初始化 z
String s = "runoob";  // 声明并初始化字符串 s
double pi = 3.14159; // 声明了双精度浮点型变量 pi
char x = 'x';        // 声明变量 x 的值是字符 'x'。
```

Java语言支持的变量类型有：

- <strong>类变量</strong>：独立于方法之外的变量，用 static 修饰。
- <strong>实例变量</strong>：独立于方法之外的变量，不过没有 static 修饰。
- <strong>局部变量</strong>：类的方法中的变量。

实例：

```java
public class Variable{
    static int allClicks=0;    // 类变量
 
    String str="hello world";  // 实例变量
 
    public void method(){
 
        int i =0;  // 局部变量
 
    }
}
```
