insert into user_details(id,birth_date,name)
values(10001,current_date(), 'Sarah');

insert into user_details(id,birth_date,name)
values(10002,current_date(), 'Gui');

insert into user_details(id,birth_date,name)
values(10003,current_date(), 'Jessica');

insert into post(id, description, user_id)
values(20001,'Learn AWS', 10001);

insert into post(id, description, user_id)
values(20002,'Learn German', 10002);

insert into post(id, description, user_id)
values(20003,'Learn DevOps', 10001);

insert into post(id, description, user_id)
values(20004,'Learn React', 10002)