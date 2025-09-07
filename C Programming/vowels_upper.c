#include <stdio.h>
#include <ctype.h>  // For toupper()

int main() {
    char str[100];
    int i = 0;

    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin);

    while (str[i] != '\0') {
        // Check if the character is a vowel (lowercase)
        if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || 
            str[i] == 'o' || str[i] == 'u') {
            str[i] = toupper(str[i]);  // Convert to uppercase
        }
        i++;
    }

    printf("String after converting vowels to uppercase: %s", str);

    return 0;
}

//try to do it without toupper() and submit a pull request :)