CREATE TABLE user_role
(
    id         bigint    NOT NULL AUTO_INCREMENT PRIMARY KEY,
    user_id    bigint    NOT NULL,
    role_id    bigint    NOT NULL,
    create_at  TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    deleted_at TIMESTAMP NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

ALTER TABLE user_role
    ADD FOREIGN KEY (user_id) REFERENCES users (id);
ALTER TABLE user_role
    ADD FOREIGN KEY (role_id) REFERENCES roles (id);