# Login
一个用安卓实现的注册 登录界面

### 代码组成
Java部分

#### Code：验证码模块 参考了网络上的验证码生成方案

去除了易混淆的 数字 0 和 字母 o O 数字 1 和 字母 i I l L 数字 6 和 字母 b 数字 9 和 字母 q 字母 c C 和 G 字母 t （经常和随机线混在一起看不清）

随机数数组

    private static final char[] CHARS = {
            '2', '3', '4', '5',  '7', '8',
            'a',  'd', 'e', 'f', 'g', 'h', 'j', 'k', 'm',
            'n', 'p',  'r', 's',  'u', 'v', 'w', 'x', 'y', 'z',
            'A', 'B',  'D', 'E', 'F',  'H',  'J', 'K', 'M',
            'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    };
    
    
#### DBOpenhelper
    
声明一个AndroidSDK自带的数据库变量db
   
写一个这个类的构造函数，参数为上下文context，所谓上下文就是这个类所在包的路径
     
指明上下文，数据库名，工厂默认空值，版本号默认从1开始
      
super(context,"db_test",null,1);
      
把数据库设置成可写入状态，除非内存已满，那时候会自动设置为只读模式（现在的内存基本上满不了）
      
db = getReadableDatabase();
     
重写两个必须要重写的方法，因为class DBOpenHelper extends SQLiteOpenHelper
     
而这两个方法是 abstract 类 SQLiteOpenHelper 中声明的 abstract 方法
      
所以必须在子类 DBOpenHelper 中重写 abstract 方法
     
因为，一个数据库表，首先是要被创建的，然后免不了是要进行增删改操作的 所以就有onCreate()、onUpgrade()两个方法

查询表user全部内容的方法

查询出来的内容 需要有个容器存放，以供使用，

所以定义了一个ArrayList类的list

有了容器，然后从表中查询数据

这里使用游标Cursor，（数据库）
 
需要用Cursor的话，第一个参数："表名"，中间5个：null，（也不知道为什么 有待学习）

最后是查询出来内容的排序方式："name DESC"

写一个while循环，让游标从表头游到表尾

在游的过程中把游出来的数据存放到list容器中

#### loginActivity


      
      
