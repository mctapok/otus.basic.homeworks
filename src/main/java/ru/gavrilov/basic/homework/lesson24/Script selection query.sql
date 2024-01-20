select s.lastname, a.answer_text, a.is_correct, q.question_text, t.test_name from selected_answers sa
join students s on sa.student_id = s.student_id 
join answers a on sa.answer_id = a.answer_id 
join questions q on sa.question_id = q.question_id
join tests t on  sa.test_id = t.test_id 
