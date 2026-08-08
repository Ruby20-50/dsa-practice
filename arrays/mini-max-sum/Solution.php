<?php

 function miniMaxSum($arr) {
    $total = array_sum($arr);
    $minimum = min($arr);
    $maximum = max($arr);
    
    echo ($total - $maximum) . " " . ($total - $minimum);
}
