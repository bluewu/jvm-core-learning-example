package org.jvmcore.stack;

/**
 * <Description> <br>
 *
 * @author WuYingge<br>
 * @version 1.0<br>
 * @taskId: <br>
 * @createDate 2020/05/08 4:00 下午 <br>
 * @see org.jvmcore.stack <br>
 */
class StringStr {
    private  String name = "jiji";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class StringTest{

    public static void main(String[] args) {
        StringStr str1 = new StringStr();
        StringStr str2 = new StringStr();

        System.out.println(str1.getName() == str2.getName());
    }
}

