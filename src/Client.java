import com.example.tutorial.AddressBookProtos;
import com.google.protobuf.util.JsonFormat;

import java.util.Arrays;

/**
 * @author chenjianhui on 2019/11/05
 */
public class Client {

    public static void main(String[] args) {
        try {
            AddressBookProtos.Person person = AddressBookProtos.Person.newBuilder()
                    .setName("jeffchan")
                    .setId(11)
                    .setEmail("23333@qq.com").build();

            //把 person消息类对象 序列化为 byte[]字节
            byte[] byteArray1 = person.toByteArray();
            //转成字节数组输出
            System.out.println(Arrays.toString(byteArray1));
            //反序列化
            System.out.println(AddressBookProtos.Person.parseFrom(byteArray1));

            //转成json//要引入gson-2.8.6.jar
            System.out.println(JsonFormat.printer().print(person));
        }catch (Exception e){

        }
    }
}
