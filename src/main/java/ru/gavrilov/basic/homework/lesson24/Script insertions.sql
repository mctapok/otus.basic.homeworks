insert into students (name, lastname) values ('jack', 'sparrow');
insert into students (name, lastname) values ('alice', 'cooper');
insert into students (name, lastname) values ('jack', 'daniels');
insert into students (name, lastname) values ('paul', 'mccartney');
insert into students (name, lastname) values ('james', 'jameson');
insert into students (name, lastname) values ('amy', 'lee');

insert into selected_answers (student_id, question_id, answer_id, test_id) values (1, 1, 1, 1);
insert into selected_answers (student_id, question_id, answer_id, test_id) values (1, 2, 2, 1);

insert into tests (test_name) values ('test1');
insert into tests (test_name) values ('test2');

insert into questions (question_text, test_id) values ('question 1', 1);
insert into questions (question_text, test_id) values ('question 2', 1);

insert into answers (answer_text, question_id, is_correct) values ('answer 1', 1, true);
insert into answers (answer_text, question_id, is_correct) values ('answer 2', 1, false);
insert into answers (answer_text, question_id, is_correct) values ('answer 3', 1, false);
insert into answers (answer_text, question_id, is_correct) values ('answer 4', 1, false);
insert into answers (answer_text, question_id, is_correct) values ('answer 5', 1, false);
insert into answers (answer_text, question_id, is_correct) values ('answer 1', 2, false);
insert into answers (answer_text, question_id, is_correct) values ('answer 2', 2, false);
insert into answers (answer_text, question_id, is_correct) values ('answer 3', 2, true);
insert into answers (answer_text, question_id, is_correct) values ('answer 4', 2, false);
insert into answers (answer_text, question_id, is_correct) values ('answer 5', 2, false);