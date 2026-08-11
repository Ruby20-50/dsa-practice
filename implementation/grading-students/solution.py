def gradingStudents(grades):
    
    list = []
    for n in grades:
        if n > 37 and (n % 5) >= 3:
           n = ((n + 5) // 5) * 5
        list.append(n)
        
    return list