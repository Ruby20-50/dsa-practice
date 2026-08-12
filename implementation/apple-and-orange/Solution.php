<?php

/*
 * Complete the 'countApplesAndOranges' function below.
 *
 * The function accepts following parameters:
 *  1. INTEGER s
 *  2. INTEGER t
 *  3. INTEGER a
 *  4. INTEGER b
 *  5. INTEGER_ARRAY apples
 *  6. INTEGER_ARRAY oranges
 */

function countApplesAndOranges($s, $t, $a, $b, $apples, $oranges) {
    $ACount = 0;
    $OCount = 0;
    foreach ($apples as $m) {
        $m += $a;
        if( $m >= $s and $m <= $t){
            $ACount++;
        }
    }    
    foreach ($oranges as $n) {
        $n += $b;
        if( $n >= $s and $n <= $t){
            $OCount++;
        }
       
    }
    echo $ACount . "\n";
    echo $OCount;
}
