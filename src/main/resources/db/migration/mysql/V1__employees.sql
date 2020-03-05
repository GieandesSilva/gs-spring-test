CREATE TABLE `employees`
(
    `id`         bigint(20)   NOT NULL,
    `first_name`  varchar(255) NOT NULL,
    `last_name`   varchar(255) NOT NULL,
    `role`       varchar(60)  NOT NULL,
    `create_at`  TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_at` TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    `deleted_at` TIMESTAMP    NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

ALTER TABLE `employees`
    ADD PRIMARY KEY (`id`);

ALTER TABLE `employees`
    MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;