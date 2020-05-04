alter table blogs
    add column author_id bigint references authors;
    alter table blogs
        add column comment_id bigint references comments;