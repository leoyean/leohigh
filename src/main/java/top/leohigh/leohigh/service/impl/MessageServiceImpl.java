package top.leohigh.leohigh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.leohigh.leohigh.dao.MessageDao;
import top.leohigh.leohigh.entity.Message;
import top.leohigh.leohigh.service.MessageService;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    private final MessageDao messageDao;

    @Autowired
    public MessageServiceImpl(MessageDao messageDao){
        this.messageDao = messageDao;
    }


    @Override
    public boolean save(Message message) {
        return messageDao.save(message) > 0;
    }

    @Override
    public boolean update(Message message) {
        return messageDao.update(message) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return messageDao.delete(id) > 0;
    }

    @Override
    public Message getById(Integer id) {
        return messageDao.getById(id);
    }

    @Override
    public List<Message> getAll() {
        return messageDao.getAll();
    }
}
