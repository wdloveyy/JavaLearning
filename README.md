# JavaLearning

my java learning repository



自增++、自减--、+=、-=、*=、/=运算不会改变变量本身的数据类型

逻辑运算符& 和 && 、|和|| 区别，&&和||是短路与和短路非

相同点：&和&&的运算结果相同；当符号左边是true时，都会执行符号右边的运算

不同点：当符号左边是false时，&继续执行右边的运算，&&不再执行右边的运算

实际开发中推荐使用&&



swatch-case：根据表达式的值，依次匹配各个case中的常量，如果匹配成功，则进入响应的case结构中，调用其执行语句，当调用完执行语句后，则仍然继续向下执行其他case结构中的执行语句，直到遇到break关键字或switch-case结构末尾结束。



for(;;)等同于while(true)



java中有带标签的break和continue，可以结束或跳过任意层的循环



java项目的源码都放到src文件夹下

报名的创建规则：以点分隔（一个点就相当于一个目录），项目域名的倒叙（如com.baidu），然后加功能/模块名称，例：com.baidu.contact，表示百度项目中contact功能模块

二维数组的默认值：

~~~ java
//第一种情况
int[][] arr=new int[3][4];
/*
*int[0]的初始化值为一个地址值
*int[0][0]的初始化值为0，也就是int的初始化值
*/

//第二种情况
int[][] arr1=new int[3][];
/*
*int[0]的初始化值为null
*int[0][0]会报错，因为这个时候第二维数组还没有被初始化
*/


~~~

java中的可变参数定义：

~~~ java
 /**
     * 可变参数方法
     */
    public void bariableArgTest(String ... strs){
        System.out.printf("可变的长度为："+strs.length);
    }
~~~





