SELECT 
    E.unique_id, 
    Emp.name
FROM 
    Employees Emp
LEFT JOIN 
    EmployeeUNI E 
ON 
    Emp.id = E.id;