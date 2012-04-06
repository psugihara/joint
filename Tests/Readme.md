Testing
=======

-----------------------------------------------------------------------------------------------------------
run_tests
---------
The "run_tests" script should run every test.
As tests are added, please modify this script.



------------------------------------------------------------------------------------------------------------
exp_test
---------
The "exp_test" script will allow user input testing.
Type in an expression after the script is run. Press enter. Type (ctrl+d) to signify EOF.
An error will be thrown if there is an error with the expression, otherwise the script will return nothing.
----------------
Passing Example:
----------------
$exp_test
3+4
EOF
$
----------------
Failing Example:
----------------
$exp_test
x = 10e3.2
EOF
line 1:8 extraneous input '.2' expecting LT 
$
--------------------------------------------------------------------------------------------------------------