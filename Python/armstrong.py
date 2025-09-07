# medium-level

def is_armstrong(num):
    # Convert number to string to get digits and length
    digits = str(num)
    power = len(digits)
    total = 0
    
    # Calculate sum of digits raised to the power
    for digit in digits:
        total += int(digit) ** power
    
    # Check if sum equals original number
    return total == num

# Example usage
number = 153
if is_armstrong(number):
    print(f"{number} is an Armstrong number.")
else:
    print(f"{number} is not an Armstrong number.")

# trying giving user input OR implement an approach other than this if you have any.