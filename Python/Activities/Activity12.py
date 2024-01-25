def calculateSum(number):
    if number:
        return number + calculateSum(number - 1)
    else:
        return 0


Sum = calculateSum(10)

print(Sum)
