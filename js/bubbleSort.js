function bubbleSort(arr) {
  let n = arr.length;
  for (let i = 0; i < n - 1; i++) {
    for (let j = 0; j < n - i - 1; j++) {
      if (arr[j] > arr[j + 1]) {
        // Swap the elements
        let temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
      }
    }
  }
}

// Example of usage:
let arr = [64, 34, 25, 12, 22, 11, 90];
bubbleSort(arr);
console.log("Array sorted with Bubble Sort:", arr);
