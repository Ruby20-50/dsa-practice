def timeConversion(s):
    hour = int(s[0:2])
    rest_of_time = s[2:8]
    time_period = s[8]
    
    if time_period == 'P':
        if hour != 12:
            hour += 12
    elif time_period == 'A':
        if hour == 12:
            hour = 0
    return f"{hour:02d}{rest_of_time}"