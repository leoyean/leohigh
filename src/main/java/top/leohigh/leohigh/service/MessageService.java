package top.leohigh.leohigh.service;

import org.springframework.transaction.annotation.Transactional;
import top.leohigh.leohigh.entity.Message;

import java.util.List;

@Transactional
public interface MessageService {

    /**
     * 保存
     * @param message Message对象
     * @return 操作结果
     */
    boolean save(Message message);

    /**
     * 更新
     * @param message Message对象
     * @return 操作结果
     */
    boolean update(Message message);

    /**
     * 根据id删除
     * @param id id
     * @return 操作结果
     */
    boolean delete(Integer id);

    /**
     * 根据id查询
     * @param id id
     * @return Message对象
     */
    Message getById(Integer id);

    /**
     * 查询所有
     * @return Message列表
     */
    List<Message> getAll();
}
