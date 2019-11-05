import com.example.tutorial.AddressBookProtos;

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

        }catch (Exception e){

        }
    }
}
