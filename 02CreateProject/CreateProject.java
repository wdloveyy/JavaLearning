import com.wangdong.basic.oop.Student;

public class CreateProject {
    public static void main(String[] args) {
        /*String[] strArray = {"liming", "danni", "zhanni"};
        for (String s : strArray) {
            System.out.println(s);
        }*/

        //带标签的break和continue
        /*
        *带标签的break：跳出循环到标签处，并继续执行循环后面的语句
        *带标签的continue：跳过本次循环，继续执行标签处的下次循环
        *//*
        Lable_out:
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                if (j == 3) {
//                    break;
//                    continue;
//                    break Lable_out;
                    continue Lable_out;
                }
                System.out.print("" + i + j + " ");
            }
            System.out.println();
        }*/

        Student stu=new Student();
        stu.bariableArgTest("a","b","c","d");




    }
}