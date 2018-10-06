import java.util.*;
class Sort {
	Sort() {

	}

	public void iSort(Reservation[] a, int lo, int hi, Comparator comp) {
		int j = 0;
		for (int i = lo; i <= hi; i++) {
			Reservation temp = a[i];
			j = i - 1;
			while (j >= 0 && comp.compare(temp, a[j]) < 0) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = temp;
		}
	}

	// public void sSort(Reservation[] b, Comparator comp) {
	// 	int min = 0;
	// 	for (int i = 0; i < b.length; i++) {
	// 		min = i;
	// 		for (int j = i + 1; j < b.length; j++) {
	// 			if (comp.compare(b[min], b[j]) > 0) {
	// 				min = j;
	// 			}
	// 		}
	// 		Reservation temp = b[min];
	// 		b[min] = b[i];
	// 		b[i] = temp;
	// 	}
	// }
}