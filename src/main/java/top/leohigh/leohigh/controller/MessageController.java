package top.leohigh.leohigh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.leohigh.leohigh.entity.Message;
import top.leohigh.leohigh.service.MessageService;

import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageController {

    private final MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService){
        this.messageService = messageService;
    }

    @PostMapping
    public boolean save(@RequestBody Message message) {
        return messageService.save(message);
    }

    @PutMapping
    public boolean update(@RequestBody Message message) {
        return messageService.update(message);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        return messageService.delete(id);
    }

    @GetMapping("/{id}")
    public Message getById(@PathVariable Integer id) {
        return messageService.getById(id);
    }

    @GetMapping
    public List<Message> getAll() {
        return messageService.getAll();
    }
}

