set time_zone = 'Asia/Shanghai';

CREATE TABLE tb_message
(
    id          bigint       not null auto_increment,
    username    varchar(255) not null,
    content     varchar(255) not null,
    is_delete   tinyint(1)   not null default 0,
    create_time datetime(6)  not null default CURRENT_TIMESTAMP(6),
    update_time datetime(6)  not null default CURRENT_TIMESTAMP(6) on UPDATE CURRENT_TIMESTAMP(6),
    PRIMARY KEY (id)
);

INSERT INTO tb_message
    (username, content)
VALUES ('leo', 'welcome to my website'),
       ('ricki', 'Im coming');

# getAll
SELECT *
FROM tb_message
WHERE is_delete = 0;

# update
UPDATE tb_message
SET content='I\'m coming'
WHERE id = 2;

# delete
UPDATE tb_message
SET is_delete = 1
WHERE id = 2;
