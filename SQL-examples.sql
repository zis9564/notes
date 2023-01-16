--вывести список сотрудников, получающих больше зп чем руководитель
SELECT a.*
FROM employee a, employee d
WHERE b.id = a.chief.id
AND a.salary > b.salary
ORDER BY salary ASC.

--список сотрудников, полуающих максимальную зп в своем отделе
SELECT a.*
FROM employee
WHERE a.salary = (select max(salary) from employee b
                  where b.department_id = a.department_id)

--список отделов где кол-во сотрудников <= 3
SELECT department_id
FROM employee
GROUP BY department_id
HAVING COUNT (*) <= 3

--список сотрудников, не имеющих руководителя, работающего в том-же отделе
SELECT a.*
FROM employee a
LEFT JOIN employee b ON (b.id = a.cheif_id AND b.department_id = a.department_id)
WHERE b.id IS null

--список отделов с максимальной суммарной зп
WITH sum_salary AS (SELECT department_id, SUM(salary) FROM employee GROUP BY department_id)
SELECT department_id
FROM sum_salary a
WHERE a.salary = (SELECT MAX(salary) FROM sum_salary)

SELECT p.patient_id, p.first_name, p.last_name, d.doctor_id
FROM patients p
join admissions a ON a.patient_id = p.patient_id
JOIN doctors d ON a.attending_doctor_id = d.doctor_id
where doctor_id IS 2
order by p.patient_id

--вывести имя провинции с количеством пациентов
SELECT CONCAT(Name, "(", SUBSTRING(Occupation FROM 1 FOR 1), ")")
FROM OCCUPATIONS
ORDER BY Name ASC;
SELECT CONCAT("There are a total of ",COUNT(name)," ",LOWER(Occupation),"s.")
FROM OCCUPATIONS
GROUP BY Occupation
ORDER BY COUNT(name), OCCUPATIONS.Occupation ASC;