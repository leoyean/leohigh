package top.leohigh.leohigh.dao;

import org.apache.ibatis.annotations.*;
import top.leohigh.leohigh.entity.Message;

import java.util.List;

@Mapper
public interface MessageDao {

    @Insert("INSERT INTO tb_message (username, content) VALUES (#{username}, #{content})")
    int save(Message message);

    @Update("UPDATE tb_message SET username=#{username},content=#{content} WHERE id=#{id}")
    int update(Message message);

    @Update("UPDATE tb_message SET is_delete=1 WHERE id=#{id}")
    int delete(Integer id);

    @Select("SELECT id,username,content,create_time FROM tb_message WHERE is_delete=0 and id=#{id}")
    Message getById(Integer id);

    @Select("SELECT id,username,content,create_time FROM tb_message WHERE is_delete=0")
    List<Message> getAll();
}
