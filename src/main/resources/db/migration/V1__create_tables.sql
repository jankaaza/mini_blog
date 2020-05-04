create table blogs
(
    id      bigserial primary key,
    title    varchar,
    post_date     timestamp,
    description varchar
);

create table comments
(
    id      bigserial primary key,
    author    varchar,
    post_time   timestamp ,
    blog_comments varchar,
    blog_id bigint references blogs
);
create table authors
(
    id      bigserial primary key,
    name    varchar,
    bio    varchar,
    blog_id bigint references blogs

);
