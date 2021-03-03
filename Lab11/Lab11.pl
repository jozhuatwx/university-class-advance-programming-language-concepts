% q1
% rule
% List - [Head|Tail]
find(Target, [Target|_]).
find(Target, [_|Tail]) :- find(Target,Tail).

% q3
% facts
item(pen,9.9).
item(ruler,3.9).
item(bag,58.9).
item(testpad,11.2).

% rule
find(Threshold) :- item(Name, Price), Price < Threshold, write(Name).

% q4 - consider built-in reverse
rev(List, Result) :- reverse(List, Result).

% q5
sumlist([], 0).
sumlist([Head|Tail], Sum) :- sumlist(Tail, SumOfRest), Sum is Head + SumOfRest.
