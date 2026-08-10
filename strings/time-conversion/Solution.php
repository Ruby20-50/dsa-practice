<?php

/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

function timeConversion($s) {
    $hour = (int) substr($s, 0, 2);
    $restOfTime = substr($s, 2, 6);
    $timePeriod = $s[8];

    if($timePeriod === 'P'){
        if($hour != 12){
            $hour += 12;
        }
        
    }elseif($timePeriod === 'A'){
        if($hour == 12){
            $hour = 0;
        }
    }
    return sprintf("%02d%s", $hour, $restOfTime);
}
