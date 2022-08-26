# CodeUp

### 1028~1030 :데이터형

> 1028

```java
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine();
        System.out.print(x);
    }
}
```

> 1029

```java
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
		System.out.printf("%.11f",x);
    }
}
```



### 1031~1037:출력변환

`10진수 이외의 2,8,16진수는 모두 String으로 입력 및 출력`

> 1031 : 10진수를 입력받아 8진수(octal)로 출력

```java
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
		String octal = Integer.toOctalString(x);//10진수->8진수
        //10진수->2진수 : Integer.toBinaryString(x);
		System.out.printf("%s",octal);
    }
}
```

> 1032 :  10진수를 입력받아 16진수(hex)로 출력

```java
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
		String hex = Integer.toHexString(x);//10진수->16진수
		System.out.printf("%s",hex);
    }
}
```

> 1033 :  10진수를 입력받아 16진수(대문자)로 출력

```java
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
		String hex = Integer.toHexString(x).toUpperCase();//소문자->대문자
		System.out.printf("%s",hex);
    }
}
```

> 1034 : 8진수로 입력된 정수를 10진수로 바꾸어 출력

```java
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //입력받는 8진수를 String으로 받아야한다.
        int decimal = Integer.parseInt(scan.nextLine(),8);//8진수->10진수
		System.out.printf("%s",decimal);
    }
}
```

> 1035 : 16진수로 입력된 정수를 8진수로 바꾸어 출력

```java
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int decimal = Integer.parseInt(scan.nextLine(),16);//16->10
        
        //solution1)
        System.out.printf("%o", decimal);//10->8로 표시
        //solution2)아예 8진수로 변경하여 출력해도 된다.
        String octal = Integer.toOctalString(decimal);//10->8
		System.out.printf("%s",octal);
    }
}
```

> 1036 : 영문자 1개를 입력받아 아스키 코드표의 10진수 값으로 출력

```java
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char ac = scan.next().charAt(0);//문자입력
		int num = (int)ac;//문자->정수
		System.out.print(num);
    }
}
```

> 1037 : 10진 정수 1개를 입력받아 아스키 문자로 출력

```java
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
		char ac = (char)num;//정수->문자
		System.out.print(ac);
    }
}
```
