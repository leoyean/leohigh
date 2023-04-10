package top.leohigh.leohigh;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.leohigh.leohigh.dao.MessageDao;
import top.leohigh.leohigh.entity.Message;
import top.leohigh.leohigh.service.MessageService;

import java.util.List;

@SpringBootTest
class LeohighApplicationTests {

    @Autowired
    private MessageService messageService;

    @Test
    public void testGetById() {
        Message message = messageService.getById(1);
        System.out.println(message);
    }

    @Test
    public void testGetAll() {
        List<Message> messages = messageService.getAll();
        System.out.println(messages);
    }

    @Test
    public void testDelete() {
        boolean delete = messageService.delete(3);
        System.out.println(delete);
    }

}
