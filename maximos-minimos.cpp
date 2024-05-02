#include <iostream>
#include <vector>
#include <ctime>
#include <cstdlib>
#include <climits>
 std::vector<int> generateRandomList(int n) {
    std::vector<int> randomList;
    for (int i = 0; i < n; ++i) {
        randomList.push_back(rand() % 201 - 100); // Genera números aleatorios en el rango [-100, 100]
    }
    return randomList;
}
int findMin(const std::vector<int>& arr) {
    int minVal = INT_MAX;
    for (int i = 0; i < arr.size(); ++i) {
        if (arr[i] < minVal) {
            minVal = arr[i];
        }
    }
    return minVal;
}
int findMax(const std::vector<int>& arr) {
    int maxVal = INT_MIN;
    for (int i = 0; i < arr.size(); ++i) {
        if (arr[i] > maxVal) {
            maxVal = arr[i];
        }
    }
    return maxVal;
}
 
std::vector<int> sumLists(const std::vector<int>& arr1, const std::vector<int>& arr2) {
    std::vector<int> sumResult;
    for (int i = 0; i < arr1.size(); ++i) {
        sumResult.push_back(arr1[i] + arr2[i]);
    }
    return sumResult;
}
int main() {
    srand(time(0)); // Semilla para números aleatorios
    std::vector<int> list1 = generateRandomList(10);
    std::vector<int> list2 = generateRandomList(10);
    std::cout << "Lista 1: ";
    for (int i = 0; i < list1.size(); ++i) {
        std::cout << list1[i] << " ";
    }
    std::cout << std::endl;
    std::cout << "Lista 2: ";
    for (int i = 0; i < list2.size(); ++i) {
        std::cout << list2[i] << " ";
    }
    std::cout << std::endl;
    std::cout << "El minimo de lista 1 es " << findMin(list1) << std::endl;
    std::cout << "El minimo de lista 2 es " << findMin(list2) << std::endl;
    std::cout << "El maximo de lista 1 es " << findMax(list1) << std::endl;
    std::cout << "El maximo de lista 2 es " << findMax(list2) << std::endl;
    std::vector<int> sumResult = sumLists(list1, list2);
    std::cout << "Listas sumadas: ";
    for (int i = 0; i < sumResult.size(); ++i) {
        std::cout << sumResult[i] << " ";
    }
    std::cout << std::endl;
 
    clock_t startTime = clock();
    // Código a medir el tiempo
    clock_t endTime = clock();
    std::cout << "Execution time: " << (double)(endTime - startTime) / CLOCKS_PER_SEC << " seconds" << std::endl;
    return 0;
}
