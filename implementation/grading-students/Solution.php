<?php

/*
 * Complete the 'gradingStudents' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY grades as parameter.
 */

function gradingStudents($grades) {
    
    $list = [];
    foreach ($grades as $studentGd){
        if($studentGd > 37 and ($studentGd % 5)>=3){
            $studentGd = intdiv($studentGd + 5, 5) * 5;
        }
        $list[] = $studentGd;  
    }
    return $list;
        
}