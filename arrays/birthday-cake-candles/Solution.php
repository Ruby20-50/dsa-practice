<?php

function birthdayCakeCandles($candles) {
    $tllstCndl = 0;
    $count = 1;

    for($i = 0; $i < sizeof($candles); $i++){
        if($tllstCndl == $candles[$i])
            $count++;
        else if($tllstCndl < $candles[$i])
            $count = 1;
        $tllstCndl = max($tllstCndl, $candles[$i]);
    }

    return $count;


}
#alternative solution using built-in functions
function birthdayCakeCandlesAlt($candles) {
    return count(array_keys($candles, max($candles)));
}