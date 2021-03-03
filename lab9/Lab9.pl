% Fact
instructor(perkowski, ee271).
instructor(perkowski, ee171).
instructor(perkowski, ee478).
enrolled(alan-cheng, ee475).
enrolled(matthew, ee171).
enrolled(alan-cheng,ee171).
enrolled(alan-cheng,ee271).
enrolled(chris-clark,ee271).
enrolled(edison-tsai, ee171).
enrolled(chris-clark, ee171).
% Rule
teaches(Professor, Student) :- instructor(Professor, Class), enrolled(Student, Class).
