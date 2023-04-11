SELECT *
FROM   SYS.sql_modules sm 
       INNER JOIN SYS.objects o ON sm.object_id  = o.object_id 
WHERE  UPPER(sm.definition) LIKE ('%NE%')      
