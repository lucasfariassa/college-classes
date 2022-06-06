package class13.SearchingAlgorithms;

public class BinarySearch {
	int vector[] = { 1, 10, 5, 42, 38, 19, 51, 24 };
	int min = 0, max = vector.length, mid;
	OrdenationMethods om = new OrdenationMethods();
	
	public String binSearch(int number) {
		om.insertionSort(vector);
		om.currentVector(vector);
		for (int i = 0; mid != number; i++) {
			if (vector[mid] == number) {
				return "N�mero " + vector[mid] + " encontrado no �ndice: " + mid;
			} else if(i != vector.length) {
				min = mid + 1;
			}
			mid = (min + max) / 2;
		}
		return "N�mero n�o encontrado!";
	}
	
	public String binSearchUnsorted(int number) {
		om.currentVector(vector);
		for (int i = 0; mid != number; i++) {
			if (vector[mid] == number) {
				return "N�mero " + vector[mid] + " encontrado no �ndice: " + mid;
			} else if(i != vector.length) {
				min = mid + 1;
			}
			mid = (min + max) / 2;
		}
		return "N�mero n�o encontrado!";
	}
}
