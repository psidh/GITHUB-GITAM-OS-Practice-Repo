#include <stdio.h>

void bubbleSort(int arr[], int n) {
    int i, j, temp;
    for (i = 0; i < n-1; i++) {
        // Last i elements are already in place
        for (j = 0; j < n-i-1; j++) {
            if (arr[j] > arr[j+1]) {
                // Swap arr[j] and arr[j+1]
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}

int main() {
    int i;
    int arr[] = {64, 34, 25, 12, 22, 11, 90}; //you can also opt for user input
    int n = sizeof(arr)/sizeof(arr[0]);

    printf("Original array: ");
    for (i = 0; i < n; i++)
        printf("%d ", arr[i]);

    bubbleSort(arr, n);

    printf("\nSorted array: ");
    for (i = 0; i < n; i++)
        printf("%d ", arr[i]);

    return 0;
}
