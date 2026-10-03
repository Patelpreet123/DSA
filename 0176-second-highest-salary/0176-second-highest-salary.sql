# Write your MySQL query statement below
select(select distinct salary from Employee order by salary desc limit 1 offset 1) as SecondHighestSalary;

-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna