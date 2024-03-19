create table ingredients (calories integer not null, id integer not null auto_increment, nutriscore float(23) not null, name varchar(255), primary key (id)) engine=InnoDB;
create table recipes (id integer not null auto_increment, description varchar(255), image varchar(255), name varchar(255), time_to_make varchar(255), primary key (id)) engine=InnoDB;
create table recipes_ingredients (ingredients_id integer not null, recipe_id integer not null) engine=InnoDB;
alter table recipes_ingredients add constraint UK_nsmsbdni836dbjfepa4yxhjvx unique (ingredients_id);
alter table recipes_ingredients add constraint FKlvjx0n917c1o5h1f4uyswgpx7 foreign key (ingredients_id) references ingredients (id);
alter table recipes_ingredients add constraint FKk6ck14h7wqd90hbryml2g6fqk foreign key (recipe_id) references recipes (id);
create table ingredients (calories integer not null, id integer not null auto_increment, nutriscore float(23) not null, name varchar(255), primary key (id)) engine=InnoDB;
create table recipes (id integer not null auto_increment, description varchar(255), image varchar(255), name varchar(255), time_to_make varchar(255), primary key (id)) engine=InnoDB;
create table recipes_ingredients (ingredients_id integer not null, recipe_id integer not null) engine=InnoDB;
alter table recipes_ingredients add constraint UK_nsmsbdni836dbjfepa4yxhjvx unique (ingredients_id);
alter table recipes_ingredients add constraint FKlvjx0n917c1o5h1f4uyswgpx7 foreign key (ingredients_id) references ingredients (id);
alter table recipes_ingredients add constraint FKk6ck14h7wqd90hbryml2g6fqk foreign key (recipe_id) references recipes (id);