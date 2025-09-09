# medium-level

def is_armstrong_arith(num):
    total = 0
    temp = num
    power = len(str(num))  # we still need length for the exponent

    while temp > 0:
        digit = temp % 10
        total += digit ** power
        temp //= 10

    return total == num

number = int(input("Enter a number: "))

if is_armstrong_arith(number):
    print(f"{number} is an Armstrong number.")
else:
    print(f"{number} is not an Armstrong number.")
