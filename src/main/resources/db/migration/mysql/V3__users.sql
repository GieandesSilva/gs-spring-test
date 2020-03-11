CREATE TABLE users
(
    id         bigint       NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name       varchar(255) NOT NULL,
    email      varchar(255) NOT NULL UNIQUE,
    password   varchar(255) NOT NULL,
    create_at  TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    deleted_at TIMESTAMP    NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;