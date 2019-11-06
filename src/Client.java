import com.example.tutorial.AddressBookProtos;
import com.example.tutorial.BaseMqDtoUtils;
import com.google.protobuf.util.JsonFormat;

import java.io.*;
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
            //byte[] byteArray1 = person.toByteArray();
            //转成字节数组输出
            //System.out.println(Arrays.toString(byteArray1));
            //反序列化
            //System.out.println(AddressBookProtos.Person.parseFrom(byteArray1));

            //转成json//要引入gson-2.8.6.jar
            //System.out.println(JsonFormat.printer().print(person));

            //通过文件写出到磁盘
            //FileOutputStream fileOutputStream = new FileOutputStream(new File("./hello"));
            //person.writeTo(fileOutputStream);

            //通过文件读取磁盘中的数据
            //FileInputStream fileInputStream  = new FileInputStream(new File("./hello"));
            //System.out.println(AddressBookProtos.Person.parseFrom(fileInputStream));

            //将字节写入文件中
            //FileOutputStream fileOutputStream = new FileOutputStream(new File("byte-save"));
            //fileOutputStream.write(person.toByteArray());

            //将字节重文件中读取出来
            //FileInputStream fileInputStream = new FileInputStream(new File("byte-save"));
            //byte[] bytes = new byte[1024];
            //int lent = fileInputStream.read(bytes);这个要刚好才能读取数据，否则不能读取（就1024=lent时）
            //System.out.println(lent);
            //AddressBookProtos.Person personResult = AddressBookProtos.Person.parseFrom(bytes);
            //System.out.println(personResult);

            //OutputStream outputStream = new FileOutputStream("byte1-save");
            //ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            //person.writeDelimitedTo(byteArrayOutputStream);
            //byteArrayOutputStream.writeTo(outputStream);

            //InputStream inputStream = new FileInputStream("byte1-save");
            //byte[] bytes = new byte[1024];
            //int lent = inputStream.read(bytes);
            //ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes,0,lent);
            //System.out.println(AddressBookProtos.Person.parseDelimitedFrom(byteArrayInputStream));

            BaseMqDtoUtils.BaseMqDto baseMqDto = BaseMqDtoUtils.BaseMqDto.newBuilder().setAction(1).setData("hello").build();
            System.out.println(baseMqDto);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
