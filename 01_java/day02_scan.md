# CodeUp

### 1010~1027 :입출력

> 1010

```java
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.print(x);
    }
}
```

> 1011

```java
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char x = (char)scan.next().charAt(0);
        System.out.print(x);
    }
}
```

> 1012

```java
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float x;
		x = scan.nextFloat();
		System.out.printf("%.6f",x);
    }
}
```

> 1013

```java
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);   
        int x = scan.nextInt();
	    int y = scan.nextInt();
		System.out.printf("%d %d",x,y);         
    }
}
```

> 1014

```java
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char x = scan.next().charAt(0);
		char y = scan.next().charAt(0);
		System.out.printf("%c %c",y,x);
    }
}
```

> 1015

```java
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float x = scan.nextFloat();
		System.out.printf("%.2f", x);
    }
}
```

> 1017

```java
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.printf("%d %d %d",x,x,x);
    }
}
```

> 1018

```java
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
		System.out.printf("%s",a);
    }
}
```

> 1019

```java
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String x = scan.next();
		//입력한 내용 배열로 나눠서 저장(기준 :'.')
		String arr[] = x.split("\\.");
		int y = Integer.valueOf(arr[0]);
		int m = Integer.valueOf(arr[1]);
		int d = Integer.valueOf(arr[2]);
		System.out.printf("%04d.%02d.%02d", y,m,d);
    }
}
```

> 1020

```java
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String x = scan.next();
		//입력한 내용 배열로 나눠서 저장(기준 :'.')
		String arr[] = x.split("-");
		int y = Integer.valueOf(arr[0]);
		int m = Integer.valueOf(arr[1]);
		
		System.out.printf("%06d%07d", y,m);
    }
}
```

> 1021

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

> 1023

```java
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String x = scan.next();
		String arr[] = x.split("\\.");
		System.out.printf("%s\n%s", arr[0],arr[1]);
    }
}
```

> 1024

```java
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String x = scan.next();
		for(int i=0;i<x.length();i++) {
			System.out.println("'"+x.charAt(i)+"'");
		}
    }
}
```

> 1025

```java
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();//78945
		int a = x-x%10000;//70000
		System.out.println("["+a+"]");
		int aa = x-a;//8945
		int b = aa-aa%1000;//8000
		System.out.println("["+b+"]");
		int bb = aa-b;//945
		int c = bb-bb%100;//900
		System.out.println("["+c+"]");
		int cc = bb-c;
		int d = cc-cc%10;
		System.out.println("["+d+"]");
		int e = cc-d;
		System.out.println("["+e+"]");
    }
}
```

> 1026

```java
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String x = scan.next();
		String arr[] = x.split(":");
		int m = Integer.valueOf(arr[1]);
		System.out.print(m);
    }
}
```

> 1027

```java
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String x = scan.next();
		String arr[] = x.split("\\.");
		System.out.printf("%s-%s-%s",arr[2],arr[1],arr[0]);
    }
}
```

