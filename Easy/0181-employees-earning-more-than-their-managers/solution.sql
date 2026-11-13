select e.name as employee from employee e join employee m on e.managerid=m.id and e.salary>m.salary;
