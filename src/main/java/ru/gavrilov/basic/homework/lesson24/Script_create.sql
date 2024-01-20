create table students(
	student_id serial4 not null primary key,
	name varchar(255) not null,
	lastname varchar(255) not null
);

create table tests(
	test_id serial4 not null primary key,
	test_name varchar(255) not null
);

create table questions(
	question_id serial4 not null primary key,
	question_text text not null,
	test_id int not null,
	constraint questions_fk foreign key(test_id) references tests(test_id)
);

create table answers(
	answer_id serial4 not null primary key,
	answer_text text not null,
	question_id int not null,
	is_correct boolean not null,
	constraint answers_fk foreign key(question_id) references questions(question_id)
);


create table selected_answers(
 	selected_id serial4 not null primary key,
 	student_id int references students(student_id),
 	question_id int references questions(question_id),
 	answer_id int references answers(answer_id)
);

drop table results, selected_answers, answers


	
